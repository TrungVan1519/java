package package8_decimalformatsymbols;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		System.out.println("==> Format int");
		formatInt();
		
		System.out.println("\n==> Format double");
		formatDouble();
	}

	private static void formatInt() {
		int varInt = Integer.MAX_VALUE;
		System.out.println("varInt ban dau: " + varInt);
		
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.getDefault());
		
		// Cach 1: Su dung ky tu mac dinh cua DecimalFormatSymbols
		DecimalFormat decimalFormater1 = new DecimalFormat();
		decimalFormater1.setDecimalFormatSymbols(decimalFormatSymbols);
		System.out.println("Kieu 1: varDouble su dung ky tu mac dinh cua DecimalFormatSymbols: "
							+ decimalFormater1.format(varInt));
		
		// Cach 2: Su dung ky tu ta su dung cho DecimalFormatSymbols
		decimalFormatSymbols.setGroupingSeparator('~');
		// > Voi kieu int phai su dung setGroupingSeparator() khi setup cho decimalFormatSymbols
		DecimalFormat decimalFormater2 = new DecimalFormat();
		decimalFormater2.setDecimalFormatSymbols(decimalFormatSymbols);
		System.out.println("Kieu 2: varDouble su dung ky tu ta su dung cho DecimalFormatSymbols: "
							+ decimalFormater2.format(varInt));
	}

	private static void formatDouble() {
		double varDouble = new Random().nextDouble();
		System.out.println("varDouble ban dau: " + varDouble);
		
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
		
		// Cach 1: Su dung ky tu mac dinh cua DecimalFormatSymbols
		DecimalFormat decimalFormater1 = new DecimalFormat();
		decimalFormater1.setDecimalFormatSymbols(decimalFormatSymbols);
		System.out.println("Kieu 1: varDouble su dung ky tu mac dinh cua DecimalFormatSymbols: "
							+ decimalFormater1.format(varDouble));
		
		// Cach 2: Su dung ky tu ta su dung cho DecimalFormatSymbols
		decimalFormatSymbols.setDecimalSeparator('#');
		// > Voi kieu double thi phai su dung setDecimalSeparator() khi setup cho decimalFormatSymbols
		DecimalFormat decimalFormater2 = new DecimalFormat();
		decimalFormater2.setDecimalFormatSymbols(decimalFormatSymbols);
		System.out.println("Kieu 2: varDouble su dung ky tu ta su dung cho DecimalFormatSymbols: "
							+ decimalFormater2.format(varDouble));
	}
}
