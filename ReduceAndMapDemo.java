package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceAndMapDemo {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
		
		//mapToInt(num -> num) is used to convert Integer to int
		int sumofAllNums = numbers.stream().mapToInt(num -> num).sum();
		System.out.println(sumofAllNums);
		
		Integer reduceSum = numbers.stream().reduce(0, (num1, num2)-> num1+num2);
		System.out.println(reduceSum);
		
		Optional<Integer> reduce = numbers.stream().reduce(Integer::sum);
		System.out.println(reduce.get());
		
		Integer multiplyNums = numbers.stream().reduce(1, (a,b)-> (a*b));
		System.out.println(multiplyNums);
		
		Integer maxvalue = numbers.stream().reduce(0, (a,b)-> a > b ? a : b);
		System.out.println(maxvalue);
		
		Integer maxvalue2 = numbers.stream().reduce(Integer::max).get();
		System.out.println(maxvalue2);
	}

}
