package examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {

		
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("two", 2);
		map.put("ten", 10);
		
		//Old style
		System.out.println("===========Old style===============");
		List<Entry<String, Integer>> entries = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(entries, (o1, o2)-> o1.getKey().compareTo(o2.getKey()));
		
		for(Entry<String,Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("===========Using streams===============");
		//Using streams
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("======comapre by value=========");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
