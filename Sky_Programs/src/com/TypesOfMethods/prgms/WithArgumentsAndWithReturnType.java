package com.TypesOfMethods.prgms;

public class WithArgumentsAndWithReturnType {

		int add(int a, int b)
		{
			int c=a+b;
			return c;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		WithArgumentsAndWithReturnType  w=new WithArgumentsAndWithReturnType();
		int x=w.add(15,25);
		System.out.println(x);
	}

}
