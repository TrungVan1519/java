package package3_exercise.part2_serializable_file;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramDocGhiFileSerializer {
	static ArrayList<DanhBa> list = new ArrayList<DanhBa>();
	static String path = "C:\\Users\\Admin\\Desktop\\btSerializerFile.txt";
	
	public static void menu() {
		System.out.println("\nMenu");
		System.out.println("1. Nhap");
		System.out.println("2. Xuat");
		System.out.println("3. Luu");
		System.out.println("4. Mo");
		System.out.println("5. Thoat");
		System.out.println("Vui long chon:");
		int option = new Scanner(System.in).nextInt();
		
		switch(option) {
		case 1:
			nhap();
			break;
		case 2:
			xuat();
			break;
		case 3:
			luu();
			break;
		case 4:
			mo();
			break;
		case 5:
			System.out.println("Ket thuc chuong trinh");
			System.exit(0);
		}
	}
	
	private static void mo() {
		list = DocGhiFileSerializer.docFile(path);
		xuat();
	}

	private static void luu() {
		if(DocGhiFileSerializer.ghiFile(list, path))
			System.out.println("Done");
		else
			System.out.println("Error");
	}

	private static void xuat() {
		System.out.println("Ten\tSDT");
		for(var item : list) {
			System.out.println(item.getName()+"\t"+item.getPhoneNumber());
		}
	}

	private static void nhap() {
		System.out.println("Nhap ho ten:");
		String name = new Scanner(System.in).nextLine();
		System.out.println("Nhap SDT:");
		int phoneNumber = new Scanner(System.in).nextInt();
		
		DanhBa db = new DanhBa(name, phoneNumber);
		list.add(db);
	}

	public static void main(String[] args) {
		do {
			menu();
		}while(true);
	}
}
