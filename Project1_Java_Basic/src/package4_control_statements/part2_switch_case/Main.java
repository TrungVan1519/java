package package4_control_statements.part2_switch_case;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		checkSwitchCase();
		
		checkDoWhileSwitchCase();
	}

	private static void checkSwitchCase() {
		System.out.println("checkSwitchCase():");
		System.out.println("Lua chon:");
		int option = Integer.parseInt(new Scanner(System.in).nextLine());
		
		switch(option) {
		case 1: System.out.println("Choose case 1"); break;
		case 2: System.out.println("Choose case 2"); break;
		default: System.out.println("Not choose case 1 or case 2"); break;
		}
	}

	private static void checkDoWhileSwitchCase() {
		System.out.println("checkDoWhileSwitchCase():");
		do {
			System.out.println("Lua chon:");
			char option = new Scanner(System.in).nextLine().charAt(0);
			
			switch(option) {
			case 'a': System.out.println("Choose case 'a'"); break;
			case 'b': System.out.println("Choose case 'b'"); break;
			default: System.out.println("Not choose case 'a' or case 'b'"); break;
			}
		} while (true);
		// > Vi Java khong co lenh goto nen muon lap trong switch case thi phai su dung do-while();
	}
}
