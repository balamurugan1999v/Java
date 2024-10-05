package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Basic.Helper.Student;

public class Comparing1{
	
	
	public static void main(String args[]) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(51,"Bmg"));
		students.add(new Student(25,"Bala"));
		students.add( new Student(63,"Priya"));
		students.add(new Student(40,"Adam"));
		students.stream().forEach(s -> System.out.println(s.getAge() + " " + s.getName()));
		System.out.println("After");
		Collections.sort(students);
		students.stream().forEach(s -> System.out.println(s.getAge() + " " + s.getName()));
	}
}
