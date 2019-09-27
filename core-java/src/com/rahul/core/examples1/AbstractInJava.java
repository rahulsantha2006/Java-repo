package com.rahul.core.examples1;

abstract class AbstractInJava {

    public abstract void Sound();
}

 class Parrot extends AbstractInJava{

    public void Sound(){
        System.out.println("Kee Kee");
    }

    public static void main(String args[]){
        AbstractInJava obj =  new Parrot();
        obj.Sound();

    }
}
