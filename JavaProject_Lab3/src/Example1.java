import javax.swing.*;//input data from Dialog box
import java.text.*;//จัดรูปแบบตัวเลข
public class Example1 {
	public static void main(String[] args) 
	{DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
		//รับข้อมูลทาง Dialog box เเละแปลงข้อมูลให้เป็นเลขจำนวนเต็ม
		int numberofCustomber = Integer.parseInt(
				JOptionPane.showInputDialog("Hom many customber per bill?"));
		double discount,totalPrice = 0;
		//calculate total price of buffet
		totalPrice = BUFFET * numberofCustomber;
		//using Confirm Dialog box
		int member;
		do {
			member = JOptionPane.showConfirmDialog(null,"Total Price is "
					+ frm.format(totalPrice)+" baht."
					+"\nDo you have a member card?");
		}
		while(member == JOptionPane.CANCEL_OPTION);
			
		if(member == JOptionPane.YES_OPTION) 
		{
			discount = totalPrice * 90/100 ;//discount = totalPrice-(totalPrice*10/100)
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is "+ frm.format(discount) + " baht.");
		}//end
		else if(member == JOptionPane.NO_OPTION) 
		{
			JOptionPane.showMessageDialog(null,
					"Amount to be paid is "+ frm.format(totalPrice) + " baht.");
		}
		
	}

}
