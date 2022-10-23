package model;

import java.lang.ProcessBuilder.Redirect.Type;

public abstract class User {
    private TypeOfDocument typeOfDocument;
    private int document;
    private String name;
    private int phone;
    private TypeOfPhone typeOfPhone;
    private int accountNumber;
    private String bankAccount;
    
    public User(int typeOfDocument,int document, String name, int phone, int typeOfPhone, int accountNumber, String bankAccount){
        this.document = document;
        this.name = name;
        this.phone = phone;
        this.accountNumber = accountNumber;
        this.accountNumber = accountNumber;

        switch(typeOfDocument){
            case 1:
            this.typeOfDocument = TypeOfDocument.CEDULA;
            break;
            case 2:
            this.typeOfDocument = TypeOfDocument.EXTRANJERO;
            break;
            case 3:
            this.typeOfDocument = TypeOfDocument.NIT;
            break;
            case 4:
            this.typeOfDocument = TypeOfDocument.TARJETADEIDENTIDAD;
        } 
        switch(typeOfPhone){
            case 1:
            this.typeOfPhone = TypeOfPhone.HOME;
            break;
            case 2:
            this.typeOfPhone = TypeOfPhone.OFFICE;
            break;
            case 3:
            this.typeOfPhone = TypeOfPhone.MOVIL;
            break;
            case 4:
            this.typeOfPhone = TypeOfPhone.FAMILY;
            break;
            case 5:
            this.typeOfPhone = TypeOfPhone.OTHER;
            break;
        }
    }
}
