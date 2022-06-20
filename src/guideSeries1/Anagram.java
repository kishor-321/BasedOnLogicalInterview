package guideSeries1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1="Silent";
		String s2="Liste n";
		
		String str1=s1.replaceAll("\\s+", "");
		String str2=s2.replaceAll("\\s+", "");
		
		if (str1.length() !=str2.length()) {
			System.out.println("false");
			return;
			
		}
		else {
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			System.out.println("true");
			return;
		}
	}
}