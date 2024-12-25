package com.syam.programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] syam) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur no : ");
		int year=s.nextInt();
		if(year%4!=0)System.out.println(year +" not leap year...");
		else if(year%400==0)System.out.println(year +" leap year...");
		else if(year%100==0)System.out.println(year +" not leap year...");
		else System.out.println(year +" leap year...");
		s.close();
	}

}
