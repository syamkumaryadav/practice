package Java8.Features;

import java.util.Arrays;
import java.util.List;

public class Streams_API {
	/*public static void main() {}
	abstract public static void main();{}*/
	final public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);	
		numbers.stream()						
		.filter(n -> n % 2 == 0)
		.forEach(System.out::println);         //.forEach(System.out.println(n));      not working
		
		//System.out.println(numbers);// [1, 2, 3, 4, 5]    y
		
		/*Arrays.asList is a utility method that converts an array into a fixed-size list.
		A stream is a sequence of elements supporting functional-style operations 
		such as filtering, mapping, and reducing.
		The filter uses a lambda expression (n -> n % 2 == 0), which checks if a number n is even (n % 2 == 0 means the number has no remainder when divided by 2).
		terminal operation
		The forEach method consumes each element in the stream and performs the specified action (here, System.out::println).
		System.out::println is a method reference that prints each element to the console.*/
		
		for(int a=0;a<=numbers.size()-1;a++) {
			if(numbers.get(a)%2==0) {
				System.out.println(numbers.get(a));
			}
		}
		
		
		 for (int num : numbers) {
	            if (num % 2 == 0) {
	                System.out.println(num);
	            }
	        }
		 
		 
	}
	

}
