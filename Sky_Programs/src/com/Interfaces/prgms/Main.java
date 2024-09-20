package com.Interfaces.prgms;

//Defining an interface
interface Animal {
	abstract void eat();
	void sleep();
}

//Implementing the interface
class Dog implements Animal {
 public void eat() {
     System.out.println("Dog is eating");
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
public class Main {
 public static void main(String[] args) {
     Animal myDog = new Dog();
     Animal myCat = new Cat();
     
     myDog.eat();
     myDog.sleep();
     
     myCat.eat();
     myCat.sleep();
 }
}


