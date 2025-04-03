package com.bridgeLabz.advtesting;
public class Temperature {
    public static void main(String[] args) {
        System.out.println("Testin in process......");
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit =  (celsius *9.0)/5.0+ 32.0;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit-32) / 1.8;
        return celsius;
    }
}
