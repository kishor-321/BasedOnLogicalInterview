package programs1;

import java.util.Arrays;
import java.util.List;

public class AverageOfGivenNumbers {

	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(4,8,7,9,8,8);
		double avg=number.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average of numbers is : "+avg);

	}

}
