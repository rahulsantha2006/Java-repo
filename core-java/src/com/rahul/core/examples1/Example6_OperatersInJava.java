package com.rahul.core.examples1;

public class Example6_OperatersInJava {


    public static void main(String args[]) {

        int num1 = 50;
        int num2 = 5;
        int num3 = 10;
        int num4 = 20;


        num3++;
        num4--;

        System.out.println("num3++ is :"+num3);
        System.out.println("num4-- is :"+num4);




        System.out.println("number1 added with number2:" + (num1 + num2));
        System.out.println("number1 subtracted with number2:" + (num1 - num2));
        System.out.println("number1 multiplied with number2:" + (num1 * num2));
        System.out.println("number1 divided with number2:" + (num1 / num2));


        num2 = num1;
        System.out.println("= Output: " + num2);

        num2 += num1;
        System.out.println("+= Output: " + num2);

        num2 -= num1;
        System.out.println("-= Output: " + num2);

        num2 *= num1;
        System.out.println("*= Output: " + num2);

        num2 /= num1;
        System.out.println("/= Output: " + num2);

        num2 %= num1;
        System.out.println("%= Output: " + num2);
    }

}

