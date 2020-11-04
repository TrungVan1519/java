package package1_text_file.part2_bufferedwriter_and_bufferedreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

class TestedBufferedWriter {
	public void writeFile(Map<Integer, String> data) {
		try {
			// B1: Tao obj BufferedWriter
			BufferedWriter writer = new BufferedWriter(
									new OutputStreamWriter(
									new FileOutputStream(
									new File("C:\\Users\\Admin\\Desktop\\BufferedWriter.txt")), "UTF-8"));
			
			// B2: Ghi du lieu vao file
			for (Integer key : data.keySet()) {
				writer.write(key + "," + data.get(key));
				// > Dung de viet du lieu vao File
				writer.newLine();
				// > Dung de xuong dong ~ writer.write('\n');
			}
			writer.append("End of file");
			// > Dung de mo rong File
			
			// B3:  Luon phai close() obj BufferedWriter khi ghi xong File
			writer.close();
			// > Neu khong dong se bi loi va cac File khac sau do co the khong ghi duoc nua
			// > Khong can close() 2 obj OutputStreamWriter, FileOutputStream vi no duoc truyen
			//		vao BufferedWriter nen khi BufferedWriter close() thi 2 obj kia cung tu dong
			//		duoc close()
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestedBufferedReader {
	public void readFile() {
		try {
			// B1: Tao obj BufferedReader
			BufferedReader reader = new BufferedReader(
									new InputStreamReader(
									new FileInputStream(
									new File("C:\\Users\\Admin\\Desktop\\BufferedWriter.txt")), "UTF-8"));
			
			// B2: Ghi du lieu vao file
			String line = null;
			line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
				// > Doc tiep cac dong tiep theo
				// > Neu khong doc tiep thi se bi lap vo han dong dau tien
			}
			
			// B3: Luon phai close() obj BufferedWriter khi doc xong File
			reader.close();
			// > Neu khong dong se bi loi va cac File khac sau do co the khong doc duoc nua
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
		// Tao data
		Map<Integer, String> data = new HashMap<Integer, String>();
		createData(data);
		
		// Ghi file
		TestedBufferedWriter bufferedWriter = new TestedBufferedWriter();
		bufferedWriter.writeFile(data);
		
		// Doc file
		TestedBufferedReader bufferedReader = new TestedBufferedReader();
		bufferedReader.readFile();
	}

	private static void createData(Map<Integer, String> data) {
		for(int i = 1; i <= 10; i++) {
			data.put(i, "String " + i);
		}
	}
}
