package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondMax {

	public static void main(String[] args) {
		int firstMax = 0;
		int secondMax = 0;
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(99,10,1,2,3,4,5,8,5,6));
		for(Integer i :list) {
			if(firstMax <i) {
				secondMax = firstMax;
				firstMax = i;
			} else if( secondMax < i) {
				secondMax = i;
			}
		}				
		System.out.println(secondMax);
		
		//Sorted Method
		List<Integer> sortedList = list.parallelStream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		System.out.println(sortedList.get(sortedList.size()-2));
	}
	//output:10
}
