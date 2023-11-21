import javax.swing.*;//input data from Dialog box
import java.text.*;
public class Example3 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.0");
		//input and convert weight and height(cm) from string to double
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input Height:"));
		height /= 100;//height=height/100
		double bmi = weight/(height*height);
		String bmiCategory;
		
		if(bmi <= 18.5)bmiCategory ="Underweight";
		else if(bmi <= 24.9)bmiCategory ="Normal-weight";
		else if(bmi <= 29.9)bmiCategory ="Over-weight";
		else bmiCategory ="Obesity";
		JOptionPane.showMessageDialog(null,"BMI = "
				+frm.format(bmi)
				+"\nYou're "+bmiCategory,
				"BMI",
				JOptionPane.WARNING_MESSAGE);
		//จัดรูปแบบโดยใช้ภาษา C
		/*JOptionPane.showMessageDialog(null,"BMI = "
				+String.format("%.1f",bmi)
				+"\nYou're "+bmiCategory,
				"BMI",
				JOptionPane.WARNING_MESSAGE);*/
		
		
		

	}

}
