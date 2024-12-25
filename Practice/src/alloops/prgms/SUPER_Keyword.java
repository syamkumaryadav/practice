package alloops.prgms;

class A {
	int x = 5;

	void show() {
		System.out.println("A class");
	}

}

class SUPER_Keyword extends A {

	int x = 10;

	void print() {
		int x = 15;
		System.out.println(x); //15
		System.out.println(this.x); //10
		System.out.println(super.x); //5
	}

	public static void main(String args[]) {
		SUPER_Keyword ob = new SUPER_Keyword();
		ob.print();
	}

}

class Aa {

	void show() {
		System.out.println("A class");
	}

}

class SUPER_Keyword2 extends Aa {

	void show() {
		System.out.println("B class");
	}

	void print() {
		show(); //B Class
		this.show(); //B Class
		super.show(); //A Class
	}

	public static void main(String args[]) {
		SUPER_Keyword2 ob = new SUPER_Keyword2();
		ob.print();
	}

}
