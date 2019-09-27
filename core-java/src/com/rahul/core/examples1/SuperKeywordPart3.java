package com.rahul.core.examples1;


public class SuperKeywordPart3 {}

    class ParentClass{

    ParentClass(){
        System.out.println("no-arg constructor of parentclass");
    }

    ParentClass(String str){
        System.out.println("parametrized constructor of parentclass");
    }
   }
   class SubClass extends ParentClass{
    SubClass(){
        super("HAhaH");
        System.out.println("constructor of childclass");
    }
    void display(){
        System.out.println("hello");
    }

       public static void main(String args[]) {
        SubClass obj= new SubClass();
        obj.display();

       }
   }


















