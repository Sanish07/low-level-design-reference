package com.sanish.SRP;

//Only has responsibility to print invoice
public class InvoicePrint {
    private Invoice invoice;

    public InvoicePrint(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){
        System.out.println("Printing invoice...");
    }
}
