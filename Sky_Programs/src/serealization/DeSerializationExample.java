package serealization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		FileInputStream fileInputStream = new FileInputStream("person.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Person person1 = (Person) objectInputStream.readObject();
		System.out.println("Object De-serialized successfully....");
		System.out.println(person1.getName() + ", " + person1.getAge());
		//System.out.println(person.getName() + ", " + person.getAge());   here gives error
	} 
}
