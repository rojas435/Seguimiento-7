package ui;
import model.*;
import java.util.Scanner;

public class Main {
    private Scanner reader;
	private RealState controller;

	public Main() {
		reader = new Scanner(System.in); 
		controller = new RealState();

	}

	public static void main(String[] args) {
			Main main = new Main(); 

			int option = -1; 
			do{
				option = main.getOptionShowMenu(); 
				main.executeOption(option);

			}while(option != 0);

		}

	public Scanner getReader() {
		return this.reader;
	}

	public void setReader(Scanner reader) {
		this.reader = reader;
	}

	public int getOptionShowMenu(){
			int option = 0; 
			printMenu();

			option = validateIntegerOption(); 

			return option; 
	}

	public void printMenu(){
			System.out.print(
                "\n<<<<< Welcome to the Game >>>>>\n"+	
                "1. Crear Edificio\n"+
                "2. Crear Apartamentos\n"+
                "3. Crear Usuario\n"+
                "4. Consultar cuantos apartamentos hay disponibles en un determinado edificio\n"+
                "5. Consultar el valor mensual total a recibir por los apartamentos que se encuentran alquilados en un edificio\n"+
                "6. La app debe permitir consultar si un apartamento particular se encuentra disponible\n"+
                "7. consultar la cantidad de apartamentos que tiene arrendados una persona particular\n"+ 
				"8. Consultar el valor total por arrendamiento\n"+
				"0. Exit. \n"+
				"Opcion: ");  
	}
        //sout 
		public void executeOption(int option){

				switch(option){
					case 1:
                        reader.nextLine();
                        System.out.print("Dime un identificador para este edicio: ");
                        String id = reader.nextLine();
                        if(controller.searchBuilding(id)!=null){

                            System.out.println("Error, ese id ya existe");

                        }else{
                            System.out.println("Dime el numero de apartamentos que va tener este edificio: ");
                            int apartmentQuantity = reader.nextInt();
                            reader.nextLine();
                            System.out.print("Dime la direccion donde va estar ubicado este edificio: ");
                            String direction = reader.nextLine();

                            System.out.println(controller.addBuilding(id, apartmentQuantity, direction));
                        }
                        break;
					case 2:
						break;

					case 3:
						break;

                    case 4:
                        break;

                    case 5:
                        break;

                    case 6:
                        break;
                        
                    case 7:
                        break;

                    case 8:
                        break;
                        
					case 0: 
						System.out.println("Exit program.");
						break; 

					default: 
						System.out.println("Invalid Option");
						break; 
				}
		}
	
	/**
	 * @param: Option that gives the user
	 * @return: Validates the option and if the user gives a number that doesnt exist will give (Invalid Option) or even with letters (Invalid Option)
	 */	
	public int validateIntegerOption(){
			int option = 0; 

			if(reader.hasNextInt()){
				option = reader.nextInt(); 
			}
			else{
				// clear reader. 
				reader.nextLine(); 
				option = -1; 
			}

			return option; 
		}
}

