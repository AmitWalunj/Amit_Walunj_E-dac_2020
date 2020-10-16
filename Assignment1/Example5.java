import java.util.Scanner;

//06 Write a program that takes radius of a circle as input. Read the entered radius using Scanner class.
//Then calculate and print the area and circumference of the circle

public class Example5 {
	
	   Scanner s1 =new Scanner(System.in);
	   double radius = s1.nextDouble();
	   
	   
	   void area() {
		   
		   
		   double area = Math.PI * (radius * radius);
		   System.out.println("Area of circle is :"+area);
	   }
	   
	   void circuference() {
		   double circumference= Math.PI * 2*radius;
		      System.out.println( "The circumference of the circle is:"+circumference) ;
		  
	   }
	
	   public static void main(String[] args) {
	    
		  System.out.println("Please Enter the Radius :");
		  Example5 E1 =new Example5();
		 
		  E1.area();
	      E1.circuference();
	  
	   
	  
}
}
