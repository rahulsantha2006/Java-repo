package com.rahul.examples.constructor;

public class Constructor2 {

    public static void main(String args[]) {

        MathForumula mathForumula = new MathForumula();
        int folingAddResult = mathForumula.foilingAdd(1, 2);
        System.out.println("RESULT: " + folingAddResult);
        //-----------------
        ScienceForumula scienceForumula = new ScienceForumula();
        int result1 = scienceForumula.addTwoNumbers(1, 2);
        System.out.println("RESULT: " + result1);

        int result2 = scienceForumula.addThreeNumbers(1, 2, 0);
        System.out.println("RESULT: " + result2);

        ScienceForumula nammaObjectu = new ScienceForumula();
        int result3 = nammaObjectu.addThreeNumbers(44, 22, 0);
        System.out.println("RESULT: " + result3);


        ScienceForumula veraObjectu = new ScienceForumula(500);
        int result4 = veraObjectu.addThreeNumbers(44, 22, 0);
        System.out.println("RESULT: " + result4);

    }
}