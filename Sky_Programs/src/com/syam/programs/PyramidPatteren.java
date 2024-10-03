package com.syam.programs;

public class PyramidPatteren {

	public static void main(String[] args) {
		int s=18;
	for(int a=1;a<=5;a++)
	{
		for(int b=1;b<=s;b++)
		{
			System.out.print(" ");
		}
		for(int b=1;b<=a;b++)
		{
			System.out.print("* ");
		}
		s--;
		System.out.println();
	}
		
	}

}
