package programs1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfIntergerNumbers {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 5, 8, 5, 7, 5, 8, 4, 5, 4, 5, 4, 5, 4, 4);
		Optional<Integer> sum = number.stream().reduce((a, b) -> a + b);
		System.out.println("Sum Of Number : " + sum.get());

	}

}
