package syam.programs;

import java.util.Scanner;

public class ArrayUsingRangeInPerfectNumber {		//Perfect Number

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur no : "); //6, 28
		int no = s.nextInt();
		int size = 0;
		for (int a = 1; a <= no; a++) {
			int sum = 0;
			for (int b = 1; b < a; b++) // = must not used dear here
			{
				if (a % b == 0) {
					sum += b;
				}
			}
			if (sum == a) {
				array[size++] = a;
			}
		}
		for (int d : array) {
			System.out.print(d + " ");
		}
		s.close();
	}
}
