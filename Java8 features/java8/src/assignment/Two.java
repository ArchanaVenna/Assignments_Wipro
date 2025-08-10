package assignment;

import java.util.Optional;

public class Two {
	public static Optional<Double> safeDivide(double a, double b) {
        return b == 0 ? Optional.empty() : Optional.of(a / b);
    }

	public static void main(String[] args) {
		 System.out.println(safeDivide(10, 2).orElse(Double.NaN));
	        System.out.println(safeDivide(5, 0).map(String::valueOf).orElse("Not Allowed"));
		
		
		
		
	}

}
