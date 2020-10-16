import java.util.Scanner;

//08.	Write a program to find the simple interest. Take the principle amount, rate of interest and 
//time from user using Scanner class.
public class Example8 {

	  public static void main(String[] args) {
		
		  float p ,t ,r,simple_Intrest;
		  Scanner S1 =new Scanner(System.in);
		  
		  System.out.println("Please Enter the Principal value : ");
		  p = S1.nextFloat();
		  System.out.println("Please Enter the Rate value : ");
		  r = S1.nextFloat();
		  System.out.println("Please Enter the Time value : ");
		  t = S1.nextFloat();
		  simple_Intrest = (p*r*t)/100;
		  System.out.println("Simple intrest :"+ simple_Intrest);
		  
	}
	
}
