package model;

//private: A nivel de clase, visibilidad 
//public: todas las clases acceso total
//protected: Dentro de la jerarquia de clase

public abstract class Animal {
    private int years;
    private double height;
    private double weight;

   
    public Animal(int years, double weight, double height){
        this.years = years;
        this.weight = weight;
        this.height = height;
    }


    public int getYears(){
        return years;
    }
    public void setYears(int years){
        this.years = years;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    
}
