package com.alloops.prgms;

public class Encapuslation {

	private int age;
	void setAge(int age)
	{
		if(age<0)
			this.age=0;
		else if(age>100)
			this.age=100;
		else
			this.age=age;
	}
	int getAge()
	{
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapuslation e=new Encapuslation();
		e.setAge(-3);
		int x=e.getAge();
		System.out.println(x);
	}

}
