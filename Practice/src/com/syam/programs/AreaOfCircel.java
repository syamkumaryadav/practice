package com.syam.programs;

import java.util.Scanner;

public class AreaOfCircel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur no : ");
		int radius=s.nextInt();
		float pi=3.142f,area;
		area=pi*radius*radius;
		System.out.println("Area of Circel = "+area);
		s.close();
	}	
}
