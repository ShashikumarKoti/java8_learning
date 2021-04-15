package examples.parallelStreams;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) {
		long start =0;
		long end = 0;

//		start = System.currentTimeMillis();
//		IntStream.range(1,100).forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Total time using streams: " + (end-start));
//		
//		System.out.println("======================================");
//		
//		start = System.currentTimeMillis();
//		IntStream.range(1,100).parallel().forEach(System.out::println);
//		end = System.currentTimeMillis();
//		System.out.println("Total time using Parallel streams: " + (end-start));
		
		start = System.currentTimeMillis();
		IntStream.range(1,100).forEach(x -> {
		System.out.println("thread :" + Thread.currentThread().getName() + " " + x);
				
		});
		end = System.currentTimeMillis();
		System.out.println("Total time using streams: " + (end-start));
		
		System.out.println("======================================");
		
		start = System.currentTimeMillis();
		IntStream.range(1,100).parallel().forEach(x -> {
			System.out.println("thread :" + Thread.currentThread().getName() + " " + x);
			
			});
		end = System.currentTimeMillis();
		System.out.println("Total time using Parallel streams: " + (end-start));
		
	}

}
