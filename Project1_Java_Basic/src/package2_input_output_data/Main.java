package package2_input_output_data;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nhap 1 String:");
		String stringVar = s.nextLine();
		// > Dung de nhap String
		
		System.out.println("Nhap 1 char:");
		char charVar = s.nextLine().charAt(0);
		
		System.out.println("Nhap 1 int:");
		int intVar = Integer.parseInt(s.nextLine());
		Integer integerVar = Integer.parseInt(s.nextLine());
		// > Tuong tu voi cac kieu khac
	}
}
