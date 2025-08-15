package Java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		String s = "abcacbbb";
		char[] ch = s.toCharArray();
		Map<Character, Long> freq = s.chars()
			    .mapToObj(c -> (char) c)
			    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		//Map<Character,Integer> map = Arrays.stream(ch)
			//	.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(freq);
		
		Employee emp1 = new Employee("Priya", "Dev", "16");
		Employee emp2 = new Employee("Kumar", "Verification", "24");
		Employee emp3 = new Employee("Adam", "Dev", "14");
		Employee emp4 = new Employee("Bmg", "Dev", "14");
		List<Employee> list = new ArrayList<>(List.of(emp1,emp2,emp3,emp4));
		
		Map<String, Long> empDetails = list.stream().collect(Collectors.groupingBy( Employee::getRole,Collectors.counting()));
		
		System.out.println(empDetails);
	}

}
