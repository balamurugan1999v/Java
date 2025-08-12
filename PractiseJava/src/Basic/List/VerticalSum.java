package Basic.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class VerticalSum {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>() ;
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(5));
		ArrayList<Integer> ar1 = new ArrayList<Integer>(Arrays.asList(1,2,5));
		ArrayList<Integer> ar2 = new ArrayList<Integer>(Arrays.asList(3,5));
		ArrayList<Integer> ar3 = new ArrayList<Integer>(Arrays.asList(1,2,3,5));
		arr.add(ar);
		arr.add(ar1);
		arr.add(ar2);
		arr.add(ar3);
		System.out.println(arr);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(ArrayList<Integer> list : arr) {
			int k=0;
			for(Integer i:list) {
				if(map.containsKey(k)) {
					int value = map.get(k);
					map.put(k, value+i);
					k++;
				}else {
					map.put(k,i);
					k++;
				}
			}
		}
		Collection<Integer> value = map.values();
		Optional<Integer> lvalue = value.stream().sorted().findFirst();
		System.out.println(lvalue.get());
	}

}
/*
 [[5], [1, 2, 5], [3, 5], [1, 2, 3, 5]]
{0=10, 1=9, 2=8, 3=5}
[10, 9, 8, 5]
5
 */
