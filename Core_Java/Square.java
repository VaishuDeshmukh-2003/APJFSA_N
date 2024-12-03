package javaprograms;

import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		
		// Area = Side * Side
		// Perimeter = 4 * side
		
       Scanner scanner = new Scanner(System.in);
       
       int side = 0;
       int area = 0;
       int perimeter = 0;
       
       System.out.print("Enter the length of side of square : ");
       side = scanner.nextInt();
       
       area = side * side;
       perimeter = 4 * side;
    		   
       	System.out.println("The Area of Square is : " + area);
       	System.out.println("The Perimeter of Square is : " + perimeter);
       
	}

}

/* Enter the length of side of square :  10
The Area of Square is : 100
The Perimeter of Square is : 40 */

