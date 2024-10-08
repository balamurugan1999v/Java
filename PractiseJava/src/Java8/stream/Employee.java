package Java8.stream;

public class Employee {

	private String name;
	private String role;
	private String salary;
	
	public Employee(String name, String role, String salary) {
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}

}
