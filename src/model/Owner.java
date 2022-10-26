package model;

public final class Owner extends User {
    
    protected int accountNumber;
    protected String bankAccount;

    public Owner(int typeOfDocument,int document, String name, String phone, int typeOfPhone, int accountNumber, String bankAccount){
        super(typeOfDocument,document,name, phone, typeOfPhone);
        this.accountNumber = accountNumber;
        this.bankAccount = bankAccount;
    }
}
