import javax.swing.*;
import java.util.*;
public class Icecream {

	public static void main(String[] args) {
		int VANILLA = 10;
		int CHOCOLATE = 15;
		int TOPPING = 5;
		String number = JOptionPane.showInputDialog(
				"[1] Vanilla Flavor 10 B."
				+ "\n[2] Chocolate Flavor 15 B."
				+ "\nPress number to choose flavor");
		if ( number == "1" && number == "2" ) 
		{
			JOptionPane.showConfirmDialog(null,
					"Do you want to add topping");
		}
		
	}

}
