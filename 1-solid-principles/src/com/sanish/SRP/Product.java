package com.sanish.SRP;

import java.time.LocalDate;

public class Product {
    private String name;
    private Double price;
    private LocalDate dateOfManufacture;

    public Product(String name, Double price, LocalDate dateOfManufacture){
        this.name = name;
        this.price = price;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", dateOfManufacture=" + dateOfManufacture +
                '}';
    }
}
