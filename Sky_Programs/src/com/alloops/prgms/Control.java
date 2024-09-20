package com.alloops.prgms;

abstract class Parent{
	protected String name;
	
	abstract void something();
	Parent(String name)
	{
		this.name=name;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
class Child1 extends Parent
{
	
	Child1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	void something()
	{
		System.out.println("parent offers to "+name);
	}
}
class Child2 extends Parent
{
	Child2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	void something()
	{
		System.out.println("parent offers to "+name );
	}
}
public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c1=new Child1("syam");
		Child2 c2=new Child2("kumar");
		c1.something();
		c2.something();
	}

}
