 import java.util.Scanner;
//15.	Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is 
//eligible for marriage or not.

class Example15
{
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		// taking input from user 
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter sex: M/F");
		int sex = sc.next().charAt(0);
		
		System.out.println("Are you married? Y/N");
		int married = sc.next().charAt(0);
		
		// checking if user is female
		if(sex == 'F') {
			System.out.println("You will work only in urban areas");
		}
		
		// checking if user is male
		if(sex == 'M') {
			if((age >= 20) && (age < 40)) {
				System.out.println("You may work anywhere");
			}
			else if((age >= 40) && (age < 60)) {
				System.out.println("You will work only in urban areas");
			}
			else {
				System.out.println("ERROR");
			}
		}
	}
}
 


