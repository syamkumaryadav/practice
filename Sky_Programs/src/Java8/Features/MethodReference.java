package Java8.Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReference {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Syam", "Kumar", "Gokada");



		// Using a lambda expression to convert each name to uppercase

		/*List<String> upperCaseNames = names.stream()
		
		    .map(name -> name.toUpperCase()) 
		
		    .collect(Collectors.toList());
		System.out.println(upperCaseNames);*/
		
		
// It provides a set of static methods that are commonly used to collect the elements of a Stream into various forms, 
//such as lists, sets, maps, or custom data structures. It's often used in conjunction with the collect() terminal operation in streams.
		
		List<String> upperCaseNames = names.stream()
			    .map(String::toUpperCase)
			    .collect(Collectors.toList());

			System.out.println(upperCaseNames); 
	}

}
