package com.rahul.core.examples1;

public class Example8_SwitchcaseStatements {


    public static void main(String args[]) {

        int num =2;
        int num2 =3;

        switch(num2+2)
        {
            case 1:
                System.out.println("Case1:"+num);
            case 2:
                System.out.println("Case2:"+num);
            case 3:
                System.out.println("Case3:"+num);
            default:
                System.out.println("Default:"+num);
        }


        switch(num) {
            case 1:
                System.out.println("Case1");
                break;
            case 2:
                System.out.println("Case2");
                break;
            case 3:
                System.out.println("Case3");
                break;
             default:
                 System.out.println("Case4");
        }





    }
}

