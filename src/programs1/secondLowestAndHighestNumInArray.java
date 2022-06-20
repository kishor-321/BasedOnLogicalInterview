package programs1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondLowestAndHighestNumInArray {

	public static void main(String[] args) {

		List<Integer> Liss = Arrays.asList(88, 2, 8, 83, 75, 95, 62, 32, 3658, 565, 7, 7);

		// second Highest number from array list
		int secondhigh = Liss.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
		System.out.println(secondhigh);

		// sec Highest Number
		int sechi = Liss.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println(sechi);

		// Second Lowest Numbers
		int secondLowest = Liss.stream().sorted().distinct().skip(1).findFirst().get();
		System.out.println(secondLowest);
	}

}
