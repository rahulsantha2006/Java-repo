package com.rahul.examples.inheritance;

public class InheritanceMain {

    public static void main(String args[]) {

        MathCalculator mathCalculator = new MathCalculator();

        int multiplyResult = mathCalculator.multiplyTwoNumbers(5, 2);
        System.out.println("multiplyTwoNumbers: " + multiplyResult);

        int addResult = mathCalculator.foilingAdd(10, 20);
        System.out.println("foilingAdd: " + addResult);
    }
}