package lambda;

import java.util.function.Function;

public class UsingFunction {

	public static void main (String[] args) {
		Function<Integer, Double> half = a -> a/2.0;
		Function<Integer, Double> quarter = a -> a/4.0;
		
		System.out.println(quarter.apply(10));
	}
}
