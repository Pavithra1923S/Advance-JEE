package com.xworkz.exception;

public class ArrayOutofBoundryExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        int  Arrays[] = {12 , 12, 12};
        System.out.println(Arrays[2]);
        try{
            System.out.println(Arrays[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array went wrong");
        }

        System.out.println("main ended");
    }
}
