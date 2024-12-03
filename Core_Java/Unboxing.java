package javaprograms;

import java.util.*;

//This demonstrates how Java handles the conversion from objects to primitives automatically through unboxing.

public class Unboxing {
    public static void main(String[] args) {
        // Creating an Integer object
        Integer integerObj = Integer.valueOf(60);

        // Unboxing: converting Integer object to primitive int
        int num = integerObj;

        // Display the primitive int
        System.out.println("Primitive int value: " + num);

        // Unboxing in collections
        // Creating a list of Integer objects
        List<Integer> integerList = new ArrayList<>();
        integerList.add(79); // Autoboxing
        integerList.add(45);
        integerList.add(50);

        // Using unboxing to calculate the sum of elements
        int sum = 0;
        for (Integer i : integerList) {
            sum += i; // Unboxing of Integer to int
        }

        // Displaying the sum
        System.out.println("Sum of elements: " + sum);
    }
}

//OUTPUT:
/*Primitive int value: 60
Sum of elements: 174*/

