package com.revature;

public class LauncherControlFlow {

//    shortcut - type "main" and hit enter
    public static void main(String[] args) {

//        using built-in Math class to get a random number w/ the random() method

//        int random = (int)Math.random();
//        double random = Math.random();

//        int random = (int)(Math.random() * 100);

        int random = (int)(Math.random() * 100);

//        int random = (int)(Math.random());
        System.out.println(random);

//        if the (condition) is true, then run the {block}, otherwise move on

        if(random > 75) {
            System.out.println("Random number is pretty big");
        } else if (random > 50) {
            System.out.println("Random number is pretty medium sized");
        } else {
            System.out.println("Random number is pretty small");

        }

//            while loop
            while(random < 200) {
                System.out.println("Random number is " + random);
                random += 20;

            }
//                do-while loop
                do {
                    System.out.println("our number is: " + random);
                    random -=5;
                } while (random > 150);

                System.out.println("================================(For Loop");

//                basis for loop ....
        for(int i = 0; i < 10; i++) {
            System.out.println("i is: " + i);
        }
//        for(int i = 10; 0 <= i < 10; i--) {
//            System.out.println("i is: " );
//        }Toyota

//        more common use case of for loops: moving via a sequence of values
//        this is an arr of str, i.e. a str arr
        String[] cars = {"Acura", "Kia", "Honda", ""};

        //arr are INDEXED
        System.out.println(cars[0]);
        System.out.println(cars[5]); //index 5 out of bounds for length 4

        System.out.println("............");
//        use iterate via the arr & print out its values
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);

        }
//            ENHANCED FOR LOOP
            for (String car :  cars) {
                System.out.println(car);
            }

//            switch statement

        System.out.println("===================================(Switch");

        System.out.println("What is the best Pokemon");
        String pokemon =  "Garchomp";

        switch (pokemon) {
            case "magikarp":
                System.out.println("Magikarp is the wrong choice");
                break;
            case "charizard":
                System.out.println("close, but is not the best");
                break;
            case "garchomp":
                System.out.println("That's correct");
                break;
            case "mudkip":
                System.out.println("mudkip is the actual right choice");
                break;
            default:
                System.out.println(pokemon + "isn't in the running");
        }

        if (true && true) {
            System.out.println("Hello!");
        }
        if (true || false) {
            System.out.println("Hello!");
        }
        if (true ^ true) {
            System.out.println("Hello!");
        }
        if (true ^ true ^ true ^ false) {
            System.out.println("Hello!");
        }
//
//        int a = 5;
//        int b =5;
//        System.out.println(a == b);

//        String y = new String();

        }


}
