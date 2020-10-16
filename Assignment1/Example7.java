import java.util.Scanner;

//07.Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner 
// class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.
public class Example7 {
    
	
	
	   public static void main(String[] args) {
	   
		     float English,Maths,History,Science,Marathi;
		     float total;
		     float Average;
		     float percentage ;
		     Scanner S1 =new Scanner(System.in);
		     System.out.print("Please Enter the Marks of Five subject: ");
		     English = S1.nextFloat();
		     Maths = S1.nextFloat();
		     History= S1.nextFloat();
		     Science=S1.nextFloat();
		     Marathi=S1.nextFloat();
		     
		     
		     total=English+Maths+History+Science+Marathi;
		     System.out.println("Total marks of Student is: "+total);
		     
		     Average = total/5;
		     percentage = ((total/500)*100);
		     System.out.println("Percentage = "+percentage);
		     
		     
}
}
