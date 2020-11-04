package package3_operator;

public class Main {
	public static void main(String[] args) {
		//// 1. Toan tu: +, -, *, /, ==, !=, ...
		//// 2. Toan tu: &&, ||, !, ...
		//// 3. Toan tu 3 ngoi
		checkOperator1();
		
		//// 4. Toan tu instanceof
		checkOperator2();
	}

	private static void checkOperator1() {
		int score = 10;
		String result = score > 4 ? "Pass" : "Fail";
		System.out.println(result);
		// > Chuc nang tuong tu if-else
	}
	
	private static void checkOperator2() {
		Integer integerVar = 0;
		System.out.println(integerVar instanceof Integer);
		// > Dung de kiem tra 1 object co kieu gi
	}
}
