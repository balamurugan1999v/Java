package string;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxCharCount {

	public static void main(String[] args) {
		String str = "aabbcccc";
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(k -> k,Collectors.counting()));
		System.out.println(map);
		Collection<Long> list = map.values();
		System.out.println(list);
		List<Long> list1 = new ArrayList<>(list);
		Collections.sort(list1, Comparator.reverseOrder());
		System.out.println(list1.get(0)%2 == 0 ? true:false);
		Optional<Long> maxValue = map.values().stream().sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(maxValue.get()%2 == 0 ? true:false);
		
	}
}
