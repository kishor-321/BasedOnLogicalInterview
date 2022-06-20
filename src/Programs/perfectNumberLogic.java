package Programs;

public class perfectNumberLogic {

	public static void main(String[] args) {
		System.out.println(perfectNumberLogic.numberisPerfect(27));

	}

	public static boolean numberisPerfect(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				sum = sum + i;

		}
		if (num == sum) {
			return true;
		}
		return false;

	}
}
