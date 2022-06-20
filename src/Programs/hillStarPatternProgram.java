package Programs;

public class hillStarPatternProgram {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 9; j >= i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j >= 1; j--) {
				if (j > i) {
					System.out.print(" "); //for any type type pattern just need to change the space add or remove
				} else {
					System.out.print(" *");
				}
			}
			System.out.println();
		}
	}
}
