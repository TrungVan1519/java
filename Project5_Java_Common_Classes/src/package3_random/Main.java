package package3_random;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rd = new Random();
		
		System.out.println("So duong bat ky tu 0 den 10 la: " + rd.nextInt(11));
		System.out.println("So am bat ky tu -10 den 0 la: " + (-1 * rd.nextInt(11)));
		System.out.println("So am bat ky tu -10 den 10 la: " + (-10 + rd.nextInt(21)));
		System.out.println("So am bat ky tu -10 den 5 la: " + (-10 + rd.nextInt(16)));
		// > Tra ve so ngau nhien tu 0 den (n - 1)
		// > Muon hon thi phai su dung *, /, +, -
		
		System.out.println("So thuc bat ky tu 0.0 den 1.0 la: " + rd.nextDouble());
		// > Chi tra ve so trong doan 0.0 den 1.0
		// > Muon hon thi phai su dung *, /, +, -
	}
}
