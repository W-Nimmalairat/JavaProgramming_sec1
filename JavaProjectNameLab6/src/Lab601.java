import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) 
	{
		String inputemail = JOptionPane.showInputDialog("Input youe e-mail");
		while(inputemail.startsWith("@")||inputemail.startsWith(" ")) {
			inputemail = JOptionPane.showInputDialog("Input your e-mail,again");
		}
		//ส่งตัวแปร input email ไปยัง method checkEmail เเละ returnค่ากลับ
		boolean vaitdateemail = checkEmail(inputemail);
		if(vaitdateemail == true) {
			JOptionPane.showMessageDialog(null,
					"Your e-mail is "+inputemail);
		}
		else {
			JOptionPane.showMessageDialog(null,
					"Your e-mail is not hotmail or gmail dot com");
		}
	}//end of main() Method
	
	public static boolean checkEmail(String email) //Method checkEmail
	{
		if (email.endsWith("hotmail.com")||email.endsWith("gmail.com")) 
		{
			return true;
		}
		return false;
		
		
	}

}
