package functionalInterfaces;

import java.util.function.BiPredicate;

public class fi11_BiPredicate_test {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;
        System.out.println(isSumEven.test(3, 5)); // Output: true
        System.out.println(isSumEven.test(3, 4)); // Output: false
        
        
        //Like Predicate, but takes two inputs.
	}

}
