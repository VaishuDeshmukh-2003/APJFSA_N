package javabeans;

//JavaBean is Serializable
class Customer implements java.io.Serializable {
	
	private String Name;
	private int Accno;
	private String Branch;
	private int Balance;
	
	//parameterized constructor
    public Customer(String name, int AccNo, String Branch, int balance) {
        this.Name = name;
        this.Accno = Accno;
        this.Branch = Branch;
        this.Balance = balance;
    }
    void display() {
        System.out.println(Name + " " + Accno + " " + Branch + " " + Balance);
    }
	
	public Customer() {}
	
	//Using Setter and Getter Method
	
		public String getName() {
			return Name;
		}
		public void setname(String Name) {
			this.Name = Name;
		}
		public int getAccno() {
			return Accno;
		}
		public void setAccno(int Accno) {
			this.Accno = Accno;
		}
		public String getBranch() {
			return Branch;
		}
		public void setBranch(String Branch) {
			this.Branch = Branch;
		}
		public int getBalance() {
			return Balance;
		}
		public void setBalance(int Balance) {
			this.Balance = Balance;
		}
	}

public class BankAcc {
  //implementing in main method
	public static void main(String[] args) {

		Customer obj=new Customer();
		obj.setname("Ram");
		System.out.println("Name:"+obj.getName());
		
		obj.setAccno(54647);
		System.out.println("Accno:"+obj.getAccno());
		
		obj.setBranch("SBI");
		System.out.println("Branch:"+obj.getBranch());
		
		obj.setBalance(100000);
		System.out.println("Balance:"+obj.getBalance());

	}

}

//OUTPUT:

/*Name:Ram
Accno:54647
Branch:SBI
Balance:100000*/