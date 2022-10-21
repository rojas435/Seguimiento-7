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
                "3. Registro de tesoros a un nivel\n"+
                "4. Modificar puntaje de un jugador\n"+
                "5. Incrementar nivel de jugaddor\n"+
                "6. Informar tesoros y de enemigos de un nivel\n"+
                "7. Informar cantidad de un tesoro en todo el juego\n"+
                "8. Informar cantidad de enemigos de un tipo en todo el juegol\n"+ 
				"9. Informar el tesoro mas repetido de todos los niveles\n"+
                "10. Informar el enemigo que otorga mayor puntaje y en el nivel que se ubica\n"+
                "11. Informar la cantidad de consonantes en los nombres de los enemigos\n"+
                "12. Informar top 5 jugadores\n"+
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
                            System.out.println("Dime el numero de apartamentos que va tener este edificio");
                            int apartmentQuantity = reader.nextInt();
                            reader.nextLine();
                            System.out.print("Dime la direccion donde va estar ubicado este edificio");
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
                        
                    case 9:
                        break;

                    case 10:
                        break;
                    
                    case 11:
                        break;
                        
                    case 12:
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

