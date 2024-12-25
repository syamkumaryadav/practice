package com.syam.programs;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] syam) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur no : ");
		int no = s.nextInt();
		int fact = 1;
		for (int a = 1; a <= no; a++) {
			fact *= a;
		}
		System.out.println(no + "factorial is " + fact);
		s.close();
	}
}
