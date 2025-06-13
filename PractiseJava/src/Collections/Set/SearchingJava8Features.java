package Collections.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SearchingJava8Features {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(1,8,5,6,53,1));
		boolean presentOrNot = set.stream().anyMatch(s -> s.equals(1));
		System.out.println(set);
		Set<Integer> sortedSet = set.stream().sorted().collect(Collectors.toSet());
		System.out.println(presentOrNot);
		Set<Integer> sortedSet1 = new TreeSet<Integer>(sortedSet);
		System.out.println(sortedSet1);		
	}

}
