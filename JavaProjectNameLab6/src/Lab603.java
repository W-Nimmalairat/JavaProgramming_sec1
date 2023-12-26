import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullname,firstName;
		System.out.print("Please enter your name, separated by a space.\n:");
		fullname = input.next();
		System.out.print(abbreviatName(fullname));
	}//end main
	
	public static String abbreviatName(String fullname) {
		String name = "";
		for(int i = 0; i<=fullname.length();i++) {
			
			if(fullname.charAt(i)==' ') {
				name = fullname.charAt(i+1)+".";
			}
		}
		return name;
		
	}//end abbreviatName

}
