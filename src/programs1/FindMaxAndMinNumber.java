package programs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinNumber {

	public static void main(String[] args) {
		List<Integer> Liss = Arrays.asList(88, 8, 83, 75, 95, 62, 32, 3658, 565, 7, 7);
		int MAx = Liss.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(MAx);
		
		int Min=Liss.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(Min);
	}

}
