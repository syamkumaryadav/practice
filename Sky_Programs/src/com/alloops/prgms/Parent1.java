package com.alloops.prgms;

public abstract class Parent1 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Parent1(String name) {
		super();
		this.name = name;
	}
	
	void method()
	{
		System.out.println("parent method");
	}
	

}
