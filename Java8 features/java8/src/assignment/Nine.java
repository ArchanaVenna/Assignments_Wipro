package assignment;

import java.util.Arrays;
import java.util.List;

public class Nine {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		num.parallelStream()
		   .forEach(n->System.out.println("Square of "+n+ "is " +(n*n) ));

	}

}
