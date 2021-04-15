package examples.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedDemo {

	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(30);
		marks.add(25);
		marks.add(18);
		marks.add(19);
		marks.add(17);
		marks.add(21);
		
		List<Integer> collect = marks.stream().sorted().collect(Collectors.toList());
		System.out.println("asc order:" + collect);
		
		List<Integer> collect2 = marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println("Desc order: "+ collect2);
		
		List<Integer> collect3 = marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("asc order:" + collect3);
		
		List<Integer> collect4 = marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("asc order:" + collect4);
		
		
		List<String> models = new ArrayList<String>();
		models.add("Anushka Sh");
		models.add("Sunny Leone");
		models.add("Madhuri");
		models.add("Kajol Agarwal");
		models.add("Pooja Shetty");
		
		List<String> collect5 = models.stream().sorted().collect(Collectors.toList());
		System.out.println("String asc order: " + collect5);
		
		List<String> collect6 = models.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("String desc order: " + collect6);
		
		Comparator<String> comp = (s1,s2) -> {
			int l1 = s1.length();
			int l2 = s2.length();
				if(l1<l2) return -1;
				else if(l1>l2) return +1;
				else return s1.compareTo(s2);
		};
		List<String> collect7 = models.stream().sorted(comp).collect(Collectors.toList());
		System.out.println("String desc order: " + collect7);
	}

}
