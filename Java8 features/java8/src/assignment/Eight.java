package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Eight {

	public static void main(String[] args) {
		List<String> city= Arrays.asList("Mumbai","Hyderabad","Chennai","Banglore","Kochi");
		String cities=city.stream()
				                .collect(Collectors.joining(","));
		
		System.out.println(cities);
		
		
		
		
		
	}

}
