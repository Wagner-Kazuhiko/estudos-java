package com.exercises.abstracts.exercise1.entities;

public class Individual extends TaxPayer{

    private Double healthExpenditures;

    public Individual(){
        super();
    }

    public Individual(String name, Double annualIncome, Double healthExpenditures) {
        super();
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        if (getAnualIncome() < 20000.0) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        }
        else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }
}
