package com.rahul.core.examples1;

public class FinalInJava2 {

    final int hello;

    FinalInJava2(int bye){

        hello=bye;
    }

    void mymethod(){
        System.out.println(hello);
    }
    public static void main(String []args){

        FinalInJava2 obj = new FinalInJava2(5678);
        obj.mymethod();
    }
}
