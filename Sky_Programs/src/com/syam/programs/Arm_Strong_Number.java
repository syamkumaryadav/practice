package com.syam.programs;

import java.util.*;

public class Arm_Strong_Number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur 3 digits no : ");//371
		int no = s.nextInt();
		int arm = no, reminder, result = 0;
		while (no != 0) {
			reminder = no % 10;
			result += Math.pow(reminder, 3);
			no /= 10;
		}
		if (result == arm)
			System.out.print(arm + " is a Arm_Strong_Number. ");
		else
			System.out.print(arm + " is not a Arm_Strong_Number. ");
		s.close();
	}
}
