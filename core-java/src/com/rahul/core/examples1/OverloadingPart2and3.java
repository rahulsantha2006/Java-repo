package com.rahul.core.examples1;


public class OverloadingPart2and3 {

    public void disp(char c, int num){
    System.out.println(" I am the first definition of method disp");
    }

    public void disp(int num, char c){
        System.out.println("I am the second definition of method disp");
    }
}

class sample2{
    public static void main(String args[]) {
        OverloadingPart2and3 obj = new OverloadingPart2and3();
        obj.disp('x',51);
        obj.disp(52,'y');
    }
}



