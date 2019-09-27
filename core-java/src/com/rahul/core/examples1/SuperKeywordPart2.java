package com.rahul.core.examples1;


public class SuperKeywordPart2 {}

class AdultClass {

    AdultClass() {
        System.out.println("Constructor of ParentClass");
    }
}

class Subclass extends AdultClass {
    Subclass() {

        System.out.println("Constructor of child class");
    }

    Subclass(int num) {
        System.out.println("arg constructor of childclass");
    }

    void display() {

        System.out.println("Hello ");
    }

    public static void main(String[] args) {

        Subclass obj = new Subclass();
        obj.display();

        Subclass obj2 = new Subclass(10);
        obj2.display();

    }
}



























