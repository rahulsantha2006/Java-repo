package com.rahul.core.examples1;

public class Example4_Variables {

    int bb = 88;

    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 500;


        Example4_Variables example4Variables = new Example4_Variables();
        int result = example4Variables.addTwoNumbers(number1, number2);
        System.out.println(result);


        int number4 = 33;
        int number5 = 44;

        int result2 = example4Variables.addTwoNumbers(number4, number5);
        System.out.println(result2);

    }

    public int addTwoNumbers(int a, int b) {

        int c = a + b;

        return c;
    }


}
