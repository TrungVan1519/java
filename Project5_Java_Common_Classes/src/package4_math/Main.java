package package4_math;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("So PI: " + Math.PI);
		
		System.out.println("So nho nhat tu 0 den 10: " + Math.min(0, 10));
		System.out.println("So lon nhat tu 0 den 10: " + Math.max(0, 10));
		
		System.out.println("Can bac 2 cua 25: " + Math.sqrt(25));
		System.out.println("Can bac 3 cua 8: " + Math.cbrt(8));
		
		System.out.println("Nhap goc (deg): ");
		double angleByDeg = new Scanner(System.in).nextDouble();
		double angleByRadian = angleByDeg * Math.PI / 180;
		// > Vi sin(), cos(), tan() trong Math su dung goc voi don vi angleByRadian nen phai doi
		System.out.println("sin("+ angleByDeg + ") la: "+ Math.sin(angleByRadian));
		System.out.println("cos("+ angleByDeg + ") la: "+ Math.cos(angleByRadian));
		System.out.println("tan("+ angleByDeg + ") la: "+ Math.tan(angleByRadian));
		System.out.println("cot("+ angleByDeg + ") la: "+ 1 / Math.tan(angleByRadian));
	
		System.out.println("random:" + Math.random());
		// > Chi co moi ham Math.random() khong co doi so truyen vao, tra ve kieu Double
	}
}
