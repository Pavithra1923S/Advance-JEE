package com.xworkz.exception;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main started");
       try {
           String name = null;
           System.out.println(name.length());
       }catch (NullPointerException e) {
           System.out.println("plz check its null ");
       }
        System.out.println("main ended");
    }
}
