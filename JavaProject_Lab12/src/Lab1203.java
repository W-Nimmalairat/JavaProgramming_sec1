import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException{
		//using BufferedReader Class for read data from file
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String temp = "";
		int countbook = 0;
		int i = 1;
		while((temp = readFile.readLine()) != null) {
			String[] data = temp.split("\t");
			System.out.println(i+" "+data[0] +" ("+data[1]+"), Rating "+data[2]+" publish on "+data[5] );
			i++;
			countbook++;
		}
		System.out.println("=================================================");
		System.out.println("Total book = "+countbook);
		readFile.close();

	}

}
