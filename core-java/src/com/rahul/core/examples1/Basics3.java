package com.rahul.core.examples1;

public class Basics3 {

    public static void main(String[] args) {

        int result;

        result = getNumberOfFruits("APPLE");

        System.out.println(result);
    }


    public static int getNumberOfFruits(String fruitName) {

        int totalFruits = 0;

        if(fruitName.equals("APPLE")){
            totalFruits = 40;
        }
        if(fruitName.equals("ORANGE")){
            totalFruits = 200;
        }

        return totalFruits;
    }
}
