package com.bridgeLabz.basicTesting;

public class DatabaseConnection {
    public static void main(String[] args) {
        System.out.println("testing in progress.....");
    }
    public static String connect(){
        String str = "Connecting to database";
        return str;
    }
    public static String connected(){
        String str = "Database connected";
        return str;
    }
    public static String disconnect(){
        String str = "Database Disconnected";
        return str;
    }
}
