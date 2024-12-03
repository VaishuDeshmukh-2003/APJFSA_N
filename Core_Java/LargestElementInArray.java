package javaprograms;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        // Input array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Find the largest element
        int largest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        
        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
        
        scanner.close();
    }
}

//OUTPUT:
/*
 * Enter the size of the array: 5
Enter the elements of the array: 
10
20
30
40
50
The largest element in the array is: 50
*/
