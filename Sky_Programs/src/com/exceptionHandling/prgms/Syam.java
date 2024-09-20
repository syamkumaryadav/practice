package com.exceptionHandling.prgms;

public class Syam {
	
	public static void checkAge(int age) throws SyamException
	{
		if(age<18)
			throw new SyamException("invalid age");
		else
			System.out.println("valid");
	}
	public static void main(String[] args) {
		try {
			checkAge(2);
		} catch (SyamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
