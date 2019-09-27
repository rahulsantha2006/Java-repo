package com.rahul.core.examples1;

interface A{

    int x=10;
}

interface B {

    int x=100;
}

public class abstractE2 implements A,B {


    public static void main(String []args){

        System.out.println(A.x);
        System.out.println(B.x);


    }
}
