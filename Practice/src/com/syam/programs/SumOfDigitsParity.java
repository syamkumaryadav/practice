package com.syam.programs;

import java.util.Scanner;

public class SumOfDigitsParity {

	public static void main(String[] syam) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur no : ");
		int no = s.nextInt();
		int noo = no, reminder, parity = 0;
		while (no != 0) {
			reminder = no % 10;
			parity += reminder;
			no /= 10;
		}
		if (parity % 2 == 0)
			System.out.println(noo + " Sum Of Digits Parity Number is Even: " + parity);
		else
			System.out.println(noo + " Sum Of Digits Parity Number is odd: " + parity);
		s.close();
	}

}
