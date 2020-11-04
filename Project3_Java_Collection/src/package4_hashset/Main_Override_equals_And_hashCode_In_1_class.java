package package4_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Student {
	private int age;
	private String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Tuoi: " + this.age 
				+ "\tTen: " + this.name;
	}
}

class Teacher {
	private int age;
	private String name;
	
	public Teacher(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Tuoi: " + this.age 
				+ "\tTen: " + this.name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + 1519;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			Teacher other = (Teacher) obj;
			if(this.name == null || other.name == null) {
				return false;
			}
			return this.name.contentEquals(other.name);
		}
	}
}

public class Main_Override_equals_And_hashCode_In_1_class {
	
	public static void main(String[] args) {
		// ==> 1.Khoi tao 1 HashSet moi
		Set<Integer> ints = new HashSet<Integer>();
		Set<Student> students = new HashSet<Student>();
		Set<Teacher> teachers = new HashSet<Teacher>();
		
		// ==> 2.Test voi kieu primitive trong HashSet
		System.out.println("==> 2.Test voi kieu primitive trong HashSet");
		testPrimitiveInHashSet(ints);
		
		// ==> 3.Test kieu Object trong HashSet nhung khong duoc override
		//		2 ham equals() va hashCode()
		System.out.println("\n==> 3.Test kieu Object trong HashSet nhung " 
						+ "khong duoc override 2 ham equals() va hashCode()");
		testNonPrimitveToHashSet1(students);
		
		// ==> 4.Test kieu Object trong HashSet nhung da duoc override
		//		2 ham equals() va hashCode()
		System.out.println("\n==> 4.Test kieu Object trong HashSet nhung " 
				+ "da duoc override 2 ham equals() va hashCode()");
		testNonPrimitveToHashSet2(teachers);
	}

	private static void testPrimitiveInHashSet(Set<Integer> ints) {
		// => Them phan tu
		System.out.println("=> Them phan tu");
		ints.add(1);
		ints.add(1);
		ints.add(2);
		ints.add(2);
		// > Kieu HashSet giong kieu ArrayList nhung chi khac 1 cho HashSet
		//		khong them cac phan tu bi trung lap, con ArrayList thi co
		for (Integer integer : ints) {
			System.out.println(integer);
		}
		// => Xoa phan tu
		System.out.println("=> Xoa phan tu \"1\"");
		ints.remove(1);
		for (Integer integer : ints) {
			System.out.println(integer);
		}
	}

	private static void testNonPrimitveToHashSet1(Set<Student> students) {
		// => Them phan tu
		System.out.println("=> Them phan tu");
		students.add(new Student(20, "ABC"));
		students.add(new Student(20, "ABC"));
		students.add(new Student(20, "XYZ"));
		// > Vi voi kieu non-primitive thi cac object khac nhau tro toi cac o
		//		nho khac nhau trong may tinh nen chung la khac nhau mac du 
		//		co cung cac thuoc tinh nen khi them 2 object giong nhau ve
		//		mat ngu nghia ta van co the them duoc
		// > Voi kieu HashSet (va ca HashMap) neu ta nen override lai 2 ham
		//		equals() va hashCode() thi ta se giai quyet duoc van de tren:
		//		la HashSet co the them cac object giong nhau ve mat ngu nghia
		//		thanh HashSet se khong the them cac object giong nhau ve mat
		//		ngu nghia nua
		for (Student student : students) {
			System.out.println(student);
		}
		// => Xoa phan tu
		System.out.println("=> Xoa phan tu Student(20, \"ABC\")");
		students.remove(new Student(20, "ABC"));
		for (Student student : students) {
			System.out.println(student);
		}
		// > Nhu da noi o tren 2 object thi luon khac nhau du chung giong
		//		nhau ve mat ngu nghia boi chung quan ly cac o nho khac nhau
		//		trong may tinh (khac nhau ve mat tham chieu references)
		//		nen khi ta truyen 1 bien object de xoa thi no cung khong
		//		xoa dc vi 2 object nay luon khac nhau
	}

	private static void testNonPrimitveToHashSet2(Set<Teacher> teachers) {
		// => Them phan tu
		System.out.println("=> Them phan tu");
		teachers.add(new Teacher(20, "ABC"));
		teachers.add(new Teacher(20, "ABC"));
		teachers.add(new Teacher(20, "XYZ"));
		// > Vi voi kieu non-primitive thi cac object khac nhau tro toi cac o
		//		nho khac nhau trong may tinh nen chung la khac nhau mac du 
		//		co cung cac thuoc tinh nen khi them 2 object giong nhau ve
		//		mat ngu nghia ta van co the them duoc. Tuy nhien khi ta
		//		override 2 ham hashCode() va dac biet la equals() thi khi nay
		//		ta chi so sanh ngu nghia 2 object voi nhau thoi thay vi so 
		//		sanh ca mat tham chieu nen khi nay 2 object la giong nhau
		//		nen HashSet se loai bo object bi trung lap ve mat ngu nghia
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}
		// => Xoa phan tu
		System.out.println("=> Xoa phan tu Teacher(20, \"ABC\")");
		teachers.remove(new Teacher(20, "ABC"));
		for (Teacher teacher : teachers) {
			System.out.println(teacher);
		}
		// > Nhu da noi o tren 2 object thi luon khac nhau du chung giong
		//		nhau ve mat ngu nghia boi chung quan ly cac o nho khac nhau
		//		trong may tinh (khac nhau ve mat tham chieu references)
		//		nhung ta da override lai hashCode() va equals() de chi so
		//		sanh 2 object ve mat ngu nghia thoi thay vi so sanh ca mat
		//		tham chieu nen khi nay 2 object la giong nhau nen se xoa dc
	}
}
