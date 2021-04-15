package examples.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMapReduceDemo {

	public static void main(String[] args) {

		// Requirement 1: find all employees with grade "A" and get their average salary
		List<Employee> allEmps = DummyDatabase2.getAllEmps();
		double averageSalary = allEmps.stream().filter(emp -> emp.getGrade().equals("A")).map(emp -> emp.getSalary())
				.mapToDouble(salary -> salary).average().getAsDouble();
		
		System.out.println(averageSalary);
		
		
		// Requirement 2: find all employees with grade "A" and get their Sum of salary
				double sumOfSalary = allEmps.stream().filter(emp -> emp.getGrade().equals("A")).map(Employee::getSalary)
						.mapToDouble(salary -> salary).sum();
				
				System.out.println(sumOfSalary);
	}

}

class Employee {

	private int id;
	private String name;
	private String grade;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, String grade, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", grade=" + grade + ", salary=" + salary + "]";
	}

}

class DummyDatabase2 {

	public static List<Employee> getAllEmps() {
		return Stream.of(new Employee(101, "john", "A", 60000), new Employee(102, "smith", "B", 30000),
				new Employee(103, "keith", "A", 80000), new Employee(104, "michael", "A", 90000),
				new Employee(104, "michael", "C", 150000)).collect(Collectors.toList());
	}
}
