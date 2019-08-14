package com.rahul.examples.mystatic;

public class StaticExample {

    public static void main(String args[]) {

        int folingAddResult = TennisForumula.addTwoNumbers(5, 10);
        System.out.println("static method call: " + folingAddResult);

        System.out.println("static variable: " + TennisForumula.name);
    }
}