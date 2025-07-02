package com.xworkz.exception.stack;



public class StackRunner {


    public static void main(String[] args) throws NullPointerException{
        System.out.println("main started");
        try {
            method1();
        }catch (Exception ref){
            ref.printStackTrace();
            ref.getMessage();
        }
        System.out.println("main ended");
    }

    public static void method1()throws NullPointerException {
        System.out.println("method1 started");
        method2();
        System.out.println("method1 ended");
    }

    private static void method2() throws NullPointerException{

        System.out.println("metho2 started");
        method3();
        System.out.println("method2 ended");
    }

    private static void method3() throws NullPointerException{
        System.out.println("metho3 started");
        String st = null;
        System.out.println(st.length());
        System.out.println("method3 ended");
    }
}

