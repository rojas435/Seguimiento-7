package model;

public abstract class Mammal extends Animal {
    protected String name;

    public Mammal(int years, double weight, double height,String name){
        super(years, weight, height);
        this.name = name;
    }

   public String getName(){
        return this.name;
    }
    
}
