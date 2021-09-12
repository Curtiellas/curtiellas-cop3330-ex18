package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 luis curtiellas
 */

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        System.out.println( "Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: " );

        String choice = sc.next();
        String outputType = "[invalid]";
        double result = 0;
        double input;

        if (choice.equalsIgnoreCase("c"))
        {
            System.out.println("Please enter the temperature in Fahrenheit:");
            input = sc.nextDouble();
            result = (input - 32) * 5 / 9;
            outputType = "Celsius";
        }

        else if (choice.equalsIgnoreCase("f"))
        {
            System.out.println("Please enter the temperature in Celsius:");
            input = sc.nextDouble();
            result = (input * 9 / 5) + 32;
            outputType = "Fahrenheit";
        }

        else
            System.out.println("Invalid choice. Restart program.\n");

        System.out.printf("The temperature in %s is %.0f.\n", outputType, result);


    }
}
