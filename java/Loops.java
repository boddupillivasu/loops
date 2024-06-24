package com.loops.java;

public class Loops {
    public static void main(String[] args) {

        //for loop

        byte value;
        value = 10;
        for (value = 1; value <= 10; value++)
            System.out.println("hello world");

        //while loop

        byte num;
        num = 1;
        while (num <= 10) {
            System.out.println(num);

            num++;
        }

        // do while

        byte num1;
        num1 = 1;
        do {
            System.out.println("hello world");
            num1++;
        } while (num1 >= 10);

        // nested for loop

        for (byte i = 1; i <= 3; i++) {
            for (byte j = 1; j <= 3; j++) {
                if (i == j)
                    continue;
                // break ;
                System.out.println(i + " " + j);


            }


        }

    }
}
