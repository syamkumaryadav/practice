package com.innerClasses.prgms;

public class LocalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class InnerClass
		{
			void show()
			{
				System.out.println("a class that is created or defined in main method.");
			}
		}
		new InnerClass().show();

	}

}
