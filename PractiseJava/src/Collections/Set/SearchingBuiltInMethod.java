package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SearchingBuiltInMethod {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,3,5,6,1));
		int find = 5;
		set.add(52);
		if(set.contains(find)){
			System.out.println("It is present");
		}
		set.add(53);
		System.out.println(set);
		Set<Integer> setInt = new LinkedHashSet<Integer>(Arrays.asList(1,3,5,6,1));
		setInt.add(52);
		if(setInt.contains(find)){
			System.out.println("It is present");
		}
		setInt.add(53);
		System.out.println(setInt);
		String findString ="abi";
		Set<String> setString = new TreeSet<String>(Arrays.asList("VAbi","Kala","Bmg"));
		setString.add("Vel");
		setString.add("abi");
		setString.add("Abi");
		if(setString.contains(findString)){
			System.out.println("It is present");
		}
		System.out.println(setString);
	}

}
