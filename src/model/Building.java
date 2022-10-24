package model;

import java.util.Arrays;

public class Building {

    private String id;
    private String direction;
    
    private Apartment[] apartments;

    public Building(String id, int apartmentQuantity, String direction){
        this.id = id;
        this.direction = direction;
        this.apartments = new Apartment[apartmentQuantity];
    }

    public void addApartment(String idApa, int nRooms, int nBathRooms, boolean balcony, double rent){
        boolean isEmpty = false;
        for(int i = 0; i<apartments.length && !isEmpty; i++){
            if(apartments[i] == null){
                apartments[i] = new Apartment(idApa,nRooms,nBathRooms,balcony,rent);
                isEmpty = true;
            }
        }
    }
     
    public String listApartments(){
        String msj ="Apartamentos: ";
        int counter = 0;
        for(int i = 0; i < apartments.length; i++){
            if(apartments[i] != null && apartments[i].getTenant()==null){
                counter ++;
            }
        }
        msj +=counter;
        return msj;
    }
    
    

    //AQUI TENGO QUE PONER EL searchApartment
    public Apartment searchApartment(String idApa){
        Apartment apartment = null;
        for(int i = 0; i < apartments.length; i++){
            if(apartments[i] != null && apartments[i].getIdApa().equalsIgnoreCase(idApa)){
                apartment = apartments[i];
            }
        }
        return apartment;
    }
    public void addUserToApartment(Owner person,String idApa){
        for(int i = 0; i<apartments.length; i++){
            if(apartments[i]!=null && apartments[i].getIdApa().equalsIgnoreCase(idApa)){
                apartments[i].setOwner(person);
            }
        }
    }

    public void addUserToApartment(Tenant person,String idApa){
        for(int i = 0; i<apartments.length; i++){
            if(apartments[i]!=null && apartments[i].getIdApa().equalsIgnoreCase(idApa)){
                apartments[i].setTenant(person);
            }
        }
    }


    
    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public Apartment[] getApartments() {
        return apartments;
    }
    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "Building [id=" + id + ", direction=" + direction + ", apartments=" + Arrays.toString(apartments) + "]";
    }
    
    
}
