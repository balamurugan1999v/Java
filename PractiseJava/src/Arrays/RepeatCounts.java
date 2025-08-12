package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatCounts {

	public static void main(String[] args) {
		String arr[] = {"Turin", "Nick", "Turin", "Nick"};
		Map<Object, List<String>> map = new  HashMap<Object, List<String>>();
		Map<Object, Long> map1 = new HashMap<Object, Long>();
		Map<Object, List<String>> map2 = new HashMap<Object, List<String>>();
        map = Arrays.stream(arr).collect(
            Collectors.groupingBy(k -> Collectors.counting(), Collectors.toList()) );
        map1 = Arrays.stream(arr).collect(Collectors.groupingBy(k -> k, Collectors.counting()));
        map2 = Arrays.stream(arr).collect(Collectors.groupingBy(k -> Collectors.counting(), Collectors.toList()));
        System.out.println(map);
        System.out.println();
        System.out.println(map1);System.out.println(map2);
	}

}
