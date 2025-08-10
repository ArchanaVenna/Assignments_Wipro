package assignment;

import java.util.Arrays;
import java.util.List;

public class Twelve {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("Archana","Shreshta","Teja","Krishna","Sai","Akshara","Manasa","Archana","Akshara");
		names.sort(String::compareToIgnoreCase);
		System.out.println(names);
	}

}
