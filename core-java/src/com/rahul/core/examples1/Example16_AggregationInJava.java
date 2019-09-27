package com.rahul.core.examples1;


  public class Example16_AggregationInJava {


      static class Address{

       String streetnum;
       String city;
       String State;
       String Country;
       Address(String  street, String c, String st, String coun){
           this.streetnum=street;
           this.city=c;
           this.State=st;
           this.Country=coun;
       }
      }


      static class studentClass{

          int rollNum;
          String studentName;
          Address studentAddr;
          studentClass(int roll, String name, Address addr ){

              this.rollNum=roll;
              this.studentName=name;
              this.studentAddr=addr;
          }

      }



    public static void main(String args[]) {

          Address ad= new Address("yibambe","johnston","iowa","USA");
          studentClass obj = new studentClass(1234,"rahul",ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetnum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.State);
        System.out.println(obj.studentAddr.Country);

    }

}