import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		System.out.print("Input value of X : ");
		x = scan.nextInt();
		System.out.print("Input value of Y : ");
		y = scan.nextInt();
		for(int i = y; y<x;i++)
		{
			System.out.print("Input value of Y, again : ");
			y = scan.nextInt();
		}
		System.out.println();
		int o = x;
		for(int i = x+1;i<=y;i++) 
		{
			int z = o + i;
			System.out.println(o +" + "+ i + " = " +z);
			o = z;
		}
		
		
		

	}

}
