package package8_autoboxing_and_unboxing;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		int varInt = 0;
		System.out.println("==> Test boxing va unboxing");
		ArrayList<Double> listDouble = new ArrayList<Double>();
		for(double i = 0; i < 10.0; i += 0.5) {
			Double varDouble = Double.valueOf(i);
			// > AutoBoxing: Su dung Double.valueOf(varDouble): Chuyen double thanh Double
			listDouble.add(varDouble);
		}
		for(Double item : listDouble) {
			double varDouble = item.doubleValue();
			// > Unboxing: Su dung varDouble.doubleValue(): Chuyen Double thanh double
			System.out.print(varDouble + "\t");
		}
		
		System.out.println("\n\n==> Test boxing va unboxing cho viec truyen bien");
		Integer convertedInt = Integer.valueOf(varInt);				
		// > AutoBoxing: Su dung Integer.valueOf(varInt): Chuyen int thanh Integer
		System.out.println("varInt truoc testBoxing(): " + varInt);
		testBoxing(convertedInt);
		varInt = convertedInt.intValue();							
		// > Unboxing: Su dung varInteger.intValue(): Chuyen Integer thanh int
		System.out.println("varInt sau testBoxing(): " + varInt);
		// ==> Boxing va unboxing cung khong co tac dung cho viec truyen tham chieu kieu
		//		primitive
	}
	
	private static void testBoxing(Integer objInt) {
		objInt = 1000;
		System.out.println("varInt trong testBoxing(): " + objInt);
	}
}
