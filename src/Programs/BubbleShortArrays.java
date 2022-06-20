package Programs;

import java.util.Arrays;

public class BubbleShortArrays {

	public static void main(String[] args) {
		int a[] = { 4, 2, 1, 5, 3 };
		System.out.println("Array Before Sorting : " + Arrays.toString(a));

		int n = a.length;
		for (int i = 0; i < n - 1; i++) {// num of passes
			for (int j = 0; j < n - 1; j++) {// Iteration in each pass
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}
		System.out.println("Array After Sorted Order : "+Arrays.toString(a));
	}
}
