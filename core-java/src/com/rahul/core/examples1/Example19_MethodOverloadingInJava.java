package com.rahul.core.examples1;


public class Example19_MethodOverloadingInJava {

    public void disp(char c){

        System.out.println(c);
    }
    public void disp(char c, int num){
        System.out.println(c+""+num);
    }
}


    class Sample{


        public void main(String args[]) {

            Example19_MethodOverloadingInJava obj= new Example19_MethodOverloadingInJava();
            obj.disp('a');
            obj.disp('a',10);
        }
    }






