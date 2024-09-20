package com.syam.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur no : ");//371
		int no=s.nextInt();
		boolean flag=true;
		for(int a=2;a<=no/2;a++)
		{
			if(no%a==0)
			{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("is prime number");
		else
			System.out.println("not prime");

	}

}
