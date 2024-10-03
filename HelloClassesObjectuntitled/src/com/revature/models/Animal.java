package com.revature.models;

//This class defines all the attributes and b/rs  that an animal can have
public class Animal {

    //3 animal variables -  data that describe an animal
    public int legs;
    public  int age;
    public String sound;

    // method that an animal eat

    public void eat() {
        System.out.println("CRONCH CRONCH CRONCH");
    };
    public  String makeSound() {
        return sound;
    }
    /* Method misambiguation
    methods above are both public, so they are accessible
     */

}
