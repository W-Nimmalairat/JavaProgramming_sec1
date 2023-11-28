import java.util.*;
import java.text.*;
public class SalepersonSalary {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		 // Declare constants
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 
		 System.out.print("Enter sales in dollars (or -1 to end): ");
		 sales = scan.nextInt();
		 if(sales < SENTINEL) 
		 {
			 System.out.print("bye");
		 }
		 else if (sales > SENTINEL)
		 {
			 salary = (sales*COMMISSION_RATE)+1000;
			 System.out.print("Salary is: "+frm.format(salary));
		 }
		
	}

}
