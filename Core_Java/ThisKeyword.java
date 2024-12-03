package javaprograms;

/* This Keyword is used: 
this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
 */
class Test1{
    int x;
    
    // Constructor of class Test1
    Test1(int x) {
        this.x = x;
        System.out.println("x constructor: " + x);
    }

    // Method that passes 'this' to the constructor of class Test2
    void createTest2() {
        Test2 b = new Test2(this);  // Passing current instance of class Test1 (this) to class Test2 constructor
    }
}

class Test2 {
    Test1 a;
    
    // Constructor of class Test2
    Test2(Test1 a) {
        this.a = a;  
        System.out.println("Test2 constructor called. Received object of Test1 with value: " + a.x);
    }
}

public class ThisKeyword{
    public static void main(String[] args) {
        // Creating an object of class Test1
        Test1 obj = new Test1(1000);

        // Passing 'this' (the current object of Test1) to class Test2
        obj.createTest2();
    }
}

//OUTPUT:
/*x constructor: 1000
Test2 constructor called. Received object of Test1 with value: 1000
*/

