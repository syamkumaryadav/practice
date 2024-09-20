package com.polymorphism.prgms;


class A
{
	static void sky()
	{
		System.out.print("parent class method");
	}
}
public class MethodHiding extends A{

	static void sky()
	{
		System.out.print("child class method");
	}
	public static void main(String[] args) {
		MethodHiding mh=new MethodHiding();
		
		mh.sky();
	}

}
