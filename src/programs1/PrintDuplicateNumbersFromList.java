package programs1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumbersFromList {

	public static void main(String[] args) {
		List<Integer> Num=Arrays.asList(2,8,2,8,6,8,86,5,8,2,9,3,1,5,9,3,2,5,6,3,1,8,5,2,5,5);
		Set<Integer> dup =Num.stream().filter(e -> Collections.frequency(Num, e)>1).collect(Collectors.toSet());
		System.out.println(dup);

		
		
		Set<Integer> NumList =new HashSet<Integer>();
		Set<Integer> dup2 =Num.stream().filter(e -> ! NumList.add (e) ).collect(Collectors.toSet());
		System.out.println(dup2);
	}
}
