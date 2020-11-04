package package2_comparator.part1_su_dung_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SortByID implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		if(student1.getId() > student2.getId()) 	 return 1;
		else if(student1.getId() < student2.getId()) return -1;
		return 0;
	}
}

class SortByName implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		int comparison = student1.getName().compareTo(student2.getName());
		return comparison;
	}
}

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public void getInfo() {
		System.out.println(id + "\t" + name);
	}
}

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(2, "A"));
		students.add(new Student(4, "D"));
		students.add(new Student(3, "B"));
		students.add(new Student(1, "C"));

		System.out.println("==> Danh sach sinh vien ban dau");
		System.out.println("ID\tName");
		getList(students);
		
		System.out.println("\n==> Danh sach sinh vien sap xep theo ID");
		Collections.sort(students, new SortByID());
		System.out.println("ID\tName");
		getList(students);
		
		System.out.println("\n==> Danh sach sinh vien sap xep theo Name");
		Collections.sort(students, new SortByName());
		System.out.println("ID\tName");
		getList(students);
	}
	
	public static void getList(List<Student> students) {
		for(Student student : students) {
			student.getInfo();
		}
	}
}
