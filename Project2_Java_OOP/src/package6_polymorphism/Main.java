package package6_polymorphism;

class Person {
	public void print() {
		System.out.println("class Person");
	}
}
class Student extends Person{
	public void print() {
		System.out.println("class Student");
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("==> Test 1:");
		Person p = new Student();
		p.print();
		
		Student s = new Student();
		Person p1 = (Person) s;
		p1.print();
		
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		System.out.println(p1 instanceof Person);
		System.out.println(p1 instanceof Student);
		
		System.out.println("\n==> Test 2:");
		Person per1 = new Person();
		Person per2 = new Student();
		Student std = new Student();
		System.out.println(per1 instanceof Student);
		System.out.println(per2 instanceof Student);
		System.out.println(std instanceof Person);
	}
	// => 2 class ke thua nhau thi obj tao boi class Con luon la instance cua class Con va class Cha
	// => obj class Cha = new Con() thi obj class Cha cung luon la instance cua class Con va class Cha
	// => obj class Cha  = new Cha() thi obj class Cha chi la instance cua class Cha
}