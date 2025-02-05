package functionalInterfaces;

import java.util.function.BiConsumer;

public class fi05_BiConsumer_Chainning {

	public static void main(String[] args) {
		BiConsumer<String, Integer> printName = (name, age) -> 
        System.out.println("Name: " + name);
    BiConsumer<String, Integer> printAge = (name, age) -> 
        System.out.println("Age: " + age);

    BiConsumer<String, Integer> combinedBiConsumer = printName.andThen(printAge);
    combinedBiConsumer.accept("Bob", 30);
    // Output:
    // Name: Bob
    // Age: 30
	}

}
