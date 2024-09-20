package com.innerClasses.prgms;
interface InnerClass
{
	void show();
}
public class AnonmousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass n=new InnerClass()
		{
			public void show()
			{
				System.out.println("a class that is created or defined in main method without class name..");
			}
		};
		n.show();
	}

}
