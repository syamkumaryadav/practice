package Java8.Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_API02 {

	public static void main(String[] args) {
		// Step 1: Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 15, 8, 23, 5, 42);

        // Step 2: Process the list using the Stream API
        List<Integer> result = numbers.stream()
                                      .filter(n -> n % 2 != 0)               // Keep only odd numbers
                                      .map(n -> n * 3)                      // Multiply each by 3
                                      .sorted((a, b) -> b - a)              // Sort in descending order
                                      .collect(Collectors.toList());       // Collect into a List
                                      //.forEach(System.out::println); //not working
        // Step 3: Print the result
        System.out.println(result); // Output: [69, 45, 15]
	}

}

//A Collector { CLASS } is a utility in the Stream API that specifies how to accumulate elements of a 
//stream into a desired result container, like a List, Set, Map, or even a single value. 
//It is part of the java.util.stream package.
