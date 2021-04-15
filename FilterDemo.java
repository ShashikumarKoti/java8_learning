package examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(35);
		System.out.println(list);
		
		 List<Integer> collect = list.stream().filter(i -> i%2==0).
				 collect(Collectors.toList());
		System.out.println(collect);
	}

}
