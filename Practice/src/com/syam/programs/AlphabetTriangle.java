package com.syam.programs;

public class AlphabetTriangle {
	public static void main(String[] syam) {
		int i = 5;
		char c = 'A';
		int s = 20;
		for (int a = 1; a <= i; a++) {
			for (int d = 1; d <= s; d++)
				System.out.print(" ");
			for (int b = 1; b <= a; b++) {
				System.out.print(c++ + " ");
			}
			System.out.println();
			s--;
		}
	}
}
