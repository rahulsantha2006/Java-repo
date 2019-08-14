package com.rahul.core.examples1;


public class Example12_ContinueStatementsInJava {

    public static void main(String args[]) {

        for (int a = 0; a <= 6; a++) {

            if (a == 4) {
                continue;
            }
            System.out.println(a + "");
        }

        int b = 10;
        while (b >= 0) {

            if (b == 7) {
                b--;
                continue;
            }
            System.out.println(b + "");
            b--;
        }


        int c = 0;
        do {

            if (c == 7) {
                c++;
                continue;
            }
            System.out.println(c + "");
            c++;
        } while (c < 10);

    }
}
