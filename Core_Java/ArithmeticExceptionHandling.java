package javaprograms;

import java.util.Scanner;

/*The Arithmetic Exceptions are part of the “ java.lang ” package and can be faced
 in the following two scenarios: Division of a Number by Zero.Division of Non-terminating Big Decimals. 
 The stated exception in both cases can be handled with the help of the “ try/catch ” blocks. */

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Arithmetic Exception Handling");
        try {
            // Input two numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Thank you for using the program.");
            scanner.close();
        }      

    }
  }

//If the Denominator is not 0 then expected output:
/*
 Welcome to Arithmetic Exception Handling
Enter the numerator: 20
Enter the denominator: 10
Result: 2
Thank you for using the program.
*/

//If the Denominator is 0 then expected output:
/*
 Welcome to Arithmetic Exception Handling
Enter the numerator: 30
Enter the denominator: 0
Error: Division by zero is not allowed.
Thank you for using the program.
*/
 
 

