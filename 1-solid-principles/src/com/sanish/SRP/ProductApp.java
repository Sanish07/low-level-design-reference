package com.sanish.SRP;

import java.time.LocalDate;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mustard Oil",450.00, LocalDate.now());
        System.out.println(product);

        Invoice invoice = new Invoice(product, 3);
        System.out.println("Total for 3 "+product.getName()+" with GST is Rs."+invoice.calculateTotal());

        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDb();

        InvoicePrint invoicePrint = new InvoicePrint(invoice);
        invoicePrint.printInvoice();
    }
}
