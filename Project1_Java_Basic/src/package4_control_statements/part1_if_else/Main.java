package package4_control_statements.part1_if_else;

public class Main {
	public static void main(String[] args) {
		checkIf_If_Else();
		
		checkIf_ElseIf_Else();
	}

	private static void checkIf_If_Else() {
		System.out.println("Check if-if-else");
		if(1 < 2) {
			System.out.println("1 < 2");
		}
		if(1 == 2) {
			System.out.println("1 == 2");
		}
		else {
			System.out.println("1 != 2");
		}
		// > 1 if vs 1 else di cung nhau thanh 1 bo nen 
		//		- if dau tien don le, no khong anh huong den bo if-else sau day
		//		nen no co dung sai khong quan trong, bo if-else sau day van xet
		//		binh thuong
	}

	private static void checkIf_ElseIf_Else() {
		System.out.println("Check if-else if-else");
		if(1 < 2) {
			System.out.println("1 < 2");
		}
		else if(1 == 2) {
			System.out.println("1 == 2");
		}
		else {
			System.out.println("1 > 2");
		}
		// > 1 if vs 1 else if vs 1 else di cung nhau thanh 1 bo nen 
		//		- if dung thi else if va else khong thuc hien nua , 
		//			neu if sai thi moi xet den else if
		//		- else if dung thi else khong thuc hien nua, 
		//			neu sai thi moi tu dong thuc hien else
	}
}
