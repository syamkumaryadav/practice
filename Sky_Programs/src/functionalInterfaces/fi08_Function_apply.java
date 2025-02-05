package functionalInterfaces;

import java.util.function.Function;

public class fi08_Function_apply {

	public static void main(String[] args) {
		Function<Integer, String> intToString=i->"Number : "+i;
		 System.out.println(intToString.apply(5));		// Number : 5
	}

}


/*
  Represents a function that takes one input and produces a result.
  
  First parameter (Integer): The type of the input to the function.
Second parameter (String): The type of the result (output) produced by the function.

*/