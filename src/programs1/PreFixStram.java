package programs1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PreFixStram {

	public static void main(String[] args) {
		List<Integer> Numbers =Arrays.asList(2,2,5,8,75,35,62,25,36,17,15,28,2,81,2,2222,228,225,22,522,212,27);
		List<Integer> NumberstartWithTwo = Numbers.stream()
																		.map(e -> String
																				.valueOf(e))
																					.filter(e -> e.startsWith("2"))
																						.map(Integer::valueOf)
																							.collect(Collectors.toList());

		System.out.println("Number is Start With The 2 Number : "+NumberstartWithTwo);
	}

}
