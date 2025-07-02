package com.xworkz.exception;

public class ArithmeticException {
    public static void main(String[] args) {
        System.out.println("main started");


        try{  int i = 9/9;}catch (java.lang.ArithmeticException e){
            System.out.println("arithmetic exception caused");
        }
        System.out.println("main ended");
    }
}
