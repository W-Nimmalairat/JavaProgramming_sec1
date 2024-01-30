import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" ");
		String authorname = input.nextLine();
		System.out.print(" ");
		String year = input.nextLine();
		System.out.print(" ");
		String name = input.nextLine();
		System.out.print(" ");
		String email = input.nextLine();
		
	
		FictionBook f1 = new FictionBook(authorname, 0);
		f1.getLastName();
		f1.getLastName();
		f1.checkEmail();
	    f1.toString();
		
		
	}
	

}
