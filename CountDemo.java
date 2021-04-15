package examples.streams;

import java.util.ArrayList;
import java.util.List;

public class CountDemo {

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
		
		long count = marks.stream().filter(i -> i%2!=0).count();
		System.out.println(count);
	}

}
