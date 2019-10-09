package com.rahul.core.examples1;

public class FinalInJava1 {

    final int HJLJ;

    FinalInJava1(){
        HJLJ=100;
    }

    void lll(){
        System.out.println(HJLJ);
    }
    public static void main(String []args){

        FinalInJava1 obj = new FinalInJava1();
        obj.lll();

    }
}
