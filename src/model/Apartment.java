package model;
public class Apartment {
    private String idApa;
    private int numRooms;
    private int numBathRooms;
    private boolean balcony;
    private double rent;
    private boolean availability;
    

    public Apartment(String idApa,int numRooms, int numBathRooms, boolean balcony, double rent){
        this.idApa = idApa;
        this.numRooms = numRooms;
        this.numBathRooms = numBathRooms;
        this.balcony = balcony;
        this.rent = rent;
    }

    public String getIdApa() {
        return idApa;
    }

    public void setIdApa(String idApa) {
        this.idApa = idApa;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public int getNumBathRooms() {
        return numBathRooms;
    }

    public void setNumBathRooms(int numBathRooms) {
        this.numBathRooms = numBathRooms;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Object getId() {
        return null;
    }
}
