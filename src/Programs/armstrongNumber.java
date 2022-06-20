package Programs;

public class armstrongNumber {

	public static void main(String[] args) {
		System.out.println(armstrongNumber.armstron(153));
	}

	public static boolean armstron(int num) {
//		int num ;
		int temp = num, rem = 0, sum = 0;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + rem * rem * rem;
			temp = temp / 10;
		}
		if (num == sum) {
			return true;
		} else {
			return false;
		}
	}
}