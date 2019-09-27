package com.rahul.core.examples1;

class EncapsultationDemo{

    private int ssn;
    private String empName;
            private int empAge;


    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }

}


public class EncapsulationInJava {

    public static void main(String []args){
        EncapsultationDemo obj = new EncapsultationDemo();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);
        System.out.println(obj.getEmpName());
        System.out.println((obj.getEmpSSN()));
        System.out.println((obj.getEmpAge()));

    }
}
