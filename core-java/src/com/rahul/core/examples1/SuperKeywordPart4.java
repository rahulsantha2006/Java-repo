package com.rahul.core.examples1;


public class SuperKeywordPart4 {}

  class Leaderclass{

      void display(){

          System.out.println("Parent class method");
      }
  }
  class Followerclass extends Leaderclass{

      void display(){
          System.out.println("child class method");
      }

      void printmsg(){
          display();
          super.display();
      }
      public static void main(String args[]){
          Followerclass obj = new Followerclass();
          obj.printmsg();
      }
  }
























