package com.bridgeLabz.basicTesting;

import java.util.ArrayList;

public class ListManager {
    public static void main(String[] args) {
        System.out.println("Testing in progress......");
    }
    public static void addElement(ArrayList<Integer> list,int element){
        list.add(element);
    }
    public static void removeElement(ArrayList<Integer>list , int index){
        list.remove(index);
    }
    public static int getSize(ArrayList<Integer> list){
        return list.size();
    }
}
