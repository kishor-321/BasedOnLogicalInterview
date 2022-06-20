package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashmapComparatorsProblemCompareOnValue {

	public static void main(String[] args) {
		

		HashMap<Integer, String > map1=new HashMap< Integer,String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap< Integer,String> map2=new HashMap< Integer, String>();
		map2.put(1,"A");
		map2.put(2, "B");
		map2.put(3, "C");
		
		
		HashMap< Integer,String> map3=new HashMap< Integer, String>();
		map3.put(1,"A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		System.out.println(map2.equals(map1));
		System.out.println(map2.equals(map3));
		System.out.println(map3.equals(map1));
		System.out.println(map3.equals(map2));
		
		//compare hashmap for the same keys  via keyset()
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map2.keySet().equals(map3.keySet()));//if u declare 3="D" then result will be true
		System.out.println(map3.keySet().equals(map1.keySet()));
		
		//for extra key using HASHSET
		HashSet<Integer> combinedKeys =new HashSet<>(map1.keySet());
		combinedKeys.addAll(map3.keySet());
		combinedKeys.removeAll(map1.keySet());
		System.out.println(combinedKeys); //[4]
		
		//compare map by values
		HashMap<Integer, String > map5=new HashMap< Integer,String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		
		HashMap< Integer,String> map6=new HashMap< Integer, String>();
		map6.put(1,"A");
		map6.put(2, "B");
		map6.put(3, "C");
		
		
		HashMap< Integer,String> map7=new HashMap< Integer, String>();
		map7.put(1,"A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "D");
		
		//Duplicates are not allowed
		System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
		System.out.println(new ArrayList<>(map6.values()).equals(new ArrayList<>(map7.values())));//false due to map 7 "D"
		
		//duplicate are allowed
		System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
		System.out.println(new HashSet<>(map6.values()).equals(new HashSet<>(map7.values())));//"D"values
	}

}
