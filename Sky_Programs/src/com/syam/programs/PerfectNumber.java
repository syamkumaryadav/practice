package com.syam.programs;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isPerfectNumber(int num) {
		int sum=0;
		for (int a = 1; a <= num / 2; a++) {
			
			if (num % a == 0) {
				sum += a;
			}
		
		}
		return sum==num;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur no : ");		//6, 28
		int number = s.nextInt();
		if (isPerfectNumber(number)) {
			System.out.println(number + " is perfect number...");
		} else
			System.out.println(number + " is not perfect number...");
		
								/*
								  	Scanner s = new Scanner(System.in);
									System.out.print("Enter ur no : ");		//6, 28
									int number = s.nextInt();
									int sum = 0, noo = no;
								for (int a = 1; a <= no / 2; a++) {
								
									if (no % a == 0) {
										sum += a;
									}
								
								}
								if (sum == noo) {
									System.out.println(noo + " is perfect number...");
								} else
									System.out.println(noo + " is not perfect number...");
								*/
	s.close();
	}
}
