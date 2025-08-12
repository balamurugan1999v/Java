package Basic.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Basic.Helper.Student;
import Basic.Helper.Student1;

public class ListStringCompare {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>(Arrays.asList("Bmg","Bala","Kala","Abi"));
		list.sort(null);
		System.out.println(list);
		
		List<String> list1 = new ArrayList<String>(Arrays.asList("Bmg","Bala","Kala","Abi"));
		Collections.sort(list1, (s1,s2) -> s1.compareTo(s2));
		System.out.println(list1);
		
		List<Student1> stu = new ArrayList<Student1>();
		stu.add(new Student1(1,"Bmg"));
		stu.add(new Student1(2,"Bala"));
		stu.add(new Student1(3,"Kala"));
		stu.add(new Student1(4,"Abi"));
		stu.add(new Student1(5,"kala"));
		stu.add(new Student1(6,"abi"));
		
		Collections.sort(stu, (s1,s2) -> s1.getName().compareTo(s2.getName()));
		//System.out.println(stu);
		for(Student1 s:stu) {
			System.out.println(s.getAge() + " "+ s.getName());
		}
		
		
		
	}

}
