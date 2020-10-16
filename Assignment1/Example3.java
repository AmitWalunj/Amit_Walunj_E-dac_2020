import java.util.Scanner;

/*03.	Find the result of following expressions. You need to determine the primitive data type of the variable by looking
carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

public class Example3 {
  
	 public static void main(String[] args) {
		// int x=3;
		 Scanner s1 =new Scanner(System.in);
		 System.out.println("Please Enter the value of X : ");
		 int x = s1.nextInt();
		
		 int y;
		 	  
		 y=((x*x)+(3*x-7));
		 System.out.println("Value of  first Y is :"+y);
		 y= x++ + ++x;
		 
		 System.out.println("Value of Second  Y is :"+y);
		 
	     int z = x++ - --y - --x  +  x++;
         System.out.println("Value of  Third Y is :"+z);
         
         Boolean x1 = true;
         Boolean y1 = false;
         Boolean z1;
         
         z1 = x1 && y1 || !(x1 || y1);
         
         System.out.println("Value of Z1 is :"+z1);
         
		 
		
		 
		
	    	
	}
}
