package javaprograms;

/*Inheritance in java used to inherit another classes.
 Inheritance means creating new classes on based ones. 
 */
class Doctor {
 // Method to display information about a doctor
 public void duty() {
     System.out.println("Doctor is checking the patients.");
 }
}

//Using MultilevelInheritance
//Derived class: Surgeon 
class Surgeon extends Doctor {
	
public void duty() {
     System.out.println("Surgeon is performing surgery.");
 }
 
 public void Surgery() {
     System.out.println("Surgeon is performing a surgery with Senior.");
 }
}
//Using hierarchical Inheritance
//Derived class: Nurse 
class Nurse extends Doctor {
 public void duty() {
     System.out.println("Nurse is taking care of patients");
 }
 public void assist() {
     System.out.println("Nurse is assisting in surgery.");
 }
}

public class Inheritance{
 public static void main(String[] args) {
     // Creating objects of each class
     Doctor doctor = new Doctor();
     System.out.println("Doctor's duty:");
     doctor.duty(); // Calls the base class method
     
     Surgeon surgeon = new Surgeon();
     System.out.println("Surgeon's duty:");
     surgeon.duty(); // Calls the overridden method in Surgeon
  // subclass
     System.out.println("Surgeon task:");
     surgeon.Surgery(); // Calls method in Surgeon
     
  // subclass
     Nurse nurse = new Nurse();
     System.out.println("Nurse's duty:");
     nurse.duty(); // Calls the overridden method in Nurse
     System.out.println("Nurse task:");
     nurse.assist(); // Calls method in Nurse
 }
}
//OUTPUT:
/*Doctor's duty:
Doctor is checking the patients.
Surgeon's duty:
Surgeon is performing surgery.
Surgeon task:
Surgeon is performing a surgery with Senior.
Nurse's duty:
Nurse is taking care of patients
Nurse task:
Nurse is assisting in surgery.
*/

