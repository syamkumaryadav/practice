package com.syam.programs;

public class InvertedTriangle {

	public static void main(String[] args) {
		int s=4;
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<a;b++)
			{
				System.out.print(" ");
			}
			for(int b=5;b>=a;b--)
			{
				System.out.print("* ");
			}
			System.out.println();
			s--;
		}
	}

}
