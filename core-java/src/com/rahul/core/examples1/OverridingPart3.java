package com.rahul.core.examples1;


public class OverridingPart3 {

    public void myMethod(){
        System.out.println("Overriden Method");
    }
}

class demo extends OverridingPart3{

    public void myMethod(){
        super.myMethod();
        System.out.println("Overriding Method");
    }


    public void main(String args[]) {
        demo obj = new demo();
        obj.myMethod();

    }

}



