package javaprograms;

/*overloading occurs when methods in the same class have the same method name but different parameters*/

public class ConstructorOverloading{
    // Fields of the BankCustomer
    private String acno;  // Account number
    private String atype; // Account type (Savings, Checking)
    private double amt;   // Account balance 

    // Constructor 1: No-argument constructor
    public ConstructorOverloading() {
        this.acno = "Unknown";
        this.atype = "Unknown";
        this.amt = 0;
    }

    // Constructor 2: Constructor with account number and account type
    public ConstructorOverloading(String acno, String atype) {
        this.acno = acno;
        this.atype = atype;
        this.amt = 0;  // Default amount is 0
    }

    // Constructor 3: Constructor with account number, account type, and amount
    public ConstructorOverloading(String acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Method to display customer information
    public void displayCustomerInfo() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Account Balance: " + amt);
    }

    public static void main(String[] args) {
        // Creating the object
    	ConstructorOverloading Ram= new ConstructorOverloading();
    	ConstructorOverloading Shyam= new ConstructorOverloading("764488", "Savings");
    	ConstructorOverloading Sita =new ConstructorOverloading("8474635", "Checking", 67000);

        // Display customer information
        System.out.println("Ram Info:");
        Ram.displayCustomerInfo();
        System.out.println();

        System.out.println("Shyam Info:");
        Shyam.displayCustomerInfo();
        System.out.println();

        System.out.println("Sita Info:");
        Sita.displayCustomerInfo();
    }
}

//OUTPUT:

/*Ram Info:
Account Number: Unknown
Account Type: Unknown
Account Balance: 0.0

Shyam Info:
Account Number: 764488
Account Type: Savings
Account Balance: 0.0

Sita Info:
Account Number: 8474635
Account Type: Checking
Account Balance: 67000.0
*/
