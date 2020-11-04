package package2_serializable_file.part1_dataoutputstream_and_datainputstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

class TestedDataOutputStream {
	public void writeFile(Map<Integer, String> data) {
		try {
			// B1: Tao obj DataOutputStream
			DataOutputStream outputStream = new DataOutputStream(
											new BufferedOutputStream(
											new FileOutputStream(
											new File("C:\\Users\\Admin\\Desktop\\DataOutputStream.dat"))));
			
			// B2: Ghi du lieu vao File
			for (Integer key : data.keySet()) {
				outputStream.writeInt(key);
				outputStream.writeUTF(data.get(key));
			}
			
			// B3: Luon phai close() obj DataOutputStream khi ghi xong file
			outputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestedDataInputStream {
	public void readFile() {
		try {
			// B1: Tao obj DataInputStream
			DataInputStream inputStream = new DataInputStream(
										  new BufferedInputStream(
										  new FileInputStream(
										  new File("C:\\Users\\Admin\\Desktop\\DataOutputStream.dat"))));
			
			// B2: Doc du lieu tu file
			// Cach 1:
			while(inputStream.available() > 0) {
				int key = inputStream.readInt();
				System.out.println("key: " + key);
				String value = inputStream.readUTF();
				System.out.println("value: " + value);
			}
			
			// Cach 2: Su dung meo nhu cua ObjectOutputStream
//			boolean eof = false;
//			// > Danh dau het file
//			while(!eof) {
//				try {
//					int key = inputStream.readInt();
//					System.out.println("key: " + key);
//					String value = inputStream.readUTF();
//					System.out.println("value: " + value);
//					
//				} catch (EOFException e) {
//					eof = true;
//				}
//				// > Meo: Khi doc file serialize thi se doc het file cho den khi gap loi thi moi dung duoc
//				//		vi the ta se phai su dung 1 bien boolean eof cung 1 try-catch trong while(!eof)
//				//		Ta su dung eof de thoat khoi vong while() nen try{} se chay duoc khong bi nhay sang
//				//		catch{} tu do se khong bi bao loi ma van doc het file
//			}
			
			// B3: Luon phai close() obj DataInputStream khi doc xong file
			inputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class Main {
	public static void main(String[] args) {
		// Tao data
		Map<Integer, String> data = new HashMap<Integer, String>();
		createData(data);
		
		// Ghi file
		TestedDataOutputStream outputStream = new TestedDataOutputStream();
		outputStream.writeFile(data);
		
		// Doc File
		new TestedDataInputStream().readFile();
	}
	
	private static void createData(Map<Integer, String> data) {
		for(int i = 1; i <= 10; i++) {
			data.put(i, "String " + i);
		}
	}
}
