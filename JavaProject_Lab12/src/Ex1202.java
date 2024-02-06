import java.util.Scanner;
import java.io.*;
public class Ex1202 {

	public static void main(String[] args) throws IOException{
		Scanner readfile = new Scanner(new File("d://txtFile//List107.txt"));
		//input data from console
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
		
	}
	public static void showListStudent(int sectionInput) throws IOException{
		//Read data from file
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String temp = "";
		while((temp = readFile.readLine()) != null) {
			String[] data = temp.split("\t");
			double midtemscore = Double.parseDouble(data[4]);
			double finalscore = Double.parseDouble(data[5]);
			int sectionfile = Integer.parseInt(data[3]);
			if(sectionfile == sectionInput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+data[4]+"\t"+data[5]+"\t"+findResult(midtemscore,finalscore));
			}
			
			
		}
		readFile.close();
		
	}
	
	public static String findResult(double midtemscore,double finalscore) {
		double totalscore = midtemscore+finalscore;
		if( totalscore >= 40 ) {
			return "PASS";
		}
		else {
			return "FAIL";
		}
	}
	public static void Header(int section) {
		System.out.println("*************************************************************");
		System.out.println("\t\tList of Data for Section "+section);
		System.out.println("*************************************************************");
	}

}//end class
