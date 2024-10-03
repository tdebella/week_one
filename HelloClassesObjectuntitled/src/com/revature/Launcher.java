package com.revature;

import com.revature.models.Animal;

//learn java app structure
public class Launcher {

    public static void main(String[] args) {

        //instantiate an animal object with no-args constructor. it'll give a generic Animal obj w/ generic values

        Animal a = new Animal();
        a.legs =12;
        System.out.println("our animal has " + a.legs + " legs");

        //let's invoke the 2 animal methods
        a.eat();

        //2 new animals in a d/t way


    }
}
