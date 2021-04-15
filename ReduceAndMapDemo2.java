package examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceAndMapDemo2 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("corejava", "spring", "hibernate");
		
		Optional<String> longestString = words.stream().reduce((word1,word2) -> word1.length() > word2.length() ? word1 : word2);
		System.out.println(longestString.get());
	}

}
