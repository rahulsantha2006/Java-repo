package com.rahul.core.examples1;



class Demo1 {
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}


public class typesOfPolymorphism {

    public static void main(String args[]){

        Demo1 obj = new Demo1();
        System.out.println(obj.add(20,30));
        System.out.println(obj.add(20,30,40));
    }
}


