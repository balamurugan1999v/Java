package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class RepeatCounts {

	public static void main(String[] args) {
		String arr[] = {"Turin", "Nick", "Turin", "Nick","Bmg"};
		Map<String, Long> map1 = new HashMap<String, Long>();
        map1 = Arrays.stream(arr).collect(Collectors.groupingBy(k -> k, Collectors.counting()));      
        Map<Long, List<String>> map3 = createMap3(map1);
        Optional<Long> number = map3.keySet().stream().sorted(Comparator.reverseOrder()).findFirst();
        List<String> listStri = map3.get(number.get());
        listStri.sort(null);
        System.out.println(listStri.get(0));
	}

	private static Map<Long, List<String>> createMap3(Map<String, Long> map1) {

		Map<Long, List<String>> map = new HashMap<>();
		for(String obj: map1.keySet()) {
			//System.out.println(obj);
			if(map.containsKey(map1.get(obj))) {
				map.get(map1.get(obj)).add(obj.toString());
			} else {
				List<String> list = new ArrayList<String>();
				list.add(obj.toString());
				//System.out.println(map1.get(obj));
				map.put(map1.get(obj), list);
			}
		}
		return map;
	}

}
