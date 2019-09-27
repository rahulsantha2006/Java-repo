package com.rahul.core.examples1;


public class Example17_AssociationInJava {

    class carClass {
        int carID;
        String carName;

        carClass(String name, int id) {

            this.carName = name;
            this.carID = id;
        }
    }

    class Driver extends carClass {
        String driverName;

        Driver(String name, String cname, int cid) {
            super(cname, cid);
            this.driverName = name;
        }
    }

    class transport {
        public void main(String args[]) {

            Driver obj = new Driver("Rahul", "Bmw", 1234);
            System.out.println(obj.driverName + "is a driver of carID" + obj.carID);
        }

    }

}