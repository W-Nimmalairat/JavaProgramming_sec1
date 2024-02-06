import java.util.Scanner;
import java.io.*;
public class Ex1201 {

	public static void main(String[] args) throws IOException{
		Scanner readfile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readfile.hasNext()) {
			String fname = readfile.next();
			readfile.next();
			readfile.next();
			String email = readfile.next().toUpperCase();
			System.out.println(fname+" "+"("+email+")");
		}
		readfile.close();
	}

}
