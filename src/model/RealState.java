package model;

public class RealState{
    public static final int TOTAL_BUILDINGS = 100;
    

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
    public Building searchBuilding(String id){
        Building building = null;
        for(int i = 0; i<TOTAL_BUILDINGS; i++){
            if(buildings[i] !=null && buildings[i].getId().equalsIgnoreCase(id)){
                building = buildings[i];
            }
        }
        return building;
    }
}