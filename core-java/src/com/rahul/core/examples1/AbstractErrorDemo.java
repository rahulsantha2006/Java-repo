package com.rahul.core.examples1;

abstract class AbstractDemo{
    public void myMethod(){
        System.out.println("hello");
    }
}

public class AbstractErrorDemo {


    public void anotherMethod(){
        System.out.println("Abstract Method");
    }
    public static void main(String []args){
       /* AbstractDemo obj = new AbstractDemo();
        obj.anotherMethod;
        */

    }
}
