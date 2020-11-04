package package4_serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class TestedObjectOutputStream {
	public void writeFile(List<Person> people) {
		try {
			// B1: Tao obj ObjectOutputStream
			ObjectOutputStream outputStream = new ObjectOutputStream(
											  new FileOutputStream(
											  new File("C:\\Users\\Admin\\Desktop\\ObjectInputStream.dat")));
			
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
											new File("C:\\Users\\Admin\\Desktop\\ObjectInputStream.dat")));
			
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
		people.add(new Person("Đậu"));
		people.add(new Person("Xanh"));
		people.add(new Person("Xanh"));
		people.add(new Person("Muống"));
		
		//// Ghi File
		TestedObjectOutputStream outputStream = new TestedObjectOutputStream();
		outputStream.writeFile(people);
		
		//// Doc File
		TestedObjectInputStream inputStream = new TestedObjectInputStream();
		inputStream.readFile();
	}
}