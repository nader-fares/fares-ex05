/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nader Fares
 */

//Write a program that
// prompts for two numbers.
// Print the sum, difference,
// product, and quotient of those numbers
// as shown in the example output:

package base;

import java.util.Scanner;

public class Solution05 {
    /*
        program start
        print "what is the first number?"
        'number1' = read string from user
        repeat for 'number2'
        int 'n1' = Integer.parseInt(number1)
        repeat for 'n2'
        int 'sum' = n1 + n2
        int 'difference' = n1 - n2
        int 'product' = n1 * n2
        int 'quotient' = n1 / n2
        print "'number1' + 'number2' = 'sum'
        \n     'number1' - 'number2' = 'difference'
        \n     'number1' * 'number2' = 'product'
        \n     'number1' / 'number2' = 'quotient'"

     */
    public static void main(String[] args)
    {
        //prompt user for first number and store into string 'number1'
        System.out.print("What is the first number? ");
        Scanner input = new Scanner(System.in);
        String number1 = input.nextLine();

        //prompt user for second number and store into string 'number2'
        System.out.print("What is the second number? ");
        String number2 = input.nextLine();

        //convert string into integers
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);

        //perform appropriate operations and store into corresponding variable
        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        int quotient = n1 / n2;

        //display results
        System.out.print(number1 + " + " + number2 + " = " + sum +
        "\n" +           number1 + " - " + number2 + " = " + difference +
        "\n" +           number1 + " * " + number2 + " = " + product +
        "\n" +           number1 + " / " + number2 + " = " + quotient);
    }
}
