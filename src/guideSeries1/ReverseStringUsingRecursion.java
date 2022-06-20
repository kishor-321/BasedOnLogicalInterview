package guideSeries1;

public class ReverseStringUsingRecursion {

	public static void main(String[] args) {
		String rev = "SELENIUM";
		String empty = "";

		int len = rev.length();

		for (int j = len - 1; j >= 0; j--) {
			empty = empty + rev.charAt(j);
//			System.out.println(empty);
		}
		System.out.println(empty);

		
		
		// Using String Buffer class
		StringBuffer ref = new StringBuffer(rev);
		System.out.println(ref.reverse());

	}
}