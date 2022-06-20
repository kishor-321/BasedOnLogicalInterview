package guideSeries1;

public class RemovWhiteSpacesFromString {

	public static void main(String[] args) {
		String newString = "     My Name Is Kishor      ";
		System.out.println(newString.trim());

		String newString1 = "     My 	Name Is	 Kumar      ";
		System.out.println(newString1.replaceAll("\\s+", ""));

		String newString2 = "     My 	Name Is	 KD      ";
		String newAtring3 = "";
		for (int i = 0; i < newString2.length(); i++) {

			if ((newString2.charAt(i) != ' ') && (newString2.charAt(i) != '\t')) {
				newAtring3 = newAtring3 + newString2.charAt(i);
			}
		}
		System.out.print(newAtring3);
	}
}
