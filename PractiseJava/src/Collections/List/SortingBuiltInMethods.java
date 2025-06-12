package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingBuiltInMethods {

	public static void main(String[] args) {
		String[] str = {"Int","String","Character"};
		List<String> unsortedList = Arrays.stream(str).collect(Collectors.toList());
		System.out.println(unsortedList);
		System.out.println(System.currentTimeMillis());
		Collections.sort(unsortedList);
		System.out.println(System.currentTimeMillis());
		System.out.println(unsortedList);
		List<String> list1 = new ArrayList<String>(Arrays.asList("Gtm","Rajo","Kumar"));
		System.out.println(System.currentTimeMillis());
		list1.sort(null);
		System.out.println(System.currentTimeMillis());
		System.out.println(list1);
		List<String> list2 = new ArrayList<String>(Arrays.asList("Gtm","Rajo","Kumar"));
		System.out.println(System.currentTimeMillis());
		list2.sort((s1, s2) -> Integer.compare(s2.length(), s1.length()));
		System.out.println(System.currentTimeMillis());
		System.out.println(list2);
	}

}
