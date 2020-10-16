import java.util.Scanner;

//12.	In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. 
//If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary 
//is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
public class Example12 {
    
	public static void main(String arg[]) {  
		
		    Scanner s1 =new Scanner(System.in);
		    float basic,bhra,bda,hra,da,bgs,gs;
		
		    System.out.println("Enter the basic salary: ");
		     basic = s1.nextFloat();
		    
		     bhra=basic*0.10f;
		     bda=basic*0.90f;
		     hra=2000;
		     da=basic*0.98f;
		     bgs=basic+bhra+bda;
		     gs=hra+da;
		     
		     if(basic<10000){
		    	 System.out.println("Gross Salary is:"+bgs);
		     }
		     else
		     {
		    	 System.out.println("Gross salary is:"+gs);
		    	 
		     }
		     
		     
		     
		     
		 }
		  
}
