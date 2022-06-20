package guideSeries1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFileRead {
	static String path = "F:\\acceleration\\workspace\\Programs_Based_On_Logics\\src\\guideSeries1\\read.txt";

	public static void main(String[] args) {

		int wodCount=0;
		int charCount=0;
		int lineCount=0;
		
		try {
			BufferedReader readFile=new BufferedReader(new FileReader(path));
			String currtline=readFile.readLine().trim();
			while (currtline!=null) {
				lineCount++;
				
				//word
				String Words[]=currtline.split(" ");
				wodCount = wodCount+Words.length;
				
				//line
				for(String word:Words) {
					charCount=charCount+word.length();
				}
				currtline=readFile.readLine();
			}
			
			System.out.println("word count is : "+wodCount);
			System.out.println("Line Count is : "+lineCount);
			System.out.println("Total chars is : "+charCount);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
