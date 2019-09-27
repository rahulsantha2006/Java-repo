package com.rahul.core.examples1;


public class OverridingPart2 {

    public  void disp(){
        System.out.println("disp() method of parent class");
    }
}

class Demo extends OverridingPart2{

    public void disp(){
        System.out.println("disp() method of child class");
    }
    public void newMehtod(){
        System.out.println("New method of child class");
    }

    public static void main(String []args){

        OverridingPart2 obj = new OverridingPart2();
        obj.disp();

        OverridingPart2 obj2= new Demo();
        obj2.disp();
    }

}

