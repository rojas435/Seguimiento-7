package model;

public final class Human extends Mammal {

    
    public Human(int years, double weight, double height,String name) { //Aqui solo iria los atributos heredados mas nuevos que solo son de esta clase
        super(years, weight, height,name); // Solo los heredados
    }

    @Override
    public String toString(){
        return "Name of human:" + getName();
    }
}
