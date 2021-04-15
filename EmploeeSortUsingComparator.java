package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmploeeSortUsingComparator {

	public static void main(String[] args) {

		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(444, "Shashi", 8888.88));
		empList.add(new Employee(111, "Amar", 3333.88));
		empList.add(new Employee(333, "Zaheer", 5555.88));
		empList.add(new Employee(222, "Ved", 2222.88));
		empList.add(new Employee(555, "Mohit", 7777.88));
	
		System.out.println(empList);
		
		//ascending order of name
		Comparator<Employee> comparator = (I1,I2) -> I1.getName().compareTo(I2.getName());
		Comparator<Employee> reversed = comparator.reversed();
		Collections.sort(empList, reversed);
		
		System.out.println(empList);
		
		//sorting order of emp num
		Comparator<Employee> comp = (I1,I2) -> (I1.getId()<I2.getId())?-1:(I1.getId()>I2.getId())?1:0;
		Comparator<Employee> reverse = comp.reversed();
		Collections.sort(empList, reverse);
		System.out.println(empList);
	}

}
