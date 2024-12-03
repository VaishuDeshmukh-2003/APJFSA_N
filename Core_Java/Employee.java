package javabeans;

//JavaBean is Serializable
class Employe implements java.io.Serializable {
	
	private String Name;
	private int Id;
	private int Age;
	private int Salary;
	
	public Employe() {}
	
	//Using Setter and Getter Method
	
		public String getName() {
			return Name;
		}
		public void setname(String Name) {
			this.Name = Name;
		}
		public int getId() {
			return Id;
		}
		public void setId(int Id) {
			this.Id = Id;
		}
		public int getAge() {
			return Age;
		}
		public void setAge(int Age) {
			this.Age = Age;
		}
		public int getsalary() {
			return Salary;
		}
		public void setSalary(int Salary) {
			this.Salary = Salary;
		}
	}

public class Employee{
//implementing in main method
	public static void main(String[] args) {

		Employe obj=new Employe();
		obj.setname("Shyam");
		System.out.println("Name:"+obj.getName());
		
		obj.setId(123);
		System.out.println("Id:"+obj.getId());
		
		obj.setAge(35);
		System.out.println("Age:"+obj.getAge());
		
		obj.setSalary(1000);
		System.out.println("Salary:"+obj.getsalary());

	}

}

/*Name:Shyam
Id:123
Age:35
Salary:1000*/
