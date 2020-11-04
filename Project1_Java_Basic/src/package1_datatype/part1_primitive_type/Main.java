package package1_datatype.part1_primitive_type;

public class Main {
	public static void main(String[] args) {
		//// 1. byte, short, int, long
		// byte has a width of 8
		byte byteMin = -128;
		byte byteVar = (byte) (byteMin/2);

		// short has a width of 16
		short shortMax = 32767;
		short shortVar = (short) (shortMax/2);

		// int has a width of 32
		int intMax = 2_147_483_647;
		int intMin = -2_147_483_648;
		
		// long has a width of 64
		long longMax = 9_223_372_036_854_775_807L;
		long longMin = -9_223_372_036_854_775_808L; 
		// => Tong ket:
		//	> Kieu int la kieu mac dinh cho so nguyen
		//	> Kieu long khai bao phai co hau to 'L'
		//	> Kieu byte, short khi su dung toan tu se tu dong ep ve thanh kieu int
		//		nen muon su dung dung kieu thi phai ep ve lai byte, short
		
		//// 2. float, double
		float floatVar1 = 5.4f;
		float floatVar2 = 5F;
		
		double doubleVar1 = 5.4;
		double doubleVar2 = 5d;
		// => Tong ket:
		//	> Kieu double la kieu mac dinh cho so thuc
		//	> Khai bao kieu double khong can hau to 'd' khi co '.' (5.4) va co 'd' 
		//		khi khong su dung '.' (5d)
		//	> Khai bao kieu float thi can hau to 'f' hoac 'F'
		
		//// 3. char
		char charVar1 = '0'; 		// char binh thuong
		char charVar2 = '\u00A9';	// char UNICODE
		
		//// 4. boolean
		boolean booleanVar1 = false;
		boolean booleanVar2 = 0 == 1;
		System.out.println("true or false? " + booleanVar2); 
		// => Tong ket:
		//	> Kieu boolean ngoai gan true, false thi con co the gan 1 bieu thuc so sanh,
		//		logic, ...
	}
}
