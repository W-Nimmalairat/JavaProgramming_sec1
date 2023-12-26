import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		
		int inputyear = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		while(!(checkYear(inputyear))) {
			inputyear = Integer.parseInt(JOptionPane.showInputDialog("Plase Input year between 1000-3000,\ninput year again:"));
		}
		/*if(isLeapYear(inputyear)) {
			JOptionPane.showMessageDialog(null, inputyear + " is Leap Year");
		}
		else {
			JOptionPane.showMessageDialog(null, inputyear + " is not Leap Year");
		}*/
		//อีกวิธี
		JOptionPane.showMessageDialog(null,
		isLeapYear(inputyear)
		?inputyear+"is Leap Year"
		:inputyear+"is not Leap Year");
		
	}//end main
	public static boolean isLeapYear(int year) {
		
		if((year%4==0)&&(year%100!=0)||(year%400==0)) {
			return true;
		}
		else
		return false;
	}//end isLeapYear
	
	public static boolean checkYear(int year) {
		
		if(year >= 1000 && year <= 3000) {
			return true;
		}
		else return false;
		
			
	}//end checkYear

}
