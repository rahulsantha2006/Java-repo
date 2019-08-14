package com.rahul.core.examples1;

import java.util.Scanner;
public class Example2_ScanCompareWithZero {

    public static void main(String[] args) {

        int number;
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter the number you want to check:");

        number = scan.nextInt();
        scan.close();

        if (number > 0) {
            System.out.print(number + " is a positive number");
        }

        else if (number < 0) {
            System.out.print(number+" is a negative number ");
        }

        else{
            System.out.print(number+" this number is not positive or negative");
        }
    }


}
