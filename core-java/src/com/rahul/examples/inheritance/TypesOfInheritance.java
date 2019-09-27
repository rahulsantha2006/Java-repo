package com.rahul.examples.inheritance;

public class TypesOfInheritance {


    class a {
        public void methodA() {
            System.out.println("Class A Method");
        }
    }

    class b extends a {
        public void methodB() {
            System.out.println("Class B Method");
        }
    }

     class c extends b {
        public void methodC() {
            System.out.println("Class C Method");
        }
    }


    public void main(String args[]) {

        c obj = new c();
        obj.methodA();
        obj.methodB();
        obj.methodC();


    }
}