package com.innerClasses.prgms;


public class MemberClass {
	 class InnerClass
	{
		void show()
		{
			System.out.println("a class that is created or defined in another class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberClass m=new MemberClass();
		MemberClass.InnerClass i=m.new InnerClass();
		i.show();
		
		
		new MemberClass().new InnerClass().show();
	}

}
