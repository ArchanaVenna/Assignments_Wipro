package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Eleven {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Anita", "Asha", "Amala", "Anya", "Alexa", "Sonia");

        Predicate<String> startsWithA = name -> name.startsWith("A");
        Predicate<String> endsWithA = name -> name.endsWith("a");

        List<String> filtered = names.stream()
                                     .filter(startsWithA.and(endsWithA))
                                     .collect(Collectors.toList());

        System.out.println("Names starting with A and ending with a: " + filtered);
		
		
		
		
	}

}
