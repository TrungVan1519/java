package package3_exercise.part1_text_file;

import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	static ArrayList<KhachHang> list = new ArrayList<KhachHang>();
	static String path = "C:\\Users\\Admin\\Desktop\\btTextFile.txt";
	
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
		list = DocGhiFile.docFile(path);
		xuat();
	}

	private static void luu() {
		if(DocGhiFile.ghiFile(list, path))
			System.out.println("Done");
		else
			System.out.println("Error");
	}

	private static void xuat() {
		System.out.println("Ma\tTen\tNgay Sinh");
		for(var item : list) {
			System.out.println(item.getMa() + "\t" + 
					item.getTen() + "\t" +
					DateConverter.getStringFromDate(item.getNamSinh()));
		}
	}

	private static void nhap() {
		System.out.println("Nhap ma:");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Nhap ten:");
		String ten = new Scanner(System.in).nextLine();
		System.out.println("Nhap ngay sinh (dd/MM/yyyy):");
		Date ns = DateConverter.getDateFromString(new Scanner(System.in).next());
		
		KhachHang kh = new KhachHang(ma, ten, ns);
		list.add(kh);
	}

	public static void main(String[] args) {
		do {
			menu();

		}while(true);
		
		/* >> Tom tat chuong trinh
		 * > File KhachHang co 3 prop: int ma, String ten, Date namSinh dung de tao data
		 * > File DateConverter chua 2 ham:
		 * 		+ getStringFromDate() chuyen Date ve thanh String:
		 * 			- Option 2: Khi xuat ra console, namSinh co kieu Date nen phai
		 * 				chuyen sang String
		 * 			- Option 3: Khi ghi File thi namSinh cung co kieu Date nen phai
		 *				chuyen sang String truoc khi luu
		 * 		+ getDateFromString() chuyen String sang Date
		 * 			- Option 1: Khi nhap namSinh tu console, ta nhap 1 String nen phai
		 *				chuyen sang Date cho hop kieu namSinh
		 * 			- Option 4: Khi doc tu File thi gia tri tuong ung voi bien namSinh doc
		 *				tu File cung la String nen phai chuyen sang Date cho phu hop
		 */
	}
}
