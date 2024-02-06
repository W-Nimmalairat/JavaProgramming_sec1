import java.util.Scanner;
import java.io.*;

public class Lab1205 {

	public static void main(String[] args) throws IOException{
		Head();
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Student.txt"));
		String temp = "";
		int i = 1;
		while((temp = readFile.readLine()) != null) {
			String[] data = temp.split(" ");
			double grade = Double.parseDouble(data[4]);
			String id = data[0];
			Level(id);
			Status(grade);
			System.out.println(i+"\t"+data[0]+"\t"+Level(id)+"\t"+data[2].charAt(0)+"."+data[3]+"\t"+data[4]+"\t"+Status(grade));
			i++;
		}
		readFile.close();

	}
	public static String Level(String id) {
		if(id.substring(0,2).equalsIgnoreCase("18")) {
			return "4th";
		}
		else{
			return "3th";
		}
	}
		
	
	public static String Status(double grade2) throws IOException{
		if(grade2 >= 2.00) {
			return "Pass";
		}
		else if(grade2 <=2.00||grade2 >=1.00) {
			return "Critical";
		}
		else {
			return "Retired";
		}
		
		
	}
	public static void Head() {
		System.out.println("NO.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("******************************************************************");
	}

}
