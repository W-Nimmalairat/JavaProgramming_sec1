import javax.swing.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null, obj2+"\nArea of Rectangle = "+obj2.getArea());
	}

}
