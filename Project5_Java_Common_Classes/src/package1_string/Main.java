package package1_string;

public class Main {
	public static void main(String[] args) {
		//// Khai bao String
		String strVar1 = "1 String bat ky";
		String strVar2 = new String();
		String strVar3 = new String("1 String bat ky");
		String strVar4 = new String(new char[] {' ', ' ', ' ', 'a', 'b', 'c', 'b', ' ', ' ', ' '});
		
		//// In String
		System.out.println("strVar4 = " + strVar4);
		
		//// Xem do dai String
		System.out.println("\n==> Do dai String strVar4 la: " + strVar4.length());
		
		//// Tim kiem trong String
		search(strVar4, 'b');
		
		//// Lay subString trong String
		cut(strVar4);
		
		//// Chuyen String ve thanh mang char
		toArray(strVar4);
		
		//// Thay the char hoac subString trong String
		replace(strVar4);
		
		//// Xoa khoang trang o 2 dau String
		System.out.println("\n==> Xoa khoang trang 2 dau String");
		System.out.println("strVar4 truoc trim():" + strVar4);
		System.out.println("strVar4 sau trim()  :" + strVar4.trim());
		
		//// Xoa khoang trang o 1 trong 2 dau String, dau con lai giu nguyen
		trim1Side(strVar4);
		
		//// So sanh 2 String vs nhau
		conpare2String(strVar1, strVar3);
		
		//// Cat String thanh mang subString
		splitString(strVar1);
		
		//// Noi 2 String
		System.out.println("\n==> Noi 2 String voi nhau");
		System.out.println("+ Su dung concat():" + strVar1.concat(strVar3));
		System.out.println("+ Su dung toan tu '+': " + strVar1 + strVar3);
	}


	private static void splitString(String str) {
		System.out.println("\n==> Cat String thanh mang subString");
		String[] arrString = str.split("\\s+");
		for(String s : arrString) {
			System.out.println(s + "\t");
		}
	}


	private static void conpare2String(String str1, String str2) {
		System.out.println("\n==> So sanh 2 String voi nhau");
		System.out.println("+ Su dung conpareTo(): " + str1.compareTo(str2));
		System.out.println("+ Su dung contentEquals(): " + str1.contentEquals(str2));
		System.out.println("+ Su dung equals(): " + str1.equals(str2));
	}
	
	private static void trim1Side(String str) {
		System.out.println("\n==> trim 1 ben");
		System.out.print("- Ben trai:");
		int countLeft = -1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				countLeft = i;
			}
			else {
				System.out.println(str.substring(countLeft + 1));
				break;
			}
		}
		
		System.out.print("- Ben phai:");
		int countRight = -1;
		for(int i = str.length() - 1; i >= 0; i--) {
			if(str.charAt(i) == ' ') {
				countRight = i;
			}
			else {
				System.out.println(str.substring(0, countRight));
				break;
			}
		}
	}

	private static void replace(String str) {
		System.out.println("\n==> Thay the char hoac subString trong String");
		// Thay the toan bo char
		String s1 = str.replace('b', '~');
		System.out.println("Thay the toan bo ky tu: " + s1);
		// > Thay doi tat ca cac char 'b' co trong str luon
		
		// Thay the toan bo subString
		String s2 = str.replace("a~", "ab");
		System.out.println("Thay the toan bo subString: " + s2);
		// > Thay doi tat ca cac subString "a~" trong str luon
		
		// Thay the 1 char dau tien
		String s3 = str.replaceFirst("b", "!");
		System.out.println("Thay the 1 subString dau tien: " + s3);
	}

	private static void toArray(String str) {
		System.out.println("\n==> Chuyen String thanh mang char");
		char[] arrChar = str.toCharArray();
		for(char c : arrChar) {
			System.out.print(c + "\t");
		}
	}

	private static void cut(String str) {
		System.out.println("\n==> Lay subString tu String");
		System.out.println("substring() 1 doi so: " + str.substring(1));
		// > Tra ve subString bat dau tu vi tri char thu 1 cho den het String
		
		System.out.println("substring() 2 doi so: " + str.substring(1, 3));
		// > Tra ve subString bat dau tu vi tri char thu 1 va dai
		//		3 - 1 = 2 char
	}

	private static void search(String str, char c) {
		System.out.println("\n==> Tim kiem trong String");
		boolean isExist = str.contains(Character.toString(c));
		System.out.println("'b' co ton tai trong strVar4 khong? " + isExist);
		
		int posIndexOf = str.indexOf(c);
		System.out.println("Vi tri dau tien cua 'b' trong strVar4 la: " + posIndexOf);
		
		int posLastIndexOf = str.lastIndexOf(c);
		System.out.println("Vi tri cuoi cung cua 'b' trong strVar4 la:" + posLastIndexOf);
	}
}
