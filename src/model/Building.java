package model;
public class Building {

    private String id;
    private String direction;
    
    private Apartment[] apartments;

    public Building(String id, int apartmentQuantity, String direction){
        this.id = id;
        this.direction = direction;
        this.apartments = new Apartment[apartmentQuantity];
    }
    
    public String getId(){
        return id;
    }
    
}
