package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Seven {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> num=numbers.stream()
				                 .filter(n->n%2==0)
				                 .collect(Collectors.toList());
		System.out.println(num);
	}

}
