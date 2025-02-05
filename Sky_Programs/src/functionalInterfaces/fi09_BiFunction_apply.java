package functionalInterfaces;

import java.util.function.BiFunction;

public class fi09_BiFunction_apply {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> sumToString = (a, b) -> "Sum: " + (a + b);
        System.out.println(sumToString.apply(5, 10)); // Output: Sum: 15

        //Like Function, but takes two inputs and produces a result.
        
	}

}
