package functionalInterfaces;

import java.util.function.BinaryOperator;

public class fi13_BinaryOperator_apply {

	public static void main(String[] args) {
		BinaryOperator<Integer> no=(a,b)->(a+b);
		System.out.println(no.apply(13, 21));

	}

}
