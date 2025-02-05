package functionalInterfaces;

import java.util.function.Predicate;

public class fi10_Predicate_test {

	public static void main(String[] args) {
		

		Predicate<Integer> isEven=n->n%2==0;
		System.out.println(isEven.test(4));
		System.out.println(isEven.test(9));

		//Represents a predicate (boolean-valued function) of one argument.
	}

}
