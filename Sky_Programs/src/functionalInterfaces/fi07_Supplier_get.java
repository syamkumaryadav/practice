package functionalInterfaces;

import java.util.function.Supplier;

public class fi07_Supplier_get {

	public static void main(String[] args) {
		Supplier<String> str=()->"Supplier";
		System.out.println(str.get());
			
		// It takes no input and provides a single output. 
	}

}
