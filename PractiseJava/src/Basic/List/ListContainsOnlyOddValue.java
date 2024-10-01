package Basic.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListContainsOnlyOddValue {

	public static void main(String[] args) {
		
		//Scenario 1
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,5,9,7,18));
		System.out.println(list);
		List<Integer> result = list.stream().filter( data -> data % 2 != 0).collect(Collectors.toList());
		int resultCount = list.stream().filter( data -> data % 2 != 0).collect(Collectors.toList()).size();
		System.out.println(resultCount);
		System.out.println(result);
		if(list.size() == resultCount) {
			System.out.println("Only Odd");
		} else {
			System.out.println("Not only Odd");
		}
		
		//Scnerio 2
		Boolean flag = list.stream().anyMatch( data -> data % 2 == 0);
		if(!flag) {
			System.out.println("Only Odd");
		} else {
			System.out.println("Not only Odd");
		}
	}

}
