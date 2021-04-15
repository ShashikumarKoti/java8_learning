package examples.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FunctionlaInterfaceDemo {

	public static void main(String[] args) {  
		
		TestFuncInterface func = (i,j) -> i>j;
		System.out.println(func.m1(5, 6));
		System.out.println("=============================");
		
		TestFuncInterface func2 = (i,j) -> i<j;
		System.out.println(func2.m1(5, 6));
		System.out.println("=============================");
		
		TestFuncInterface func3 = (i,j) -> i==j;
		System.out.println(func3.m1(5, 5));
		System.out.println("=============================");
	
		Runnable r = () -> {
			for(int i=0;i<10;i++) {
				System.out.println("Child thread");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<=10;i++) {
			System.out.println("Main thread[");
		}
		System.out.println("=============================");
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		list.add(15);
		list.add(30);
		list.add(20);
		list.add(25);
		System.out.println("Before soting: "+ list);
	//	Comparator<Integer> comp = (i,j) -> (i<j)?-1:(i>j)?1:0;
		Comparator<Integer> comp = (i,j) -> j.compareTo(i);
		Collections.sort(list, comp);
		Collections.sort(list);
		System.out.println("After sorting:" +list);
	//	list.stream().forEach(System.out::println);
 	}

} 