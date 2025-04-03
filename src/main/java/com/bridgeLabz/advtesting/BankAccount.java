package com.bridgeLabz.advtesting;

public class BankAccount {
     static double balance;
    public static void main(String[] args) {
        System.out.println("Testing in process.....");
    }
    public static void deposit(double money){
        if(money<0){
            throw new IllegalArgumentException("Negative money can not be deposited");
        }
        balance+=money;
    }
    public static void withdraw(double money){
        if(money>balance || money<0){
            throw new IllegalArgumentException("The balance is insufficient");
        }
        balance-=money;
    }

    public static double getBalance() {
        return balance;
    }
}