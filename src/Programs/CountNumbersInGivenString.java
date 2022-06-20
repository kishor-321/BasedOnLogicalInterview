package Programs;

public class CountNumbersInGivenString {

	public static void main(String[] args) {
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

		

		String word = "hey1234876hey";
		long count = word.chars().filter(e -> (char) e == 'h').count();
		System.out.println(count);

		CountNumbersInGivenString.getCountOfInputString('5');
	}

	public static long getCountOfInputString(char c1) {
		String numbers1 = "123456789987654321";
		long Num = numbers1.chars().filter(e -> (char) e == c1).count();
		System.out.println(Num);
		return Num;
	}

}
