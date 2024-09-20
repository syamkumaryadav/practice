package com.syam.programs;

public class Patteren {

	public static void main(String[] args) {
		int n=5,m=2;
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=2;b++)
			{
				if(a==3&&b==1)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=n;b++)
			{
				if(a==b||a+b==n+1||a==1||a==n||b==1||b==n)
				{
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
