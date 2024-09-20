package com.alloops.prgms;

abstract class Animal
{
	protected String name;
	public Animal(String name)
	{
		this.name=name;
		System.out.println(name);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void sound();
}
class Dog extends Animal
{
	public Dog(String name)
	{
		super(name);
		//System.out.println(name);
	}
	public void sound()
	{
		System.out.println(name + " sounds barks");
	}
}
 class Cat extends Animal
{
	public Cat(String name)
	{
		super(name);
		//System.out.println(name);
	}
	public void sound()
	{
		System.out.println(name + " sounds miows");
	}
}
class Main
{
	public static void main(String args[])
	{
		Animal dog=new Dog("Dog");
		Animal cat=new Cat("Cat");
		dog.sound();
		cat.sound();
	}
	
}
