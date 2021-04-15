package examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(30);
		marks.add(25);
		marks.add(18);
		marks.add(19);
		marks.add(17);
		marks.add(21);
		System.out.println(marks);
		
		//toArray() is used to convert stream of objects to array
		Integer[] array = marks.stream().toArray(Integer[]::new);
		for(Integer i : array)
		System.out.println("Converted to array: "+ i);
		
		
		//to convert array to stream of elements
		Stream.of(array).forEach(System.out::println);
		
		
		//stream concept can be applied to collections/arrays/group of elements
		Integer [] nums = {10, 30, 20, 70, 90, 80};
		Stream.of(nums).forEach(System.out::println);
	}

}
