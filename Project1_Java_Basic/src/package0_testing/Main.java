package package0_testing;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner; 

class Student implements Serializable 
{ 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	public Scanner s = new Scanner(System.in);
	
	
	
	private int id;
	private String name;
	private Date birthday;
	private boolean gender;
	private double score;
	public Student(int id, String name, String birthday, boolean gender, double score) {
		super();
		this.id = id;
		this.name = name;
		try {
			this.birthday =  new SimpleDateFormat("dd/MM/yyyy").parse(birthday);
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.gender = gender;
		this.score = score;
//		s.close();
	}
	public void getInfo() {
		System.out.print("Ma:" + this.id
							+ "\tHo ten:" + this.name
//							+ "\tNgay sinh:" + new SimpleDateFormat("dd/MM/yyyy").format(this.birthday)
							+ this.birthday
							+ "\tGioi tinh:" + (this.gender ? "Nam" : "Nu")
							+ "\tDiem trung binh:" + this.score);
	}
} 
class StudentHTTT extends Student 
{ 
	static public Scanner s = new Scanner(System.in);
	private int fee;
    // parameterized constructor 
	public StudentHTTT(int id, String name, String birthday, boolean gender, double score, int fee) {
		super(id, name, birthday, gender, score);
		this.fee = fee;
	}
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("\tTien hoc phi:" + this.fee);
	}
} 

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StudentHTTT b1 = new StudentHTTT(1, "abc", "1/1/1111", true, 1d, 1);
        ObjectOutputStream oos = new ObjectOutputStream(
        							new FileOutputStream("abc.dat")); 
        oos.writeObject(b1); 
        oos.close(); 
        
        
        ObjectInputStream ois = new ObjectInputStream(
        							new FileInputStream("abc.dat")); 
        StudentHTTT b2 = (StudentHTTT)ois.readObject(); 
        b2.getInfo();
        ois.close(); 
        
	}
}