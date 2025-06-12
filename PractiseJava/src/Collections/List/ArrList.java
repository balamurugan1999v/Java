package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrList {

	public static void main(String[] args) {

		List<String> list =  Arrays.asList("Ashok","Kumar","Bmg");
		try{
			list.add("b");
		}catch(Exception e) {
			
		}
		
		List<String> list1 = new ArrayList<String>(Arrays.asList("Gtm","Rajo","Kumar"));
		list1.add("Subash");
		
		String[] str = {"Int","String","Character"};
		List<String> unsortedList = Arrays.stream(str).collect(Collectors.toList());
		System.out.println(unsortedList);
		
		
		
		
		
		
	}

}
