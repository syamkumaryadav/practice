package alloops.prgms;

class Student1 {
	String name;
	int rollNo;

	static int count = 0;

	static int setRollNo() {
		count++;
		return count;
	}

	static String clg;

	static void setClg(String name) {
		clg = name;
	}

	public Student1(String name) {
		this.name = name;
		this.rollNo = setRollNo();
	}

	public void displayStudent() {

		Student1.setClg("BEC");
		System.out.print("name : " + this.name + "  ");
		System.out.print("rollNo : " + this.rollNo + "  ");

		// accessing static variable
		System.out.print("cllgName : " + clg + "  ");
		System.out.println();
	}
}

public class Static_Importance {

	public static void main(String[] args) {

		Student1 student1 = new Student1("Syam");
		Student1 student2 = new Student1("Kumar");

		student1.displayStudent();
		student2.displayStudent();
	}

}
