import java.util.*;//1.Import for input data from keyboard
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2. create class Scanner for input data from Keyboard
		Scanner input = new Scanner(System.in);
		//3. display and input data
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		System.out.print("Input product unit   : ");
		int productunit = input.nextInt();
		System.out.print("Input price per unit : ");
		float priceperunit = input.nextFloat();
		System.out.println();
		float total = productunit * priceperunit;
		System.out.println("Total Price is "+frm.format(total)+" baht.");
		float vat = total+(total*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(vat)+" baht.");
	}

}
