package javaprograms;

// Person interface
interface Person {
 void speak(); // Abstract method to be implemented by classes
}

//Student class implements the Person interface
class Student implements Person {
 @Override
 public void speak() {
     System.out.println("Hello, I am a Student. I love learning!");
 }
}

//Teacher class implements the Person interface
class Teacher implements Person {
 @Override
 public void speak() {
     System.out.println("Hii, I am a Teacher. i love sharing the knowledge!");
 }
}

//Main class to test the implementation
public class InterfaceSpeak{
 public static void main(String[] args) {
     // Create objects of Student and Teacher
     Person student = new Student();
     Person teacher = new Teacher();
     
     // Call their respective speak methods
     student.speak();
     teacher.speak();
 }
}

//OUTPUT:
/*
Hello, I am a Student. I love learning!
Hii, I am a Teacher. i love sharing the knowledge!
*/

