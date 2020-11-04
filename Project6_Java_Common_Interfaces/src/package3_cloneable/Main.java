package package3_cloneable;

class Student implements Cloneable {
	private String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Student copy() throws CloneNotSupportedException {
		return (Student) this.clone();
	}
}

public class Main {
	public static void main(String[] args) {
		// Tao 1 obj ShallowCopy
		Student student1 = new Student("ForShallowCopy");
		// Tao 1 obj khac va gan cho obj da tao
		Student student2 = null ;
		try {
			student2 = student1.copy();
		
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("student1.getTest() ban dau: " + student1.getName());
		System.out.println("student2.getTest() ban dau: " + student2.getName());
		student2.setName("student2 sua nhung shallowCopy1 khong bi anh huong");
		System.out.println("student1.getTest() sau khi student2 sua name: " + student1.getName());
		System.out.println("student2.getTest() sau khi student2 sua name: " + student2.getName());
	}
}
