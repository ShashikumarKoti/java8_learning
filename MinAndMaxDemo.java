package examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MinAndMaxDemo {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(30);
		marks.add(25);
		marks.add(18);
		marks.add(19);
		marks.add(17);
		marks.add(21);
		
		//Note:  
		//[1,2,3,4,5] -> here min is 1 and max is 5
		//[5,4,3,2,1]  -> here min is 5 and max is 1
		//Min is first elememt in list and max is last element in list
		Optional<Integer> max = marks.stream().max((i1,i2)-> i1.compareTo(i2));
		System.out.println(max);
		
		Optional<Integer> min = marks.stream().min((i1,i2)-> i2.compareTo(i1));
		System.out.println(min);
		
		Optional<Integer> min2 = marks.stream().sorted().min((i1,i2)-> i1.compareTo(i2));
		System.out.println(min2);
	}

}
