package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommenElementFromArraylist {

	public static void main(String[] args) {
		// using sort and equal
		ArrayList<String> S1 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "F"));

		ArrayList<String> S2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		ArrayList<String> S3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));

		Collections.sort(S1);
		Collections.sort(S2);

		System.out.println(S1.equals(S2));// false
		Collections.sort(S3);
		System.out.println(S2.equals(S3));// true

		// compare two element list find out the additional element:

		ArrayList<String> f2 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E","F","J"));

		ArrayList<String> f3 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E","G","H"));

		f2.removeAll(f3);
		System.out.println(f2);
		
		//findout missing element
		f3.removeAll(f2);
		System.out.println(f3);
		
		//common elements findout 
		ArrayList<String> rr = new ArrayList<String>(Arrays.asList("Akas", "Bala", "Chaman", "Dharm", "Estra","Fast","Jhaka"));

		ArrayList<String> tt = new ArrayList<String>(Arrays.asList("Akas", "Bala", "Chaman", "Dharm", "Estrak","Fastrack","Juhaka"));

		rr.retainAll(tt);
		System.out.println(rr);
	}

}
