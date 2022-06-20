package guideSeries1;

import java.text.DecimalFormat;

public class ElementPercentage {

	public static void main(String[] args) {

		getPercentage("Kishor Deshmane 1235 &*(");

	}

	public static void getPercentage(String str) {
		int len = str.length();

		int upperCaseCount = 0, LoweCaseCoount = 0, digit = 0, specChar = 0;

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else if (Character.isLowerCase(ch)) {
				LoweCaseCoount++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {
				specChar++;
			}

		}
		double upperCasePercentage = (upperCaseCount * 100.0) / len;
		double LowerCasePercentage = (LoweCaseCoount * 100.0) / len;
		double digitPercentage = (digit * 100.0) / len;
		double specialCharacterPercentage = (specChar * 100.0) / len;

		System.out.println(str);
		DecimalFormat twoDigitOnly = new DecimalFormat("##.##");

		System.out.println("UpperCase Percentage is : " + twoDigitOnly.format(upperCasePercentage));
		System.out.println("LowerCasePercentage is : " + twoDigitOnly.format(LowerCasePercentage));
		System.out.println("Digit Percentage is : " + twoDigitOnly.format(digitPercentage));
		System.out.println("Special Character percentage is : " + twoDigitOnly.format(specialCharacterPercentage));
	}
}
