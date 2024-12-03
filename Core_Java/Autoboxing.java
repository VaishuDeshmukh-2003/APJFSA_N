package javaprograms;

import java.util.*;

//This demonstrates how Java automatically handles conversions between primitives and objects with autoboxing.

public class Autoboxing {

    public static void main(String[] args) {
        // Primitive int value
        int num = 100;

        // Autoboxing: converting primitive int to Integer object
        Integer integerObj = num;

        // Display the Integer object
        System.out.println("Integer object: " + integerObj);

        // Autoboxing in collections
        // Creating a list of Integer objects
        List<Integer> integerList = new ArrayList<>();

        // Adding primitive int values
        integerList.add(9);
        integerList.add(20);
        integerList.add(99);

        // Displaying the list elements
        System.out.println("List of Integer objects: " + integerList);

        // Performing calculations using autoboxed values
        Integer sum = integerList.get(0) + integerList.get(1) + integerList.get(2);
        System.out.println("Sum of elements: " + sum);
    }
}

//OUTPUT:

/*Integer object: 100
List of Integer objects: [9, 20, 99]
Sum of elements: 128*/

