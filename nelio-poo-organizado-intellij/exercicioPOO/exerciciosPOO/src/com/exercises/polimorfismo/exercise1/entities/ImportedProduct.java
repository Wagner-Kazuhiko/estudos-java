package com.exercises.polimorfismo.exercise1.entities;

public class ImportedProduct extends Product{

    protected Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public String priceTag(){
        return "Name: " + name + " $ " + price;
    }

    public double totalPrice(){
        return price++;
    }
}
