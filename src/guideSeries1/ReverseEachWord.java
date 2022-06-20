package guideSeries1;

public class ReverseEachWord {
	public static void main(String[] args) {
		String word = "Java Programmimg";
		String[] words = word.split(" ");
		
		String wods = " ";
		for (String w : words) {
			String reverseWords = " ";
			
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWords = reverseWords + w.charAt(i);
			}
			wods = wods + reverseWords + " ";
		}
		System.out.println(wods);
	}
}
