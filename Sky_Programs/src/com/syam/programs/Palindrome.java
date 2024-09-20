package com.syam.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur string : ");//371
		String str=s.nextLine();
		String reverse="";
		char c;
		for(int a=0;a<str.length();a++)
		{
			c=str.charAt(a);
			reverse=c+reverse;
		}
		System.out.println(reverse);
		if(str.equals(reverse))
			System.out.println("given string is palindrome");
		else
			System.out.println("not palindrome");
	}

}
