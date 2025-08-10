package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ten {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Archana","Shreshta","Teja","Krishna","Sai","Akshara","Manasa","Archana","Akshara");
		Map<String,Long> freqMap=names.stream()
				                      .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
		System.out.println(freqMap);

		
		
		
		
		
		
	}

}
