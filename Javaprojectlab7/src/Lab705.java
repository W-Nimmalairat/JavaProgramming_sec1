import javax.swing.*;
public class Lab705 {

	public static void main(String[] args) {
		int[] array = new int[5];
		for(int i = 0; i<array.length;i++) 
		{
		array[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+":"));
		}
		showEven(array);
		showOdd(array);
	}
	public static void showEven(int[] nums) {
		String evennum = "";
		for(int _nums : nums) 
		{
			if(_nums%2==0) 
			{
				evennum = evennum +" "+_nums;
			}
		}
		JOptionPane.showConfirmDialog(null,"List of even number:\n"+ evennum);
		
	}//end showEven
	public static void showOdd(int[] nums) {
		String oddnum = "";
		for(int _nums : nums) 
		{
			if(_nums%2!=0) 
			{
				oddnum = oddnum +" "+_nums;
			}
		}
		JOptionPane.showConfirmDialog(null,"List of odd number:\n"+ oddnum);
		
		
	}//end showOdd
}
