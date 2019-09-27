package com.rahul.core.examples1;


/*The use of super keyword
        1) To access the data members of parent class when both parent and child class have member with same name
2) To explicitly call the no-arg and parameterized constructor of parent class
3) To access the method of parent class when child class has overridden that method.*/





public class Example18_SuperInJava {
}

class superClass {
    int num = 100;
}

class subClass extends superClass {
    int num = 110;

    void printNumber() {
        System.out.println(super.num);
    }


    public static void main(String args[]) {
        subClass obj = new subClass();
        obj.printNumber();

    }
}










