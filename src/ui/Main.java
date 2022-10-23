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
                            System.out.print("Dime el numero de apartamentos que va tener este edificio: ");
                            int apartmentQuantity = reader.nextInt();
                            reader.nextLine();
                            System.out.print("Dime la direccion donde va estar ubicado este edificio: ");
                            String direction = reader.nextLine();

                            System.out.println(controller.addBuilding(id, apartmentQuantity, direction));
                        }
                        break;
					case 2:
						if(controller.buildingAvailability().equals("No hay edificios registrados")){
							System.out.println(controller.buildingAvailability());
						}else{
							reader.nextLine();
							System.out.println("Dime el Id del edifcio para agregar este apartamento");
							id = reader.nextLine();
							if(controller.searchBuilding(id) == null){
								System.out.println("Error, ese eficio no existe");
							}else{
								System.out.println("Dime el Id para este apartamento");
								String idApa = reader.nextLine();
								System.out.println("Dime el numero de cuartos");
								int nRooms = reader.nextInt();
								System.out.println("Dime el numero de baños");
								int nBathRooms = reader.nextInt();
								reader.nextLine();
								System.out.println("Dime si este apartamento tendra balcon (Y/N)");
								String balconyOption = reader.nextLine();
								boolean balcony = true;
								while (!balconyOption.equalsIgnoreCase("Y") && !balconyOption.equalsIgnoreCase("N")){
									if(balconyOption.equalsIgnoreCase("Y")){
										balcony = true;
									}else if(balconyOption.equalsIgnoreCase("N")){
										balcony = false;
										
									}else{
										System.out.println("Opcion Invalida, intentalo nuevamente");
										balconyOption = reader.nextLine();
									}	
								} 
								
								System.out.println("Dime el valor de arrendamiento de este apartamento");
								double rent = reader.nextDouble();
								System.out.println(controller.addApartment(id,idApa,nRooms,nBathRooms,balcony,rent));
							}
						}
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

