package javaprograms;

import java.util.Scanner;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to divide 10 by: ");
            int divisor = scanner.nextInt(); //  Input Mismatch Exception
            System.out.print("Enter an array index (0-2): ");
            int index = scanner.nextInt(); //  Input Mismatch Exception

            int[] numbers = {1, 2, 3};
            int result = 10 / divisor; // Arithmetic Exception
            System.out.println("Value at the given index: " + numbers[index]); // ArrayIndexOutOfBounds Exception

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index.");
        } catch (Exception e) {
            System.out.println("General exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }

        System.out.println("Program continues after the try-catch-finally block.");
    }
}

//OUTPUT:
/*Enter a number to divide 10 by: 100
Enter an array index (0-2): 1
Value at the given index: 2
This is the finally block. It always executes.
Program continues after the try-catch-finally block.
*/


