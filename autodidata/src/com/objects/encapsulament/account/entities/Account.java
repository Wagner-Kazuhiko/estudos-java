package com.objects.encapsulament.account.entities;


public class Account {

    private Integer id;
    private String name;
    private Double salary;
    public Account(){

    }

    public Account(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        this.salary += salary * percentage / 100;
    }

    @Override
    public java.lang.String toString() {
        return super.toString();
    }
}
