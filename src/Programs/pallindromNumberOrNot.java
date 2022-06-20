package Programs;

public class pallindromNumberOrNot {

	public static void main(String[] args) {
		System.out.println(pallindromNumberOrNot.pallindrom(1234321));
	}

	public static boolean pallindrom(int num) {
		int rev = 0, temp = num, rem;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (temp == rev) {
			return true;
		} else {
			return false;
		}
	}

}


