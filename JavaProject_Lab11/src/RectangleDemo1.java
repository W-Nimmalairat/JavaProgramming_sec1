import javax.swing.*;
public class RectangleDemo1 {
	public static void main(String[] args) {
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		//send  3 arguments to Constructor
		Rectangle obj1 = new Rectangle(widthInput,lengthInput,colorInput);
		
		//show the will width,length,color
		JOptionPane.showMessageDialog(null, obj1+"Area of Rectangle = "+obj1.getArea());
		
	}

}
