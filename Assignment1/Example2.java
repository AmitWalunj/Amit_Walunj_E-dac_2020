//02.	Write a program to declare a variable named rollNo of integer type.
//Assign it a value (let say 100) to it and print the following statement roll no = 100 .


public class Example2 {
	static int rollNu =1000;            // Static variable
	
	  int rollNo =100;                 // instance Variable
	
	 void display() {
		 
		 System.out.println(" ************I am in plane  Method**************88 ");
		 System.out.println("Accesing static variable rollNu in non static method  value is :"+rollNu);
		 
	 }
	
	 static void display1() {        //  Static Method
		
		 System.out.println("!!!!!!!!!!!!!!!I am in Static method!!!!!!!!!!!!!!!!!!!!1"); 
// System.out.println("Accesing static variable in non static method "+rollno);  Can't access the instance variable in static method 
	 }
	 
	 public static void main(String[] args) {
		   Example2 E1 = new Example2();   //  Object creation to access the instance variable .
		   
		   System.out.println(" ******Accessing instance variable rollNo value is : "+E1.rollNo);
		   System.out.println(" !!!!!!!Accessing static variable rollNo value  is : "+rollNu);
		   
		   E1.display();    // call to instance method through object.
		    display1();     // call to static method
		   
		   
		   
		   
	}
	
	
}
