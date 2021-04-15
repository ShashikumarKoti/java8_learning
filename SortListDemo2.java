package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo2 {

	public static void main(String[] args) {

		List<Employee4> empList = new ArrayList<Employee4>();
		empList.add(new Employee4(333, "Gaurav", "IT", 60000));
		empList.add(new Employee4(555, "Murali", "CIVIL", 90000));
		empList.add(new Employee4(444, "Ramu", "DEFENCE", 50000));
		empList.add(new Employee4(222, "Nagi", "CORE", 40000));
		empList.add(new Employee4(777, "Amod", "SOCIAL", 120000));
		
		//Old style
		Collections.sort(empList, new MyComparator());
		System.out.println(empList);
		
		
		//Using streams
		System.out.println("=======using streams====");
		empList.stream().sorted((o1,o2)-> (int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);
		
		//using method reference
		System.out.println("=======using streams method reference====");
		empList.stream().sorted(Comparator.comparing(Employee4::getSalary)).forEach(System.out::println);
		
	}

}


class MyComparator implements Comparator<Employee4>{

	@Override
	public int compare(Employee4 o1, Employee4 o2) {
		return (int)(o1.getSalary()-o2.getSalary());
	}
	
}

class Employee4 {

	private int id;
	private String name;
	private String dept;
	private long salary;

	public Employee4(int id, String name, String dept, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee4 [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}