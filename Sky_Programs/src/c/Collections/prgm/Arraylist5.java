package c.Collections.prgm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class student {
	int pinno;
	String name;
	double marks_percentage;

	student(int pinno, String name, double marks_percentage) {
		this.pinno = pinno;
		this.name = name;
		this.marks_percentage = marks_percentage;
	}
}

class Arraylist5 {
	public static void main(String args[]) {
		student s1 = new student(101, "sonno", 99.8);
		student s2 = new student(102, "ravi", 99.6);
		student s3 = new student(103, "hemanth", 98.5);
		int flag = 0;
		ArrayList<student> al = new ArrayList<student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Entered the pin no of the student to search:");
		int pin = sc.nextInt();
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			student st = (student) itr.next();
			if (pin == st.pinno) {
				System.out.println("yours entered pin number got percentage:" + st.marks_percentage);
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("no such pin number exists");
		sc.close();
	
	}
}
