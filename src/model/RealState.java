package model;
public class RealState{
    public static final int TOTAL_BUILDINGS = 5;

    public static final int TOTAL_PEOPLE = 20;
    

    private Building[] buildings;
   
    private User[] users;

    
    public RealState(){
        buildings = new Building[TOTAL_BUILDINGS];
        users = new User[TOTAL_PEOPLE];
    }

    public String addBuilding(String id, int apartmentQuantity, String direction){
        String msj = "Se creo el edificio";
        boolean isEmpty = false;
        for(int i = 0; i<TOTAL_BUILDINGS && !isEmpty; i++){
            if(buildings[i] == null){
                buildings[i] = new Building(id, apartmentQuantity,direction);
                isEmpty = true;
            }
        }
        return msj;
    }

    public Apartment searchApartment(String idApa,String id){
        Apartment apartment = null;
        boolean isFound = false;
        for(int i = 0; i < TOTAL_BUILDINGS && !isFound; i++){
            if(buildings[i] != null && buildings[i].getId().equalsIgnoreCase(id)){
                apartment = buildings[i].searchApartment(idApa);
                isFound = true;
            }
        }
        return apartment;
    }
     
    public String buildingAvailability(){
        String msj = "Posicion Disponible";
        if(buildings[0]== null){
            msj = "No hay edificios registrados";
        }else if(buildings[TOTAL_BUILDINGS-1] != null){
            msj = "Limite de apartamentos alcanzado";
        }
        return msj;
    }
    
    public String addApartment(String id,String idApa, int nRooms, int nBathRooms, boolean balcony, double rent){
        String msj = "Se ha creado exitosamente";
        for(int i = 0; i<buildings.length; i++){
            if(buildings[i] != null && buildings[i].getId().equalsIgnoreCase(id)){
                buildings[i].addApartment(idApa, nRooms, nBathRooms, balcony, rent);
            }
        }
        return msj;
    }
    
    
    public Building searchBuilding(String id){
        Building building = null;
        for(int i = 0; i<TOTAL_BUILDINGS; i++){
            if(buildings[i] !=null && buildings[i].getId().equalsIgnoreCase(id)){
                building = buildings[i];
            }
        }
        return building;
    }
        
    public String addPerson(String id,String idApa,int typeOfDocument,int document, String name, String phone, int typeOfPhone, int accountNumber, String bankAccount){
        String msj = "Se ha agregado una persona exitosamente";
        boolean isEmpty = false;
        Owner person = null;
        for(int i  = 0; i < TOTAL_PEOPLE && !isEmpty; i++){
            if(users[i] ==null){
                person = new Owner(typeOfDocument, document,name,phone,typeOfPhone,accountNumber,bankAccount);
                users[i] = person;
            }
        }
        boolean isFound = false;
        for(int i = 0; i < TOTAL_BUILDINGS && !isFound; i++){
            if(buildings[i] != null && buildings[i].getId().equalsIgnoreCase(id)){
                buildings[i].addUserToApartment(person,idApa);
                isFound = true;
            }
        }
        return msj;
    }

    public String addPerson(String id,String idApa,int typeOfDocument,int document, String name, String phone, int typeOfPhone){
        String msj = "Se ha agregado una persona exitosamente";
        boolean isEmpty = false;
        Tenant person = null;
        for(int i  = 0; i < TOTAL_PEOPLE && !isEmpty; i++){
            if(users[i] ==null){
                person = new Tenant(typeOfDocument, document,name,phone,typeOfPhone);
                users[i] = person;
            }
        }
        boolean isFound = false;
        for(int i = 0; i < TOTAL_BUILDINGS && !isFound; i++){
            if(buildings[i] != null && buildings[i].getId().equalsIgnoreCase(id)){
                buildings[i].addUserToApartment(person,idApa);
                isFound = true;
            }
        }
        return msj;
    }

    public User searchUser(int document){
        User user = null;
        boolean isFound = false;
        for(int i = 0; i<TOTAL_PEOPLE && !isFound; i++){
            if(users[i] != null && users[i].getDocument() == document){
                user = users[i];
                isFound = true;
            }
        }
        return user;
    }
    public String listApartments(String id){
        String msj = "";
        boolean isFound = false;
        for(int i = 0; i<TOTAL_BUILDINGS && !isFound; i++){
            if(buildings[i] != null && buildings[i].getId().equalsIgnoreCase(id)){
                msj = buildings[i].listApartments();
            }
        }
        return msj;
    }
    public String monthlyValue(String idApa){
        String msj = "";
        boolean isFound = false;
        for(int i = 0; i<TOTAL_BUILDINGS && !isFound; i++){
            if(buildings[i] !=  null && buildings[i].getId().equalsIgnoreCase(idApa)){
                msj += buildings[i].monthlyValue();
                isFound = true;
            }
        }
        return msj;
    }
     
    public String checkAvailability(String id, String idApa){
        String msj = "Este apartamento no esta disponible.";
        boolean isFound = false;
        for(int i = 0; i<TOTAL_BUILDINGS && !isFound; i++){
            if(buildings[i] != null && buildings[i].getId().equalsIgnoreCase(id)){
                isFound = true;
                if(buildings[i].checkAvailability(idApa)){
                    msj ="Este apartamento si esta disponible.";
                }
            }
        }
        return msj;
    }
    
    public String apartmentsCounter(String name){
        String msj = "Esta es la cantidad de apartamentos que tiene esta persona: ";
        int counter = 0;
        for(int i = 0; i<TOTAL_BUILDINGS; i++){
            if(buildings[i] != null){
                counter+= buildings[i].apartmentsCounter(name);
            }
            
        }
        msj+= counter;
        return msj;
    }

    

    
}