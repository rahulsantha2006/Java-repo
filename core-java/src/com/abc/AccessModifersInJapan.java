package com.abc;


public class AccessModifersInJapan extends AccessModifersInChina{

    public static void main(String[] args) {

        AccessModifersInJapan japan = new AccessModifersInJapan();
        japan.angryDish(); //public
        japan.angryFish(); //protected
        //japan.angryDongrae(); //private

    }

    private String  angryDongrae(){
        return "sdfsfs";
    }
}
