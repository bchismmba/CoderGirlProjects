package com.company;

import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        int numVeggiesSold;
        int numBurgersSold;
        int numSubsSold;
        int numSoupsSold;

        System.out.println("Checking sales goals.\n");
        System.out.println("The sales goal for veggie sandwiches today 300. \n");
        System.out.println("How many veggie sandwiches were sold today?\n");
        numVeggiesSold = keyboard.nextInt();
        if (numVeggiesSold >= goalForVeggies) {
            System.out.println("Meets goal");
        } else {
            System.out.println("Fell short");


        }

        System.out.println("Checking sales goals.\n");
        System.out.println("The sales goal for burgers today 250. \n");
        System.out.println("How many burgers were sold today?\n");
        numBurgersSold = keyboard.nextInt();
        if (numBurgersSold >= goalForBurgers) {
            System.out.println("Meets goal");
        } else {
            System.out.println("Fell short");


        }
        System.out.println("Checking sales goals.\n");
        System.out.println("The sales goal for Subs today 180. \n");
        System.out.println("How many Subs were sold today?\n");
        numSubsSold = keyboard.nextInt();
        if (numSubsSold >= goalForSubs) {
            System.out.println("Meets goal");
        } else {
            System.out.println("Fell short");


        }
        System.out.println("Checking sales goals.\n");
        System.out.println("The sales goal for soup today 70. \n");
        System.out.println("How many soups were sold today?\n");
        numSoupsSold = keyboard.nextInt();
        if (numSoupsSold >= goalForSoup) {
            System.out.println("Meets goal");
        } else {
            System.out.println("Fell short");


        }
        if ((numSoupsSold >= goalForSoup) && (numBurgersSold >= goalForBurgers) && (numVeggiesSold >= goalForVeggies) &&
                (numSubsSold >= goalForSubs)) {


            System.out.println("Meets All Goals");


        }

    }
}

