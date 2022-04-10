package Unit_01;
import java.util.Scanner;

/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {
		
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		// Write Logic here!
		System.out.println("Enter the no.");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		switch(input) {
		
		case 1:
			System.out.println("The no. is 1");
			break;
			
		case 2:
			System.out.println("The no is 2");
			break;
			
		case 3:
			System.out.println("The no. is 3");
		    break;
		    
		 default:
			 System.out.println("The no is other than 1, 2, 3");
		
		
		}
		sc.close();
		
	}
}