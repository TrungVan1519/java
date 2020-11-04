package package2_serializable_file.part2_objectoutputstream_and_objectinputstream.ver1_without_inheritance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Scanner s = new Scanner(System.in);
	
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName() {
		System.out.println("Nhap ten: ");
		this.name = s.nextLine();
	}
}

class TestedObjectOutputStream {
	public void writeFile(List<Person> people) {
		try {
			// B1: Tao obj ObjectOutputStream
			ObjectOutputStream outputStream = new ObjectOutputStream(
											  new FileOutputStream(
											  new File("C:\\Users\\Admin\\Desktop\\ObjectInputStream_ver1.dat")));
			
			// B2: Ghi du lieu vao file
			for (Person person : people) {
				outputStream.writeObject(person);
			}
			outputStream.writeUTF("End of File");
			
			// B3: Luon luon phai close() obj ObjectInputStream khi ghi xong file
			outputStream.close();
			// > Neu khong se bi loi va cac File khac sau do co the khong ghi duoc nua
			// > Khong can close() 2 obj OutputStreamWriter, FileOutputStream vi no duoc truyen
			//		vao BufferedWriter nen khi BufferedWriter close() thi 2 obj kia cung tu dong
			//		duoc close()
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestedObjectInputStream {
	public void readFile() {
		try {
			// B1: Tao obj ObjectInputStream
			ObjectInputStream inputStream = new ObjectInputStream(
											new FileInputStream(
											new File("C:\\Users\\Admin\\Desktop\\ObjectInputStream_ver1.dat")));
			
			// B2: Doc du lieu tu file ra
			boolean eof = false;
			// > Danh dau het file
			while (!eof) {
				try {
					Person person = (Person) inputStream.readObject();
					System.out.println("Person obj: " + person + "\tName: " + person.getName());
					
				} catch (Exception e) {
					eof = true;
				}
				// > Meo: Khi doc file serialize thi se doc het file cho den khi gap loi thi moi dung duoc
				//		vi the ta se phai su dung 1 bien boolean eof cung 1 try-catch trong while(!eof)
				//		Ta su dung eof de thoat khoi vong while() nen try{} se chay duoc khong bi nhay sang
				//		catch{} tu do se khong bi bao loi ma van doc het file
			}
			String line = inputStream.readUTF();
			System.out.println(line);
			
			
			// B3: Luon phai close() obj ObjectInputStream khi doc xong File
			inputStream.close();
			// > Neu khong se bi loi va cac File khac sau do co the khong ghi duoc nua
			// > Khong can close() 2 obj OutputStreamWriter, FileOutputStream vi no duoc truyen
			//		vao BufferedWriter nen khi BufferedWriter close() thi 2 obj kia cung tu dong
			//		duoc close()

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		//// Tao data
		ArrayList<Person> people = new ArrayList<Person>();
		System.out.println("Nhap so luong nguoi:");
		int count = Integer.parseInt(new Scanner(System.in).nextLine());
		for (int i = 0; i < count; i++) {
			Person p = new Person();
			p.setName();
			people.add(p);
		}
		
		//// Ghi File
		TestedObjectOutputStream outputStream = new TestedObjectOutputStream();
		outputStream.writeFile(people);
		
		//// Doc File
		TestedObjectInputStream inputStream = new TestedObjectInputStream();
		inputStream.readFile();
	}
	// => Tong ket:
	//	> Voi TH chi co cac class rieng re, khong ke thua nhau thi class nao muon ghi file
	//		serialize thi phai implements interface Serializable, neu khong se gap loi
	// 	> Khi trong class muon ghi file serialize (ta da implements interface Serializable roi)
	//		ma con co obj java.util.Scanner (thuong de nhap, xuat du lieu cho cac thuoc tinh)
	//		thi khi ghi file serialize ta phai de obj java.util.Scanner la "static" neu khong
	//		se bi 1 loi khac (neu khong tin co the keo len class Person roi xoa "static di,
	//		roi sau do chay chuong trinh de ghi file xem lieu co ghi duoc khong hay la bi bao
	//		loi :v)
}
