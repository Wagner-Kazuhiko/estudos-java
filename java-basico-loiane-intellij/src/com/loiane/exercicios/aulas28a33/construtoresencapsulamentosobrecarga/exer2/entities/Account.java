package com.loiane.exercicios.aulas28a33.construtoresencapsulamentosobrecarga.exer2.entities;

public class Account {

    protected Integer id;
    protected String name;
    protected Double balance = 0.0;

    public Account(){
        super();
    }

    public Account(Integer id, String name, Double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double deposit (){
        return balance += balance;
    }

    public double withdraw(){
        return balance -= balance + balance * 0.05;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", balance: " + balance +
                '}';
    }
}
