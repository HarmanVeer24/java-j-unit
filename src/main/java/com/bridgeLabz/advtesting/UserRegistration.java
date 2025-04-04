package com.bridgeLabz.advtesting;
public class UserRegistration {
    public static void main(String[] args) {
        System.out.println(registerUser("Harman Veer Singh", "harman@gmail.com", "Harman@123"));
        System.out.println("Testing in process......");
    }

    public static boolean registerUser(String username, String email, String password){
        String nameRegex = "^[A-Za-z]+(\\s[A-Za-z]+)*$";
        String emailRegex = "^[A-Za-z0-9]+@[A-Za-z0-9.]+\\.[A-Za-z]{2,}$";
        String passwordRegex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

        boolean isValidName = username.matches(nameRegex);
        boolean isValidEmail = email.matches(emailRegex);
        boolean isValidPassword = password.matches(passwordRegex);

        if( !isValidName && !isValidEmail && !isValidPassword){
            throw new IllegalArgumentException("Error creating new user");
        }
        return true;
    }
}
