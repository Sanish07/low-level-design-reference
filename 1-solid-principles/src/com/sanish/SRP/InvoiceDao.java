package com.sanish.SRP;

//Only has responsibility to save invoice to DB
public class InvoiceDao {
    private Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDb(){
        System.out.println("Saving to Database...");
    }
}
