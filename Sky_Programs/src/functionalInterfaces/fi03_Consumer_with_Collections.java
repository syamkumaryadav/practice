package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class fi03_Consumer_with_Collections {

	public static void main(String[] args) {
		 List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

	        Consumer<String> greet = name -> System.out.println("Hello, " + name);
	        names.forEach(greet);
	        
			/* Equivalent Code Without
			     for (T item : this) {
			     consumer.accept(item);
			 }*/
	}

}
