package Java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("First","Second","Third"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Fourth","Fifth","Sixth"));
		List<List<String>> finalList = new ArrayList<List<String>>();
		finalList.add(list1);
		finalList.add(list2);
		List<String> result = finalList.stream().flatMap(s -> s.stream()).filter(s -> s.contains("F"))
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
