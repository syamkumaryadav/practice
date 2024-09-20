package com.syam.programs;

import java.util.Scanner;

public class FebnocciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter ur no : ");
		int no=s.nextInt();
		int first=0,next=1,last;
		for(int a=1;a<=no;a++)
		{
			System.out.print(first +" ");
			last=first+next;
			first=next;
			next=last;
			
		}

	}

}
