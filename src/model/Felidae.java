package model;

public abstract class Felidae extends Mammal{

    private boolean isDomestic;
    private Species species;

    public Felidae(int years, double weight, double height,String name,boolean isDomestic, int species){
        super(years,weight,height,name);

        switch(species){
            case 1:
                this.species = Species.LION;
                break;

            case 2:
                this.species = Species.CAT;
                break;

            case 3:
                this.species = Species.TIGER;
                break;    
        }

    }
    public boolean getIsDomestic(){
        return isDomestic;
    }

    public void setIsDomestic(boolean isDomestic){
        this.isDomestic = isDomestic;
    }
    public Species getSpecies(){
        return species;
    }
    public void setSpecies(int species){
        switch(species){
            case 1:
                this.species = Species.LION;
                break;

            case 2:
                this.species = Species.CAT;
                break;

            case 3:
                this.species = Species.TIGER;
                break;    
        }
    }
    

}
