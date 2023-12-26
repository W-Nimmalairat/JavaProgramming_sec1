import javax.swing.*;
import java.util.*;
public class Lab604 {
	static Scanner input = new Scanner(System.in);
	static String studentId,subId;
	static int subjectId;
	boolean stbid,subid;
	public static void main(String[] args) {
		
		inputStudent();

	}//end main
	public static void inputStudent() {
		
		do{
			System.out.print("Enter Student Id:");
			studentId = input.next();
			System.out.print("Enter Subject Id:");
			subjectId = input.nextInt();
			subId = subjectId + "";
		}
		while(!isLength(studentId,subId));
		System.out.println();
		displayData(isITStudent(studentId),isITSubject(subId));	
		
		
	}//end inputStudent
	public static boolean isLength(String sid, String subId) {
		
		if(sid.length() == 10 && subId.length() == 7) {
			return true;
		}
		return false;
		
	}//end isLength
	public static boolean isITStudent(String sid) {
		
		if(sid.substring(0,3).equals("211")&&sid.substring(3,6).equals("311")) {
			return true;
		}
		else return false;
	}//end isITStudent

	public static boolean isITSubject(String subid) {
		
		if(subid.substring(0,2).equals("21")&&subid.substring(4,5).equals("1")) {
			return true;
		}
		else return false;
	}// end isITSubject
	
	public static void displayData(boolean stbid ,boolean subid) {
		
		if(stbid) {
			System.out.println("Student Id: "+studentId+" 1st your student in IT");
		}
		else System.out.println("Student Id: "+studentId+" 1st not your student in IT");
		if(subid) {
			System.out.println("Enroll in course for Year 1");
		}
		else System.out.println("not enroll in course for Year 1");
		}
	}//end displayData

