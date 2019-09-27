package com.rahul.core.examples1;

abstract class abstractExample1 {

    public void disp(){
        System.out.println("Concrete method of patent class");
    }
    abstract public void disp2();

}

class dem0 extends abstractExample1 {

public void disp2(){

    System.out.println("overriding abstract method");
}
    public static void main(String []args){
    dem0 obj = new dem0();
    obj.disp2();
    }
}

