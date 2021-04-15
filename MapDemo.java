package examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		marks.add(30);
		marks.add(35);
		System.out.println(marks);
		
		List<Integer> updatedMarks = marks.stream().map(i -> i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		
		List<Integer> marks1 = new ArrayList<Integer>();
		marks1.add(50);
		marks1.add(50);
		marks1.add(50);
		marks1.add(35);
		marks1.add(35);
		marks1.add(35);
		marks1.add(35);
		System.out.println(marks1);
		
		List<Integer> updatedMarks2 = marks1.stream().filter(i -> i<=35).map(i -> i+5).collect(Collectors.toList());
		System.out.println(updatedMarks2);
	}

}
