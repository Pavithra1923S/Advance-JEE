package com.xworkz.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMissMatchExceptionRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        try{
            System.out.println("jdfn");
            int age = sc.nextInt();
            System.out.println("mdfjvnk");
        }catch (InputMismatchException | ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("the given input is missmatch");
        }
    }
}
