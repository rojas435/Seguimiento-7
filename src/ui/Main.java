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
		// != si encontro algo, si existe y si es == null es por que no existe
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
								if(controller.searchApartment(idApa, id) != null){
									System.out.println("Error, este id ya existe");
								}else{
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
						}
						break;

					case 3:
						System.out.println("");
						System.out.print("\nSelecciona tipo de identificacion: " +
						"\n1.Cedula"+
						"\n2.Extranjero"+
						"\n3.Nit"+
						"\n4.Tarjeta de identidad"+
						"\nOpcion: ");
						int type = reader.nextInt();
						reader.nextLine();
						System.out.print("Dime tu nombre: ");
						String name = reader.nextLine();
						
						System.out.println("Dime tu numero de telefono: ");
						int phone = reader.nextInt();

						System.out.print("\nSelecciona tu tipo de telefono: "+
						"\n1.Home"+
						"\n2.Office"+
						"\n3.Movil"+
						"\n4.Family"+
						"\n5.Other"+
						"\nOpcion: ");
						int typeOfPhone = reader.nextInt();

						System.out.print("Dime el numero de documento: ");
						int document = reader.nextInt();

						if(controller.searchUser(document)==null){
							System.out.println("\nDime que tipo de persona eres"+
							"\n1.Dueño"+
							"\n2.Arrendatario"+
							"\n Opcion: ");
							type = reader.nextInt();
							reader.nextLine();
							switch(type){
								case 1:
									System.out.println("Dime el numero de cuenta: ");
									int accountNumber = reader.nextInt();
									System.out.println("Dime el nombre del banco");
									String bankAccount = reader.nextLine();
									System.out.println(controller.addPerson(type,document,name,phone,typeOfPhone,accountNumber,bankAccount));
									break;
								case 2:
									System.out.println(controller.addPerson(type,document,name,phone,typeOfPhone));
									break;	
							}
						}
						
						





						break;
                    case 4:
						if(controller.buildingAvailability().equals("No hay edificios registrados")){
							System.out.println(controller.buildingAvailability());
						}else{
							System.out.println("Por favor dime el Id del edificio que deseas consultar");
							id =reader.nextLine();
							System.out.println();
						}
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

