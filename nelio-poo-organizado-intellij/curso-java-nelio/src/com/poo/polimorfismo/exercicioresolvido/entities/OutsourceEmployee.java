package com.poo.polimorfismo.exercicioresolvido.entities;

public class OutsourceEmployee extends Employee{

    protected Double additionalCharge;
    public OutsourceEmployee(){
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
