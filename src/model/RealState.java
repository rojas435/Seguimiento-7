package model;

public class RealState{
    public static final int TOTAL_BUILDINGS = 100;

    public static final int TOTAL_OWNERS = 100;
    public static final int TOTAL_TENANTS = 100;

    private Building[] buildings;
    

    public RealState(){
        buildings = new Building[TOTAL_BUILDINGS];
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

    /* 
    public String addPerson(int typeOfDocument, ){

    }
    */
}