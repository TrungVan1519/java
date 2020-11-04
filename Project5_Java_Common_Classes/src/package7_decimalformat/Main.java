package package7_decimalformat;

import java.text.DecimalFormat;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		double varDouble = new Random().nextDouble();
		System.out.println("So ban dau: " + varDouble);
		
		DecimalFormat decimalFormater = new DecimalFormat();
		decimalFormater.applyPattern("#.##");
		System.out.println("Truoc khi su dung DecimalFormat: " + varDouble);
		System.out.println("Sau khi su dung DecimalFormat: " + decimalFormater.format(varDouble));
	}
}
