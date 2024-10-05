package Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
//		System.out.println(Stream.of("Hello Doctor")
//        .map(data -> data.replace(" ", ""))
//        .collect(Collectors.joining(" ")));
	
	String gives = "what where what you doing";
	//List<String[]> 
	//String finalStr = 
	Stream.of(gives).map(d -> d.split(" ")).forEach(d -> System.out.println(d.toString()));
//			.sorted()
//			.map( d -> String.join(" ", d))
//			.collect(Collectors.joining(""));
	
	//System.out.println(finalStr);
	
	String[] strArray = gives.split(" ");
	List<String> list = Arrays.asList(strArray);
	System.out.println(list);
	String finalStr = 
			list.stream()
					.sorted()
					.collect(Collectors.joining(""));
			
			System.out.println(finalStr);
	
			
	//4-10-2024 to check the treemap functionalities
	Set<String> set = new TreeSet<String>(list);
	System.out.println(set);
	//Output: 
	//List--> [what, where, what, you, doing]
	//set --> [doing, what, where, you]
	}
	

}
