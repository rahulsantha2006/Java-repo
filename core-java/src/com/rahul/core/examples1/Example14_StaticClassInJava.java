package com.rahul.core.examples1;


  public class Example14_StaticClassInJava {

    static int num;
    static String letter;
    static int i=10;
    static String s="beginners book";
    static int a=100;
    static String b="Hello";

    static void display(){

        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }

    void funcn(){

      display();
    }


    static{
        System.out.println("Static block 1");
        num=97;
        letter="block1";
    }

    static{
        System.out.println("Static block 2");
        num=120;
      letter="block2";

    }


    public static void main(String args[]) {

        System.out.println(num);
        System.out.println(letter);
        System.out.println(i);
        System.out.println(s);

        Example14_StaticClassInJava obj = new Example14_StaticClassInJava();
        obj.funcn();

        display();


    }


}