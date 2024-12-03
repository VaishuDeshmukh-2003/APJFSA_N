package javaprograms;

public class LargestNumber  
{  
public static void main(String[] args)   
{  
//initializing numbers to compare  
int a=50, b=20, c=23;

//comparing numbers, a with b and a with c   
//if both conditions are true, it will prints a

if(a>=b && a>=c) 
System.out.println(a+" is the largest Number"); 

//comparing b with a and b with c  
//if both conditions are true, it will prints b 

else if (b>=a && b>=c)  
System.out.println(b+" is the largest Number");

else  
//prints c if the above both the conditions are false  
System.out.println(c+" is the largest number");  
}  
}  

//OUTPUT:
//50 is the largest Number	