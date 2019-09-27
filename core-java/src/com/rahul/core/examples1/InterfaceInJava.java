package com.rahul.core.examples1;

interface MyInterface{

    public void method1();
    public void method2();

}

public class  InterfaceInJava implements MyInterface {


    public void method1(){
        System.out.println("Implementation of method 1");
    }
    public void method2(){
        System.out.println("Implementation of method 2");
    }


    public static void main(String []args){

        MyInterface obj = new InterfaceInJava();
        obj.method1();


    }
}
