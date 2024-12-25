package com.syam.programs;

import java.util.Scanner;

public class RangeInPerfectNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur no : ");		//6, 28
		int no = s.nextInt();
		for (int a = 1; a <= no ; a++) 
		{
			int sum = 0;
			for(int b=1;b<a;b++) 		// = must not used dear here
			{
				if (a % b == 0)
				{
					sum += b;
				}
			}
			if ( sum == a ) {
				System.out.print(a + " ");
			} 
		}
		
		s.close();
	}

}


