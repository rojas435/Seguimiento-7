package model;
public class Apartment {
    private String idApa;
    private int numRooms;
    private int numBathRooms;
    private boolean balcony;
    private double rent;

    public Apartment(String idApa,int numRooms, int numBathRooms, boolean balcony, double rent){
        this.idApa = idApa;
        this.numRooms = numRooms;
        this.numBathRooms = numBathRooms;
        this.balcony = balcony;
        this.rent = rent;
    }
}
