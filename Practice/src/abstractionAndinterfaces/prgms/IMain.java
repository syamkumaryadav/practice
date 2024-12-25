package abstractionAndinterfaces.prgms;

//Defining an interface
interface Animal {
	abstract void eat();
	void sleep();
	static String s1="foo";
}

//Implementing the interface
class Dog implements Animal {
public void eat() {
   System.out.println(Animal.s1);
}

public void sleep() {
   System.out.println("Dog is sleeping");
}
}

class Cat implements Animal {
public void eat() {
   System.out.println("Cat is eating");
}

public void sleep() {
   System.out.println("Cat is sleeping");
}
}

//Using the implemented classes
public class IMain {
public static void main(String[] args) {
   Animal myDog = new Dog();
   Animal myCat = new Cat();
   System.out.println("jjjjjjjjjjjjj"+Dog.s1);
   
   myDog.eat();
   myDog.sleep();
   
   myCat.eat();
   myCat.sleep();
}
}
