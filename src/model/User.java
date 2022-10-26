package model;

public abstract class User {
    private TypeOfDocument typeOfDocument;
    private int document;
    private String name;
    private String phone;
    private TypeOfPhone typeOfPhone;
    

    public User(int typeOfDocument,int document, String name, String phone, int typeOfPhone){
        this.document = document;
        this.name = name;
        this.phone = phone;

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


    public TypeOfDocument getTypeOfDocument() {
        return typeOfDocument;
    }


    public void setTypeOfDocument(TypeOfDocument typeOfDocument) {
        this.typeOfDocument = typeOfDocument;
    }


    public int getDocument() {
        return document;
    }


    public void setDocument(int document) {
        this.document = document;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }


    public TypeOfPhone getTypeOfPhone() {
        return typeOfPhone;
    }


    public void setTypeOfPhone(TypeOfPhone typeOfPhone) {
        this.typeOfPhone = typeOfPhone;
    }
    
}
