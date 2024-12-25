package com.syam.programs;

import java.util.ArrayList;

public class ListPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		ArrayList<Integer> Primearr=new ArrayList<>();
		ArrayList<Integer> NonPrimearr=new ArrayList<>();
		int notprimecount=0;
		int primecount=0;
		int total=a.length;
		
		for(int p :a)
		{
			boolean flag=true;
			for(int b=2;b<p;b++)
			{
				if(p%b==0)
				{
					flag=false;
				}
			}
			
			 if(flag) {
				 primecount++;
				 Primearr.add(p);
				 }
			 else {
				 notprimecount++;
				 NonPrimearr.add(p);
				 }
			 
		}
		System.out.println("Prime Number "+Primearr);
		System.out.println("NonPrime Numbers "+NonPrimearr);
		System.out.println("primecount "+primecount);
		System.out.println("not "+notprimecount);
		
		
	}

}
