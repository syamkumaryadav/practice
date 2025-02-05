package functionalInterfaces;

import java.util.function.Consumer;

public class fi01_Consumer_accept {

	public static void main(String[] args) {
		Consumer<String> str=s-> System.out.println("Print : "+s);
		str.accept(" Consumer. ");
	}

}
