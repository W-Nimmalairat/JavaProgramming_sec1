import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		
		Scanner Input = new Scanner(System.in);
		
		PrintWriter writerFile = new PrintWriter(new FileWriter("d://txtFile//Product.txt",true));
		
		System.out.print("Product Id: ");
		String productid = Input.next();
		System.out.print("Product name: ");
		String productname = Input.next();
		System.out.print("Product Unit: ");
		int productunit = Input.nextInt();
		System.out.print("Product Price: ");
		float productprice = Input.nextFloat();
		writerFile.println(productid+" "+productname+" "+productunit+" "+productprice);
		System.out.println("Write file already...");

		writerFile.close();
		
	}

}
