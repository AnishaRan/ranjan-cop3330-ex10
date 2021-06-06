package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Anisha Ranjan
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        String item1P = scan.nextLine();
        double numItem1P = Double.parseDouble(item1P);
        System.out.print("Enter the quantity of item 1: ");
        String item1Q = scan.nextLine();
        int numItem1Q = Integer.parseInt(item1Q);
        System.out.print("Enter the price of item 2: ");
        String item2P = scan.nextLine();
        double numItem2P = Double.parseDouble(item2P);
        System.out.print("Enter the quantity of item 2: ");
        String item2Q = scan.nextLine();
        int numItem2Q = Integer.parseInt(item2Q);
        System.out.print("Enter the price of item 3: ");
        String item3P = scan.nextLine();
        double numItem3P = Double.parseDouble(item3P);
        System.out.print("Enter the quantity of item 3: ");
        String item3Q = scan.nextLine();
        int numItem3Q = Integer.parseInt(item3Q);

        double subtotal = (numItem1P * numItem1Q) + (numItem2P * numItem2Q) + (numItem3P * numItem3Q);
        double tax = 0.055 * subtotal;

        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f", subtotal + tax);

    }
}
