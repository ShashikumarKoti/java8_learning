package examples.parallelStreams;

import java.util.List;

public class EmployeeParallelStreamDemo {

	public static void main(String[] args) {
		
		long start =0;
		long end = 0;
		
		
		//using streams
		List<Employee> allEmps = EmployeeDummyDatabase.getAllEmps();
		start = System.currentTimeMillis();
		double asDouble = allEmps.stream().map(emp -> emp.getSalary()).mapToDouble(salary -> salary).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Total time using streams: " + (end-start) + " Avg salary is: " + asDouble);
		
		//using parallel streams
		start = System.currentTimeMillis();
		double asDouble2 = allEmps.parallelStream().map(Employee::getSalary).mapToDouble(salary -> salary).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("Total time using Parallel streams: " + (end-start) + " Avg salary is: " + asDouble2);
	}

}
