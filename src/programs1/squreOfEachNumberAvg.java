package programs1;

import java.util.Arrays;
import java.util.List;

public class squreOfEachNumberAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numb =Arrays.asList(8,8,7,3);
		Double avg= numb.stream()
									.map(e -> e*e)
										.filter(e -> e<1000)
											.mapToInt(e -> e)
												.average()
													.getAsDouble();
	
		System.out.println("Squre avg of given numbeers is : "+avg);
	
	}

}
