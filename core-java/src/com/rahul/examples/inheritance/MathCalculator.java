package com.rahul.examples.inheritance;

import com.rahul.examples.constructor.MathForumula;

public class MathCalculator extends MathForumula {

    public int multiplyTwoNumbers(int xx, int yy){
        return xx * yy;
    }

    //We commented it  - because of inheritance
//    public int foilingAdd(int a, int b) {
//
//        int c = a * a + 2 * a * b + b * b;
//        return c;
//    }

}