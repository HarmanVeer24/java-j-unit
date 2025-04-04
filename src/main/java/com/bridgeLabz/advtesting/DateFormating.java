package com.bridgeLabz.advtesting;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormating {
    public static void main(String[] args){
        System.out.println("Testing in process.....");
    }
    public static String DateFormatting(String str){
        LocalDate date = LocalDate.parse(str);
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        date.format(format2);
        return date.format(format1);
    }
}
