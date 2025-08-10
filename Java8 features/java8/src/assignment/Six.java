package assignment;

import java.util.Arrays;
import java.util.List;

public class Six {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Archana","Shreshta","Teja","Krishna","Sai","Akshara","Manasa");
		Long  count=names.stream()
				         .filter(n->n.length()>5)
				          .count();
		System.out.println(count);
		
		
		
	}

}
