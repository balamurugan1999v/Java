package Collections.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingArray {

	public static void main(String[] args) {
		int[] array = {1,5,1,6,2};
		Map<Object, Long> map = new HashMap<Object,Long>();
		map = Arrays.stream(array).boxed().collect(Collectors.groupingBy(k -> k,Collectors.counting()));
		System.out.println(map);
		System.out.println(map.get(1));
	}

}
