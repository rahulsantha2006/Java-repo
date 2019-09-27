package com.rahul.core.examples1;

public class Polymorphism2 extends Polymorphism {

    @Override

    public  void sound(){
        System.out.println("Neigh");
    }

    public static void main(String args[]){
        Polymorphism obj = new Polymorphism2();
        obj.sound();
    }
}

