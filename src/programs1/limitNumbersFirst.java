package programs1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class limitNumbersFirst {

	public static void main(String[] args) {
		List<Integer> Liss = Arrays.asList(88, 8, 83, 75, 95, 62, 32, 3658, 565, 7, 7);
		
		//First Five Numbers
		List<Integer> FirstFiv = Liss.stream().limit(5).collect(Collectors.toList());
		System.out.println(FirstFiv);
		
		//skip First Five Number 
		List<Integer> FirstFive = Liss.stream().skip(5).collect(Collectors.toList());
		System.out.println(FirstFive);

		// Sum Of First five Numbers
		int sum = Liss.stream().limit(5).reduce((p, q) -> p + q).get();
		System.out.println(sum);
	}

}
