package model;

public abstract class Bird extends Animal{
    protected double wingSpan;

    public Bird(int years, double weight, double height,double wingSpan){
        super(years,weight,height);
        this.wingSpan = wingSpan;
    }
    public void setWingSpan(double wingSpan){
        this.wingSpan = wingSpan;
    }
}
