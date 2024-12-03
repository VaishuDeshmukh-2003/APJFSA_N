package javaprograms;

public class Narrowing {
	 
	public static void main(String[] args) {
		 
		/*Narrowing Casting (manually) - convert larger to a small data type
		double -> float -> long -> int -> char -> short -> byte */
		
		double d = 50.5;
		System.out.println("Double value : " + d); 
		
		//Convert into integer
		int num = (int)d;
		System.out.println("Integer : " + num);
	}
	

}


/*Double value : 50.5
Integer : 50*/
