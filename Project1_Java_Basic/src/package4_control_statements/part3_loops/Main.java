package package4_control_statements.part3_loops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		checkForLoop();
		
		checkWhileLoop();
		
		checkDoWhileLoop();
	}
	
	private static void checkForLoop() {
		System.out.println("checkForLoop():");
		int[] intArr = new int[] {1, 2, 3};
		
		// Su dung theo for
		for(int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}
		
		// Su dung theo foreach
		for (int i : intArr) {
			System.out.println(i);
		}
	}

	private static void checkWhileLoop() {
		System.out.println("\ncheckWhileLoop");
		int[] intArr = {1, 2, 3};
		
		int limit = intArr.length;
		while(limit > 0) {
			System.out.println(intArr[--limit]);
		}
	}

	private static void checkDoWhileLoop() {
		System.out.println("\ncheckDoWhileLoop():");
		int[] intArr = {1, 2, 3};
		
		int limit = intArr.length - 1;
		System.out.println(limit);
		do {
			System.out.println(intArr[limit--]);
		} while (limit > 0);
	}

}
