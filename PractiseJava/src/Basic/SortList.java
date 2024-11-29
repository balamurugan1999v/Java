package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(1,2,45,6,793,4,5));
		Comparator<Integer> com = (s1,s2) -> (s1<s2)?1:-1;
		Collections.sort(intList,com);
		System.out.println(intList);
		
		List<String> stringList = new ArrayList<String>(Arrays.asList("Abhi","Comeon","Yaru","Naanu"));
		Collections.sort(stringList, Collections.reverseOrder());
		System.out.println(stringList);
	}

}
