package guideSeries1;

import java.util.HashMap;

public class FirstRepeatedAndNonRepeatedString {

	public static void main(String[] args) {

		repeatedChar("JavaConceptOfTheDay");
	}

	public static void repeatedChar(String inputString) {
		char[] charArray = inputString.toCharArray();
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();

		for (char c : charArray) {
			// If char is not present add char as key and value 1
			if (!hashmap.containsKey(c)) {
				hashmap.put(c, 1);
			} else {
				// if char already present increased size +1
				hashmap.put(c, hashmap.get(c) + 1);
			}

		}
		for (char c : charArray) {
			if (hashmap.get(c) == 1) {
				System.out.println("First non repeated character from string is : " + inputString + " is " + c);
				break;
			}
		}
		for (char c : charArray) {
			if (hashmap.get(c) >= 1) {
				System.out.println("First repeated character from string is : " + inputString + " is " + c);
				break;
			}
		}
	}
}
