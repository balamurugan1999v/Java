package Java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain {

	public static void main(String[] args) {
		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(new Employee("Bmg", "SoftwareDeveloper", "100000"));
		listOfEmployees.add(new Employee("Priya", "Manager", "300000"));
		listOfEmployees.add(new Employee("Kumar", "Lead", "200000"));
		listOfEmployees.add(new Employee("Rajo", "Director", "500000"));
		listOfEmployees.add(new Employee("Alagar", "Manager", "350000"));

		List<Employee> sortedEmployee = listOfEmployees.stream().filter(s -> s.getRole().equals("Manager"))
				.collect(Collectors.toList());
		for (Employee emp : sortedEmployee) {
			System.out.println(emp.getName());
		}
	}

}
