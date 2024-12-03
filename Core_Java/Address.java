package javaprograms;


public class Address {

    // Attributes of the Address class
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor to initialize the attributes
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Using Getter and setter method
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //  displaying the address 
    public void displayAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
    }

    // Main method
    public static void main(String[] args) {
        // Creating an Address object using the constructor
        Address myAddress = new Address("65 Ram st", "Dharashiv", "Maharashtra", "657443");
        myAddress.displayAddress();
    }
}

//OUTPUT:
/*Street: 65 Ram st
City: Dharashiv
State: Maharashtra
Zip Code: 657443
*/

