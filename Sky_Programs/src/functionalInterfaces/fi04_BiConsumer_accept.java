package functionalInterfaces;

import java.util.function.BiConsumer;

public class fi04_BiConsumer_accept {

	public static void main(String[] args) {
		BiConsumer<String, Integer> printNameAndAge = (name, age) -> System.out.println(name + " is " + age + " years old.");

		printNameAndAge.accept("Syam", 23); // Output: Syam is 23 years old.

	}

}
