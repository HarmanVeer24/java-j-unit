package com.bridgeLabz.basicTesting;

public class StringUtils {
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        return  sb.toString();
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static String toUpperCase(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println("testing is progress....");
    }
}
