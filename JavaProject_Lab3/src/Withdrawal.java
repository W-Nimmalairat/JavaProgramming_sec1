import javax.swing.*;
import java.util.*;
import java.text.*;
public class Withdrawal {
	
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int withrawMoney = Integer.parseInt(
				JOptionPane.showInputDialog("Youe balance : "+frm.format(balance)+
						"\nInput money to withdraw: "));
		if(withrawMoney > balance) 
		{
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (withrawMoney > 20000)
		{
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withraw more than 20,000",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (withrawMoney%100!=0) 
		{
			JOptionPane.showMessageDialog(null,
					"Error:Cannot withraw 15 baht",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null,
					"You withdraw "+ frm.format(withrawMoney)+" baht."
					+ "\n1000 = "+withrawMoney/1000+ "\n500 = "+withrawMoney%1000/500 + "\n100 = "+(withrawMoney%1000%500)/100,
					"Message",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}	
}
