package guideSeries1;

import java.util.HashMap;
import java.util.Map;

public class OccuramceOfLetter {

	public static void main(String[] args) {
		String name = "RAMARAV";
		Map<Character, Integer> CharInt = new HashMap<Character, Integer>();
		char str[] = name.toCharArray();

		for (char c : str) {
			if (CharInt.containsKey(c)) {
				CharInt.put(c, CharInt.get(c) + 1);
			} else {
				CharInt.put(c, 1);
			}
		}
		System.out.println(name + " : " + CharInt);
	}
}