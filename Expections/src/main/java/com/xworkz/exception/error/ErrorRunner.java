package com.xworkz.exception.error;

public class ErrorRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        method1();
        System.out.println("main ended");
    }

    public static void method1(){
        System.out.println("method1 started");
        method1();
        System.out.println("method1 ended");
    }
}
