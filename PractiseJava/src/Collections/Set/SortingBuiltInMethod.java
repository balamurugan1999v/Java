package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingBuiltInMethod {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,8,5,6,53,1));
		System.out.println(set);
		Set<Integer> sortedSet = new TreeSet<>(set);
		System.out.println(sortedSet);
	}
}