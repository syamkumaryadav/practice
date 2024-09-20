package com.newfeatures.prgms;


interface test
{
	void show();
	
}
public class Demo {

	public static void main(String[] args) {
		test t=new test()
				{
					public void show()
					{
						System.out.println("@functionInterface");
					}
					
				};
				t.show();
	}

}
