package Collections.List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingJava8Feature {

	public static void main(String[] args) {
		String[] str = {"Int","String","Character"};
		List<String> unsortedList = Arrays.stream(str).collect(Collectors.toList());
		System.out.println(unsortedList);
		
		List<String> sortedList = unsortedList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);

	}

}
