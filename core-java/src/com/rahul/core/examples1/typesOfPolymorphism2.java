package com.rahul.core.examples1;


class ABC{

    public void myMethod(){
        System.out.println("Overriden Method");
    }
}

public class typesOfPolymorphism2 extends ABC {


    public void myMethod(){
        System.out.println("Overriding Method");
    }

    public static void main(String []args){
        ABC obj = new typesOfPolymorphism2();
        obj.myMethod();

    }
}
