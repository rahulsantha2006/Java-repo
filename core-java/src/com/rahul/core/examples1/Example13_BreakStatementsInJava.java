package com.rahul.core.examples1;


public class Example13_BreakStatementsInJava {

    public static void main(String args[]) {

        int a = 0;
        while (a <= 100) {

            System.out.println("value is:" + a);
            if (a == 5) {
                break;
            }
            a++;
        }
        System.out.println("outside of the loop");


        int b;
        for (b = 100; b >= 10; b--) {

            System.out.println("variable:" + b);
            if (b == 95) {
                break;
            }
        }
        System.out.println("outside of the for loop");


        int c = 2;
        switch (c) {


            case 1:
                System.out.println("case1");
                break;

            case 2:
                System.out.println("case2");
                break;

            case 3:
                System.out.println("case3");
                break;

            default:
                System.out.println("default");

        }


    }
}