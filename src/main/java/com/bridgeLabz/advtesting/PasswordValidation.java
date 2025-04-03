package com.bridgeLabz.advtesting;

public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println("Testing in process....");
    }
    public static boolean passwordStrengthValidator(String str){
        String regex = "^(?=.*[A-Z])(?=.*\\d)[\\w!@#$%^&*]{8,}$"; // Ishaan19
        if(str.matches(regex)){
            return true;
        }
        return false;
    }
}