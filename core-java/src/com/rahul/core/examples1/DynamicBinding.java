package com.rahul.core.examples1;

 class DynamicBinding {

     public void walk(){
         System.out.println("Human Walks");
     }

}

class Demo3 extends DynamicBinding{



     public void walk(){
         System.out.println("Boy Walks");
     }

    public static void main(String []args){

    }
}