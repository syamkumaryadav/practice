package com.exceptionHandling.prgms;

public class ThrowNewCustomException {
	public void checkAge(int age) throws CustomException
	{
		if(age<18)
		{ 
			throw new CustomException("age must be grater than 18 years.");
		}else {
			System.out.println("Number is valid: " + age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowNewCustomException t=new ThrowNewCustomException();
		
		try {
			t.checkAge(5);
		}catch(CustomException e)
		{
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}

}
