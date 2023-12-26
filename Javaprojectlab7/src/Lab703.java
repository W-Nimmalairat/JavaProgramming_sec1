import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arraynum = {78,36,58,41,25,92,75};
		System.out.print("Input index of array : ");
		int number = scan.nextInt();
		while(number > (arraynum.length-1) || number < 0) 
		{
			System.out.print("Input index of array,again : ");
			number = scan.nextInt();
		}
		
	}

}
