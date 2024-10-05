package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Basic.Helper.Student;

public class Comparing {
	
		
		public static void main(String args[]) {
			List<Student> students = new ArrayList<Student>();
			students.add(new Student(51,"Bmg"));
			students.add(new Student(25,"Bala"));
			students.add( new Student(63,"Priya"));
			students.add(new Student(40,"Adam"));
			
			//Collections.sort(students); // If we are doing this it wont sort this by age. If we want sort by age then need to specify it by using Comparator.
			
//			Comparator com = new Comparator<Student>() {
//				public int compare(Student s1, Student s2){
//					if(s1.age > s2.age)
//						return 1;
//					else
//						return -1;
//				}
//			};
			//Lambda expression
			Comparator<Student> com  = (s1,s2) -> (s1.getAge()>s2.getAge())?1:-1;
			
			students.stream().forEach(s -> System.out.println(s.getAge() + " " + s.getName()));
			Collections.sort(students, com);
			System.out.println("After");
			students.stream().forEach(s -> System.out.println(s.getAge() + " " + s.getName()));
			
		}

}
