package sagarGivenPrograms;

public class DuplicateArray {

	public static void main(String[] args) {
		String infra[] = { "Amazon", "Paytm", "Amazon", "Paytm", "Azure" };

		System.out.println("****brute force method*******");
		for (int i = 0; i < infra.length; i++) {
			for (int j = i + 1; j < infra.length; j++) {
				if (infra[i].equals(infra[j])) {
					System.out.println(infra[i]);
				}
			}
		}
	}
}
