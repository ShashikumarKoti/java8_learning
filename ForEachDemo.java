package examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(30);
		marks.add(25);
		marks.add(18);
		marks.add(19);
		marks.add(17);
		marks.add(21);
		
		marks.stream().forEach(System.out::println);
		System.out.println("=======================");
		
		marks.forEach(System.out::println);
		System.out.println("=======================");
		
		Consumer<Integer> cons = i-> System.out.println("The square of num "+ i + " is " + i*i);
		marks.stream().forEach(cons);
		System.out.println("=======================");
		
		Consumer<Integer> cons2 = i-> System.out.println("The square of num "+ i + " is " + i*i);
		marks.forEach(cons2);
	}

}
