package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class longestSubstringWithoutRepeatedCharacter {

	public static void main(String[] args) {
		lengthOfLongestSubstring("abbac");
	}

	public static void lengthOfLongestSubstring(String s) {
		String longestSuString= null;
		int longestSubStringLength=0;
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>longestSubStringLength) {
				longestSubStringLength=map.size();
				longestSuString=map.toString();
			}
		}
		System.out.println("The Longest SubString is : "+longestSuString);
		System.out.println("The Longest SubString Length is : "+longestSubStringLength);
	
	}
}
