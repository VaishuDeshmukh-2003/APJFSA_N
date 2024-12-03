package javaprograms;

//The 'super' keyword allows referencing the parent class or superclass of a subclass in Java.

//Parent class
class Parent {
 // Parent class constructor
 Parent() {
     System.out.println("Parent class is a Base Class");
 }
}

//Child class
class Child extends Parent {
 // Child class constructor
 Child() {
     // Invoke the parent class constructor using super()
     super();
     System.out.println("Child class is subclass of parent class");
 }
}

public class SuperKeywordExample {
 public static void main(String[] args) {
     // Create an object of the Child class
     // This will invoke both the parent and child constructors
     Child Obj = new Child();
 }
}

//OUTPUT:
/*Parent class is a Base Class
Child class is subclass of parent class*/