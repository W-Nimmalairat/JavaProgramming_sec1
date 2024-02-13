import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		//create
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		Scanner Input = new Scanner(System.in);
		int i = 1;
		while(true){
			System.out.print("Sentence: ");
			String word = Input.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.println("File is save");
		writeFile.close();
	}

}
