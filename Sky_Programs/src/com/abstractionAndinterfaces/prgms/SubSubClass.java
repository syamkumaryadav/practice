package com.abstractionAndinterfaces.prgms;

public class SubSubClass extends ChildClass implements A {
	public void show() {System.out.println("interface method show");}
	void syam() {System.out.println("syam");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubSubClass s=new SubSubClass();
		System.out.println(A.x);
		s.display();
		s.syam();
		s.method();
		s.show();
	}

}
