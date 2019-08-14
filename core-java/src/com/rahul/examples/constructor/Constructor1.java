package com.rahul.examples.constructor;


public class Constructor1 {

    String name;

    Constructor1() {
        this.name = "beginners book.com";
    }

    public static void main(String args[]) {

        Constructor1 obj = new Constructor1();
        System.out.println(obj.name);

    }
}