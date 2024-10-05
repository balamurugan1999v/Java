package Basic.Helper;

public class Student implements  Comparable<Student>{
	public int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String name;
	
	public Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public int compareTo(Student stu) {
		if(this.age > stu.age)
			return 1;
		else
			return -1;
	}
	
}
