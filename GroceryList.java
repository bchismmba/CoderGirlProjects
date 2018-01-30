
/**
 * Write a description of class GroceryList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import static java.lang.System.out;
import java.util.Scanner;
   
public class GroceryList {
    public static void main (String[] args){ 
        
        Scanner keyboard = new Scanner(System.in);

    //intialize variables
        String item1;
        String item2;
        String item3;
        int quantity1;
        int quantity2;
        int quantity3;
        float price1;
        float price2;
        float price3;
        
        //ask for items
        System.out.println("Please list three items on your grocery shopping list.");
        System.out.println("Item 1?");
        item1 = keyboard.nextLine();
        System.out.println("Item 2?");
        item2 = keyboard.nextLine();
        System.out.println("Item 3?");
        item3 = keyboard.nextLine();

        //ask for quantity
        System.out.println("Now, please enter the quantity of each item.");
        System.out.println("How many "+item1+"?");
        quantity1 = keyboard.nextInt();
        System.out.println("How many "+item2+"?");
        quantity2 = keyboard.nextInt();
        System.out.println("How many "+item3+"?");
        quantity3 = keyboard.nextInt();

        //ask for cost
        System.out.println("Now, please enter the cost of each item.");
        System.out.println("How much does one "+item1+" cost?");
        price1 = keyboard.nextFloat();
        System.out.println("How much does one "+item2+" cost?");
        price2 = keyboard.nextFloat();
        System.out.println("How much does "+item3+" cost?");
        price3 = keyboard.nextFloat();

        //calculate total bill
        System.out.println("Calculating your grocery bill.");
        float total = (quantity1*price1) + (quantity2*price2) + (quantity3*price3);
        System.out.println("Your total cost is "+total);
    }




    }

