package functionalInterfaces;

import java.util.function.Consumer;

public class fi02_Consumer_accept {

	public static void main(String[] args) {
		
		
		//==============================Consumer Chaining=================================
		
		
		Consumer<String> str = s -> System.out.println(" Print : " + s);

		Consumer<String> length = s -> System.out.println(" Length : " + s.length());
		
		Consumer<String> lastIndex = s -> System.out.println(" lastIndex : " + s.lastIndexOf('r')+" "+s.lastIndexOf('C'));

		
		Consumer<String> combine=str.andThen(length).andThen(lastIndex);
		// Combines multiple Consumer instances using andThen.
		combine.accept("Consumer");
		//Print : Consumer
		//Length : 8
		//lastIndex : 7 0

	}

}
