import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input author name    : ");
		String name = input.nextLine();
		System.out.print("Input author e-mail   : ");
		String email = input.nextLine();
		System.out.print("Input author name   : ");
		String gender = input.nextLine();

		
		Author a1 = new Author();
		a1.getName();
		a1.getEmail();
		a1.getGenderName();
	    a1.toString();
	    System.out.print(a1);
	}

}
