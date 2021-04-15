package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {

		
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(17);
		list.add(5);
		
		
		//Old style
		Collections.sort(list);
		System.out.println(list);
//		
		//reverse order
		Collections.reverse(list);
		System.out.println(list);
		
		//Using streams
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("=======reverse order");
		//reverse order
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
	}

}


