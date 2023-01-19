package com.loiane.exercicios.aulas28a33.construtoresencapsulamentosobrecarga.exer2.entities;

public class SpecialAccount extends Account{

    public SpecialAccount(){
        super();
    }

    public SpecialAccount(Integer id, String name, Double balance) {
        super(id, name, balance);
    }

    public double specialCredit (){
        return deposit() + 500;
    }

    @Override
    public double deposit (){
        return balance += balance;
    }
    @Override
    public double withdraw(){
        return balance -= balance + balance;
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
