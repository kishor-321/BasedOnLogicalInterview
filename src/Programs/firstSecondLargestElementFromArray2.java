package Programs;

public class firstSecondLargestElementFromArray2 {

	public static void main(String[] args) {
		int[] a = { 6, 8, 20, 45, 52, 41, 25 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) { // < > depending on arrows for smallest second number or second largest number
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println("second largest element is : " + a[1]);
		System.out.println("First largest element is : "+a[0]);
	}
}
