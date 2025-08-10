package assignment;

import java.util.Arrays;
import java.util.List;

public class One {

	public static void main(String[] args) {
		
		List<String> name=Arrays.asList("Archana","Teja","Sravani","John","Krishna");
		name.sort((n1,n2)->n1.compareToIgnoreCase(n2));
		System.out.println(name);
		
		
		
	}

}
