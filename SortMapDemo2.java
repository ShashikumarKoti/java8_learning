package examples;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortMapDemo2 {

	public static void main(String[] args) {

		//Old style to sort
//		Map<Employee3, Integer> empMap = new TreeMap<Employee3, Integer>((o1,o2) -> (int)(o2.getSalary()-o1.getSalary()));
//		
//		empMap.put(new Employee3(333, "Gaurav", "IT", 60000),60);
//		empMap.put(new Employee3(555, "Murali", "CIVIL", 90000),90);
//		empMap.put(new Employee3(444, "Ramu", "DEFENCE", 50000),50);
//		empMap.put(new Employee3(222, "Nagi", "CORE", 40000),40);
//		empMap.put(new Employee3(777, "Amod", "SOCIAL", 120000),120);
//		
//		System.out.println(empMap);
		
		
		//New style to sort
				Map<Employee3, Integer> empMap2 = new TreeMap<Employee3, Integer>((o1,o2) -> (int)(o2.getSalary()-o1.getSalary()));
				
				empMap2.put(new Employee3(333, "Gaurav", "IT", 60000),60);
				empMap2.put(new Employee3(555, "Murali", "CIVIL", 90000),90);
				empMap2.put(new Employee3(444, "Ramu", "DEFENCE", 50000),50);
				empMap2.put(new Employee3(222, "Nagi", "CORE", 40000),40);
				empMap2.put(new Employee3(777, "Amod", "SOCIAL", 120000),120);
				
				empMap2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee3::getSalary))).forEach(System.out::println);
				//reverse order
				System.out.println("=========reverse order=============");
				empMap2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee3::getSalary).reversed())).forEach(System.out::println);
				
				//sort base on dept
				System.out.println("======sort by dept=====");
				empMap2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee3::getDept))).forEach(System.out::println);
				System.out.println("======sort by dept reversed=====");
				empMap2.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee3::getDept).reversed())).forEach(System.out::println);
	}
}

class Employee3 {

	private int id;
	private String name;
	private String dept;
	private long salary;

	public Employee3(int id, String name, String dept, long salary) {
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
		return "Employee3 [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}

}