package com.bridgeLabz.basicTesting;

public class Division {
    public static void main(String[] args) {
        System.out.println("Testing in progress");
    }
    public static int divide(int divisor,int dividend){
        try{
            return dividend/divisor;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException();
        }
    }
}
