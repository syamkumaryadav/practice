package functionalInterfaces;

import java.util.function.Consumer;


class Student {
    String name;
    int grade;

    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}


public class fi06_Consumer_Custom_Object {

	public static void main(String[] args) {
		Student student = new Student("Syam", 89);

        Consumer<Student> printStudent = s -> 
            System.out.println("Student Name: " + s.name + ", Grade: " + s.grade);

        printStudent.accept(student); 
	}

}
