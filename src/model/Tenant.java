package model;

public final class Tenant extends User {

    public Tenant(int typeOfDocument,int document, String name, String phone, int typeOfPhone){
        super(typeOfDocument,document,name,phone,typeOfPhone);

    }

    public String getName(){
        String name = super.getName();
        return name;
    }
    
}
