package package2_comparator.part2_su_dung_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
		
		// Cach 1: Khoi tao obj Comparator<T> ngay trong ham Collections.sort()
		System.out.println("\n==> Danh sach sinh vien sap xep theo ID");
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				if(student1.getId() > student2.getId()) 	 return 1;
				else if(student1.getId() < student2.getId()) return -1;
				return 0;
			}
		});
		System.out.println("ID\tName");
		getList(students);
		
		// Cach 2: Khoi tao obj Comparator<T> rieng roi moi truyen vao Collections.sort()
		Comparator<Student> sortByName = new Comparator<Student>() {
			@Override
			public int compare(Student student1, Student student2) {
				int comparison = student1.getName().compareTo(student2.getName());
				return comparison;
			}
		};
		System.out.println("\n==> Danh sach sinh vien sap xep theo Name");
		Collections.sort(students, sortByName);
		System.out.println("ID\tName");
		getList(students);
	}
	
	public static void getList(List<Student> students) {
		for(Student student : students) {
			student.getInfo();
		}
	}
}
