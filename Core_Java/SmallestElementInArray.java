package javaprograms;
import java.util.Scanner;

public class SmallestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] array = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Finding the smallest element
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);

        // Close the scanner
        scanner.close();
    }
}

//OUTPUT:
/*Enter the size of the array: 3
Enter 3 elements:
25
35
45
The smallest element in the array is: 25
*/
