package package5_inheritance.part2_from_abstarct_class;

abstract class Animal {
	abstract protected void speak();
	// > Voi ham abstract thi khong co than ham
}

abstract class Person extends Animal {
	private String speech;
	
	public Person(String speech) {
		super();
		this.speech = speech;
	}

	public String getSpeech() {
		return speech;
	}
	
	abstract protected void speak();
	// > Class Con khong override ma tiep tuc ghi tiep ham abstract nay tiep
	// > Khi nay class Con tiep tuc phai la class abstract
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
	// > Den class Chau moi override
}

public class Main {
	public static void main(String[] args) {
		System.out.println("==> Vi ke thua tu class abstract Person nen khong the Person = new Person() duoc");
		
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
	//	> Class abstract thi giong class thuong nhung dac biet hon la co the chua ham abstract
	//		trong khi class thuong thi khong co va class abstract thi khong khoi tao duoc obj
	//	> Ham abstract trong class abstract thi khong co than ham nhung van co modifier access
	//		va class Con ke thua class abstract thi phai override lai ham nay hoac tiep tuc
	//		ghi lai tiep tuc ham abstract nay tiep cho class Chau ke thua override va luc nay 
	//		class Con se lai la 1 abstract class giong nhu class Cha tiep
}
