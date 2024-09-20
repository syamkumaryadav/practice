package com.syam.programs;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur no : ");//371
		int no=s.nextInt();
		int fact=1;
		for(int a=1;a<=no;a++)
		{
			fact=fact*a;
		}
		System.out.println(no + "factorial is " +fact);
			
		
	}

}
