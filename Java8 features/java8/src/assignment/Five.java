package assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Five {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Archana","Shreshta","Teja","Krishna","Akshara");
		List<String> name=names.stream()
		                       .filter(n->n.startsWith("A"))
		                       .collect(Collectors.toList());
		System.out.println("Names Those starting with A :  "+name );
		
		
		
	}

}
