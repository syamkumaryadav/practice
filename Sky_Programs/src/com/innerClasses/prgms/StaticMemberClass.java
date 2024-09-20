package com.innerClasses.prgms;

//import com.innerClasses.prgms.MemberClass.InnerClass;

public class StaticMemberClass {
	static class InnerClass
	{
		void show()
		{
			System.out.println("a class that is created or defined in another class with static keyword");
		}
	}
	public static void main(String[] args) {
		
		
		
		new InnerClass().show();
	}

}
