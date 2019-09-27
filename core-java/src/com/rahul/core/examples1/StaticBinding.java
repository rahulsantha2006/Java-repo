package com.rahul.core.examples1;

 class StaticBinding {

     public static void walk(){
         System.out.println("Human Walks");
     }


}

class boy extends StaticBinding {


     public static void walk(){
         System.out.println("Boy Walks");
     }
    public static void main(String []args){

         StaticBinding obj =  new boy();
         StaticBinding obj2 = new StaticBinding();
         obj.walk();
         obj2.walk();

    }

}
