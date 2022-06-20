package programs1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortAScAndDescending {

	public static void main(String[] args) {
		List<Integer> Liss = Arrays.asList(88, 8, 83, 75, 95, 62, 32, 3658, 565, 7, 7);
		List<Integer> asc=	Liss.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);

		List<Integer> desc =Liss.stream().sorted(Collections.reverseOrder()).collect((Collectors.toList()));
		System.out.println(desc);
		
	}

}
