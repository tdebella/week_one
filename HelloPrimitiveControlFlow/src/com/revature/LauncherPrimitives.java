package com.revature;

public class LauncherPrimitives {

    public static void main(String[] args){

//        System.out.println("");
//        int -s the most common integer type primitive
        int i = 10;
        int i2 = 1_00_000;
        //use underscore in the place of comma

//        long - big number  add L at the end of the number
        long l = 1_2000000000000L;

//        boolean
        boolean b = true;
        boolean b2 = false;
        System.out.println(2>1);
        System.out.println(2<1);

//        char - uses single quote
        char c = 'c';

//        we could also use unicode
        char c2 = '\u0053';
        System.out.println("revature" + c2);

//        double - decimal  prim type
        double d = 10.5;
        double d2 = 1_000_000.56;

        System.out.println("==============(Arithmetic Operators");

        //+ a few things to consider
//        int + int = int
        System.out.println(10 + 5);

//        string + string =  stringstring
        System.out.println("hello" + "Ethiopia");

        //        string + int =  stringint
        System.out.println("The number is " + 10);

//        modulus - remainder of division
        int num1 = 10;
        int num2 = 11;
        System.out.println(num2 % num1);

        //if the number divided by 2 w/o remainder, it is even.
        if(num1 % 2 == 0) {
            System.out.println("The number is even!");

            /**
            increment decrement operators - used in any kind of up/down counter
            ++ & -- increase & decrease the number by 1
             */
            int funnyNumber = 24;
            System.out.println(funnyNumber);

            funnyNumber++;
            System.out.println(funnyNumber);

            funnyNumber--;
            System.out.println(++funnyNumber);
            System.out.println(++funnyNumber);
            System.out.println(++funnyNumber);

            System.out.println(--funnyNumber);
            System.out.println(--funnyNumber);

//            type coercion - for larger data types, smaller data types, int types
//            convert int to decimal and vice versa and type casting as well
            //type casting -convert a double to an int
            double dub = 5.5;
            int myInt = (int)dub;
            System.out.println(myInt);


        }

    }
}
