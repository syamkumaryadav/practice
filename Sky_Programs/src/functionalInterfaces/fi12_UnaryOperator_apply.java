package functionalInterfaces;

import java.util.function.UnaryOperator;

public class fi12_UnaryOperator_apply {

	public static void main(String[] args) {

		UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(4)); // Output: 16
		
        
        //A Function specialization where the input and output are of the same type.
	}

}
