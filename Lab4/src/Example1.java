import java.util.*;//define object for input data from keyboard
public class Example1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input number : ");//first number
		
		int preNumber = scan.nextInt();
		
		int currenNumber;
		
		while(true) //loop for 2 number
		{
			System.out.print("Input number : ");
			currenNumber = scan.nextInt();
			
			if(currenNumber < preNumber) 
			{
				
				System.out.print("\nBYE BYE");
				break;
			}
			preNumber = currenNumber;
		}
		
		
		
	}

}
