package com.sanish.SRP;

//According to Single Responsibility Principle, A class should have one and only
// reason to change. This class has responsibility to calculate total only.
public class Invoice {
    private Product product;
    private Integer quantity;
    private final Double gstRate = 17.50; //In percent

    public Invoice(Product product, Integer quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public Double calculateTotal(){
        Double gstPrice = product.getPrice() * (1 + (gstRate/100));
        return gstPrice * quantity;
    }
}
