package examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ThenComparingDemo {

	public static void main(String[] args) {

		
		List<Employee4> empList = new ArrayList<Employee4>();
		empList.add(new Employee4(333, "Gaurav", "IT", 60000));
		empList.add(new Employee4(555, "Murali", "CIVIL", 90000));
		empList.add(new Employee4(444, "Ramu", "DEFENCE", 50000));
		empList.add(new Employee4(222, "Nagi", "CORE", 40000));
		empList.add(new Employee4(777, "Amod", "SOCIAL", 120000));
		empList.add(new Employee4(999, "Murali", "DEFAULT", 90000));
		empList.add(new Employee4(999, "Murali", "ELECTRICAL", 25000));
		
		
		//then comparing is used to sort on multiple fields
		empList.stream().sorted(Comparator.comparing(Employee4::getName).thenComparing(Employee4::getSalary).thenComparing(Employee4::getId)).forEach(System.out::println);
	}

}
