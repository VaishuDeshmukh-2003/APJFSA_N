package javaprograms;

import java.util.Scanner;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        // Sample of array
        int[] numbers = {10, 20, 30, 40, 50};

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the user to input an index
            System.out.print("Enter an index to access the array element: ");
            int index = scanner.nextInt();

            // Try to access the element at the given index
            System.out.println("Element at index " + index + ": " + numbers[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the case where the index is out of bounds
            System.out.println("Error: Index out of bounds. Please enter a valid index between 0 and " + (numbers.length - 1));

        } catch (Exception e) {
            // Handle any other invalid input (e.g., non-integer input)
            System.out.println("Error: Please enter a valid integer as the index.");

        } finally {
            // Optional block that always executes
            System.out.println("Program execution completed.");
        }

        // Close the scanner
        scanner.close();
    }
}

//OUTPUT:
/*CASE1: Enter an index to access the array element: 4
         Element at index 4: 50
         Program execution completed.
         
CASE2: Enter an index to access the array element: 6
         Error: Index out of bounds. Please enter a valid index between 0 and 4
         Program execution completed.
          
CASE3: Enter an index to access the array element: GDF
         Error: Please enter a valid integer as the index.
         Program execution completed.*/

