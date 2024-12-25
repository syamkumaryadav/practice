package alloops.prgms;

public class THIS_Keyword1 {

	int no;
	String name;

	public THIS_Keyword1(int no, String name) {
		this.no = no; // OBSERVE THERE.......Names
		this.name = name;
	}

	void display() {
		System.out.println("details : " + no + "    " + name); // 0, null
	}

	public static void main(String[] args) {
		THIS_Keyword1 t = new THIS_Keyword1(18, "syam");
		t.display();
	}
}

//If local variables(formal arguments) and instance variables are different,
//		there is no need to use this keyword like in the following program:

class THIS_Keyword3 {

	int no;
	String name;

	public THIS_Keyword3(int n, String na) {
		no = n;
		name = na;
	}

	void display() {
		System.out.println("Information :" + no + "    " + name); // 1, syam
	}

	public static void main(String[] args) {
		THIS_Keyword3 t = new THIS_Keyword3(1, "syam");

		t.display();
	}
}

// Constructor channing....

class THIS_Method {
	
	THIS_Method() {
		this(5);
		System.out.println("SYAM hello.......!");
	}

	THIS_Method(int x) {
		System.out.println(x);
		// Call to this() must be the first statement in constructor
	}

	THIS_Method(String nam) {
		System.out.println(nam);
	}

	public static void main(String args[]) {
		THIS_Method a = new THIS_Method();

	}
}

//++++++++++++++++++++++             Real usage of this() constructor call             ++++++++++++++++++++++++

class Student {
	int rollno;
	String name, course;
	float fee;

	Student(int rollno, String name, String course) {
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	Student(int rollno, String name, String course, float fee) {
		this(rollno, name, course); //reusing constructor 	+++++++++++++ 
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + course + " " + fee);
	}

	public static void main(String args[]) {
		Student s1 = new Student(111, "Syam", "java");
		Student s2 = new Student(112, "Kumar", "java", 6000f);
		s1.display();
		s2.display();
	}
}

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

class Syam {
	Syam getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}

	public static void main(String args[]) {
		new Syam().getA().msg();
	}
}