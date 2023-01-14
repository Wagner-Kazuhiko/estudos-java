package com.exercises.polimorfismo.exercise1.entities;

import java.util.Date;

public class UsedProduct extends Product{

    protected Date manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public String priceTag(){
        return "Name: " + name + " $ " + price;
    }
}
