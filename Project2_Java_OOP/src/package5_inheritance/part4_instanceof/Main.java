package package5_inheritance.part4_instanceof;

import java.util.List;
import java.util.ArrayList;

class Person {
	public void print() {
		System.out.println("class Person");
	}
}

class Teacher extends Person {
	@Override
	public void print() {
		System.out.println("class Teacher");
	}
}

class Student extends Person{
	@Override
	public void print() {
		System.out.println("class Student");
	}
}

public class Main {
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Teacher());
		people.add(new Student());
		
		for(var person : people) {
			if(person instanceof Teacher) {
				person.print();
				System.out.println("obj class Teacher\n");
			} else if(person instanceof Student) {
				person.print();
				System.out.println("obj class Student\n");
			}
		}
	}
}
