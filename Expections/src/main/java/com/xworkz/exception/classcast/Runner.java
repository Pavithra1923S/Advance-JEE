package com.xworkz.exception.classcast;

public class Runner {
    public static void main(String[] args) {
        System.out.println("main started");

       try{ Parent parent = new Child();
           Child child =(Child)parent;
           System.out.println(child);
       }catch (ClassCastException e){
           System.out.println("the class is missmatch ");
       }
        System.out.println("main ended");
    }
}
