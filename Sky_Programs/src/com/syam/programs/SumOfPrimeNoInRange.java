package com.syam.programs;

import java.util.Scanner;

public class SumOfPrimeNoInRange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur no : ");//371
		int no=s.nextInt();
		int total=0;
		for(int a=1;a<=no;a++)
		{
			boolean flag=true;
			for(int b=2;b<=a/2;b++)
			{
				if(a%b==0)
				{
					flag=false;
					break;
				}	
			}
			
			if(flag) {
				System.out.print(a+" ");
				total+=a;
			}
			System.out.println();
		}
		System.out.println(total +" ");
	}
}
