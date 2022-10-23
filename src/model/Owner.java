package model;

public abstract class Owner extends User {

    public Owner(int typeOfDocument,int document, String name, int phone, int typeOfPhone, int accountNumber, String bankAccount){
        super(typeOfDocument,document,name, phone, typeOfPhone,accountNumber,bankAccount);
    }
}
