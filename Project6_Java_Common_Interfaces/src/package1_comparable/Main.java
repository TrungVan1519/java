package package1_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void getInfo() {
		System.out.println(id + "\t" + name);
	}

	@Override
	public int compareTo(Student student) {
		if(this.id > student.id) 	  return 1;
		else if(this.id < student.id) return -1;
		return 0;
	}
}

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(2, "ABC"));
		students.add(new Student(4, "XYZ"));
		students.add(new Student(3, "MN"));
		students.add(new Student(1, "PQ"));
		
		System.out.println("==> Danh sach sinh vien ban dau");
		System.out.println("ID\tName");
		for(Student student : students) {
			student.getInfo();
		}
		
		System.out.println("\n==> Danh sach sinh vien sau khi sap xep");
		Collections.sort(students);
		System.out.println("ID\tName");
		for(Student student : students) {
			student.getInfo();
		}
	}
}
