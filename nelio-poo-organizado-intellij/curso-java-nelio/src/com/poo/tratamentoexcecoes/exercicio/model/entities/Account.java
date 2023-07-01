package com.poo.tratamentoexcecoes.exercicio.model.entities;

import com.poo.tratamentoexcecoes.exercicio.model.exceptions.BusinessException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    public void withdraw(Double amount) throws BusinessException {
        validateWithdraw(amount);
        balance -= amount;
    }
    //metodo do professor
    private void validateWithdraw(double amount) throws BusinessException {
        if (amount > getWithdrawLimit()) {
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
        }
        if (amount > getBalance()) {
            throw new BusinessException("Withdraw error: Not enough balance");
        }
	}

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
