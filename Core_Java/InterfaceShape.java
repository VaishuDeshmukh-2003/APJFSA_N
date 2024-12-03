package javaprograms;

//Define the Shape interface
interface Shape {
 double getArea();
}

//Rectangle class implementing Shape interface
class Rectangle implements Shape {
 private double length;
 private double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double getArea() {
     return length * width;
 }
}

//Circle class implementing Shape interface
class Circle implements Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double getArea() {
     return Math.PI * radius * radius;
 }
}

//Triangle class implementing Shape interface
class Triangle implements Shape {
 private double base;
 private double height;

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double getArea() {
     return 0.5 * base * height;
 }
}

//Main class to test the implementation
public class InterfaceShape{
 public static void main(String[] args) {
     // Create instances of each shape
     Shape rectangle = new Rectangle(65, 30);
     Shape circle = new Circle(10);
     Shape triangle = new Triangle(20, 10);

     // Display the area of each shape
     System.out.println("Area of Rectangle: " + rectangle.getArea());
     System.out.println("Area of Circle: " + circle.getArea());
     System.out.println("Area of Triangle: " + triangle.getArea());
 }
}

//OUTPUT:
/*
Area of Rectangle: 1950.0
Area of Circle: 314.1592653589793
Area of Triangle: 100.0
*/
 

