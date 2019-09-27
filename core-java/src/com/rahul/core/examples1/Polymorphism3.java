package com.rahul.core.examples1;

public class Polymorphism3 extends Polymorphism {

    @Override

    public  void sound(){
        System.out.println("Meow");
    }

    public static void main(String []args){
        Polymorphism obj = new Polymorphism3();
        obj.sound();
    }
}

