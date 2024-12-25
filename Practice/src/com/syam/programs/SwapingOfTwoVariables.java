package com.syam.programs;

public class SwapingOfTwoVariables {
	public static void main(String[] syam) {
		int a = 10;
		int b = 56;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}
}
