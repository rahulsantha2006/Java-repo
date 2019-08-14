package com.rahul.examples.constructor;


public class ScienceForumula {

    int baseValue = 10;

    ScienceForumula(){
    }

    ScienceForumula(int myBaseValue){
        baseValue = myBaseValue;
    }

    /**
     * This method calculates a + b
     */
    public int addTwoNumbers(int a, int b) {
        int xx = a + b;
        return xx;
    }

    public int addThreeNumbers(int a, int b, int c) {

        if(c == 0){
            c = baseValue;
        }

        int yy = a + b + c;
        return yy;
    }
}