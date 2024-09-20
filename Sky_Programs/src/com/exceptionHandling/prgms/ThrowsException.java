package com.exceptionHandling.prgms;

public class ThrowsException {
	 static void checkAge(int age) throws ArithmeticException{
		if(age<18)
		{
			throw new ArithmeticException("access denied..." );
		}
		else {System.out.println("access granted..");}
	}
	
	public static void main(String[] args)  {
		/*
		 * ThrowsException t=new ThrowsException(); t.checkAge(2);
		 */
		checkAge(22);
	}

}
