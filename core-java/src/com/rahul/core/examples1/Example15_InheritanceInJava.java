package com.rahul.core.examples1;


class Inheritance {

    String  father="Black Hair";
    String Mother= "brown eyes";

    void does(){
        System.out.println("Heredity");
    }
}


  public class Example15_InheritanceInJava extends Inheritance {
    String Grandparents= "Good Taste of Food";
    public static void main(String args[]) {
        Example15_InheritanceInJava obj= new Example15_InheritanceInJava();
        System.out.println(obj.father);
        System.out.println(obj.Mother);
        System.out.println(obj.Grandparents);
        obj.does();

    }
}