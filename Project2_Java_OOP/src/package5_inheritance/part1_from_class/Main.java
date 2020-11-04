package package5_inheritance.part1_from_class;

class Person {
	private String speech;
	
	public Person(String speech) {
		super();
		this.speech = speech;
	}
	
	public String getSpeech() {
		return speech;
	}
	
	protected void speak() {
		System.out.println("Person speaks: " + getSpeech());
	}
}

class Student extends Person {
	private String name;
	
	public Student(String speech, String name) {
		super(speech);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	protected void speak() {
		System.out.println("Student " + getName() + " speaks: " + getSpeech());
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("==> Person = new Person(): Goi ham speak() cua class Person");
		Person p1 = new Person("Alo");
		p1.speak();
		
		System.out.println("\n==> Student = new Student(): Goi ham speak() cua class Student");
		Student s1 = new Student("I love you 3000", "Tony Stark");
		s1.speak();
		
		System.out.println("\n==> Person = new Student(): Goi ham speak() cua class Student");
		Person p2= new Student("Goodbye", "Fan Marvel");
		p2.speak();
	}
	// => Tong ket:
	//	> Class Cha hoan toan co the chua bien private va chung la cua moi class Con ke thua
	//		class Cha nhung muon truy van nhung bien day thi phai su dung cac ham proteted
	//		hoac public
}
