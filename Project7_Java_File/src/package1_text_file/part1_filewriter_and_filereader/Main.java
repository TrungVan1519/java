package package1_text_file.part1_filewriter_and_filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TestedFileWriter {
	public void writeFile_Cach1(Map<Integer, String> data) throws IOException {
		// B1: Tao obj FileWriter
		FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\FileWriterWay1.txt");
		
		// B2: Ghi du lieu vao file
		for(Integer key : data.keySet()) {
			writer.write(key + "," + data.get(key) + "\n");
		}
		System.out.println("Done");
		
		// B3: Luon phai close() obj FileWriter khi viet xong file
		writer.close();
	}

	public void writeFile_Cach2(Map<Integer, String> data) throws IOException {
		try(FileWriter writer = new FileWriter("C:\\Users\\Admin\\Desktop\\FileWriterWay2.txt")){
			for(Integer key : data.keySet()) {
				writer.write(key + "," + data.get(key) + "\n");
			}
			System.out.println("Done");
		}
		// > Khi su dung cach nay (khoi tao obj Scanner trong try()) thi khong can phai close() 
		//		obj Scanner vi sau khi chay het try(){} thi obj Scanner se tu dong bi huy 
		//		(keo theo obj FileReader cung se bi huy theo) nen khong can close() obj nao ca
	}
}

class TestedFileReader {
	public void readFile_Cach1() throws IOException {
		// B1: Vi obj FileReader chi doc duoc tung char nen phai truyen vao obj Scanner
		Scanner scanner = new Scanner(
						  new FileReader("C:\\Users\\Admin\\Desktop\\FileWriterWay1.txt"));
		
		// B2: Doc du lieu tu file ra
		int sumKey = 0;
		String sumValue = "";
		
		scanner.useDelimiter(",");
		// > Su dung dau phan cach la ","
		
		while (scanner.hasNextLine()) {
			int key = scanner.nextInt();
			// > key la kieu Integer
			scanner.skip(scanner.delimiter());
			// > Bo qua khi gap dau phan cach (la dau "," da thiet lap o tren)
			String value = scanner.nextLine();
			// > value la kieu String
			
			sumKey += key;
			sumValue += value + "\n";
		}
		System.out.println("sumKey: "  + sumKey + "\n");
		System.out.println("sumValue:\n" + sumValue);
		// > Khi su dung obj Scanner ta co the phan tich cu phap ngay khi doc file de biet dau la
		//		kieu int, dau la kieu String, ... de tinh toan tien loi hon thay vi phai ep kieu
		//		String sang cac kieu Integer, ...
		
		// B3: Luon phai close() obj Scanner
		// reader.close(); 
		// > Khong can phai close() obj FileReader vi khi truyen obj FileReader vao obj Scanner thi 
		//		close() obj Scanner se tu dong close() obj FileReader cho ta
		scanner.close();
	}

	public void readFile_Cach2() throws FileNotFoundException, IOException {
		// B1: Tao obj Scanner co truyen vao la 1 obj FileReader
		try(FileReader reader = new FileReader("C:\\Users\\Admin\\Desktop\\FileWriterWay2.txt");
			Scanner scanner = new Scanner(reader)){
			
			// B2: Doc du lieu tu file ra
			int sumKey = 0;
			String sumValue = "";
			
			scanner.useDelimiter(",");
			// > Su dung dau phan cach la ","

			while (scanner.hasNextLine()) {
				int key = scanner.nextInt();
				// > key la kieu Integer
				scanner.skip(scanner.delimiter());
				// > Bo qua khi gap dau phan cach (la dau "," da thiet lap o tren)
				String value = scanner.nextLine();
				// > value la kieu String

				sumKey += key;
				sumValue += value + "\n";
			}
			System.out.println("sumKey: " + sumKey + "\n");
			System.out.println("sumValue:\n" + sumValue);
		}
		// > Khi su dung cach nay (khoi tao obj Scanner trong try()) thi khong can phai close() 
		//		obj Scanner vi sau khi chay het try(){} thi obj Scanner se tu dong bi huy 
		//		(keo theo obj FileReader cung se bi huy theo) nen khong can close() obj nao ca
	}
}

public class Main {
	public static void main(String[] args) {
		// Tao du lieu
		Map<Integer, String> data = new HashMap<Integer, String>();
		createData(data);
		
		// Ghi file 
		System.out.println("==> Test FileWriter");
		TestedFileWriter fileWriter = new TestedFileWriter();
		try {
			System.out.print("+ Cach 1: ");
			fileWriter.writeFile_Cach1(data);
			
			System.out.print("+ Cach 2: ");
			fileWriter.writeFile_Cach2(data);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Doc file 
		System.out.println("\n==> Test FileReader");
		TestedFileReader fileReader = new TestedFileReader();
		try {
			System.out.println("+ Cach 1: ");
			fileReader.readFile_Cach1();
			
			System.out.println("+ Cach 2: ");
			fileReader.readFile_Cach2();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void createData(Map<Integer, String> data) {
		for(int i = 1; i <= 10; i++) {
			data.put(i, "String " + i);
		}
	}
}
