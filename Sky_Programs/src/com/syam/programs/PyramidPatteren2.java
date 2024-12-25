package com.syam.programs;

public class PyramidPatteren2 {

	public static void main(String[] args) {
		int a,b,c,g=20;
		for(a=0;a<=5;a++)
		{
			for(b=0;b<=g;b++)
			{
				System.out.print(" ");
			}
			g--;
			for(c=0;c<=a;c++)
			{
				System.out.print("* ");
			}	
			System.out.println();
		}
		g=20;
		for(a=4;a>=0;a--)
		{
			for(b=4;b<=g;b++)
			{
				System.out.print(" ");
			}
			g++;
			for(c=0;c<=a;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
