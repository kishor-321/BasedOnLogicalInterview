package sagarGivenPrograms;

public class WordCountInString {

	public static void main(String[] args) {
		WordCountInString.getCountOfInputString("hey1234876hey");
		String s = "ABCDEADEF";
		int chr[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);

			chr[c - 65]++;
		}
		for (int i = 0; i < 26; i++) {
			if (chr[i] > 1)
				System.out.println((char) (i + 65));
		}
	}
	public static void getCountOfInputString(String str) {
		long count = str.chars().filter(e -> (char) e == 'h').count();
		System.out.println(count);
	}
}