import javax.swing.*;//1. import library for input data from dialog box
import java.text.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.input data from dialog box
		String productname = JOptionPane.showInputDialog("Input Product Name: ");//รับข้อความเเล้วไม่ต้องแปลง
		//input unitprice from dialog box
		/* String strunit = JOptionPane.showInputDialog("Input Product Unit: ");//รับจากข้อความเเล้วแปลงข้อมูลเป็นตัวเลข
		//convert string to int
		int productunit = Integer.parseInt(strunit); */
		
		int productunit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit: "));//แปลงเเบบสั้น
		
		//input price per unit from dialog box
		/*String strprice = JOptionPane.showInputDialog("Input Price per unit: ");
		float priceperunit = Float.parseFloat(strprice);*/
		
		float priceperunit = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit: "));
		
		//calculate total price
		float totalprice = productunit * priceperunit;
		float vat = totalprice+(totalprice*7/100);
		
		//display data to dialog box
		JOptionPane.showMessageDialog(null, "Total Price is "
				+ frm.format(totalprice)+" baht."+"\nAdd VAT 7% is "+frm.format(vat)+" baht.");

	}

}
