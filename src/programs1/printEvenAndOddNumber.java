package programs1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class printEvenAndOddNumber {

	public static void main(String[] args) {
		List<Integer> num =Arrays.asList(8,9,7,1,2,4,7,3,7,8,3);
		List<Integer> EvenNumber=num.stream().filter(e -> e%2==0).collect(Collectors.toList());
		System.out.println("All List is even numbers : "+EvenNumber);

		
		List<Integer> OddNumber=num.stream().filter(e -> e%2!=0).collect(Collectors.toList());
		System.out.println("All List is odd numbers : "+OddNumber);

	}

}
