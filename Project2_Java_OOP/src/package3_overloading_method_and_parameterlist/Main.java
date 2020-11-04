package package3_overloading_method_and_parameterlist;

class OverloadingMethod {
	public void test(String varString) {
		System.out.println("\tString: " + varString);
	}
	
	public void test(int varInt, String varString) {
		System.out.println("\tint: " + varInt + "\n\tString: " + varString);
	}
}

class ParameterList {
	public void test(String ...arrString) {
		for(String item : arrString) {
			System.out.print(item + "\t");
		}
	}
	
	public void test(Integer ...arrInt) {
		int sum = 0;
		
		for(int i = 0; i < arrInt.length; i++) {
			sum++;
		}
		System.out.println("Sum = " + sum);
	}
	
	public void test(Object ...arrObject) {
		for(Object obj : arrObject) {
			System.out.print(obj + "\t");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println("==> Test OverloadingMethod binh thuong");
		testDefaultOverloadingMethod();
		
		System.out.println("\n==> TestOverloadingMethod voi ParamterList");
		testParameterList();
	}

	private static void testDefaultOverloadingMethod() {
		OverloadingMethod method = new OverloadingMethod();
		System.out.println("+ test(String): ");
		method.test("Hello");
		
		System.out.println("+ test(int, String): ");
		method.test(123, "Goodbye");
	}
	
	private static void testParameterList() {
		ParameterList parameterList = new ParameterList();
		System.out.print("+ test(Integer...): ");
		parameterList.test(1, 2, 3, 4, 5);
		
		System.out.print("+ String(String...): ");
		parameterList.test("A", "B", "C");
		
		System.out.print("\n+ String(Object...): ");
		parameterList.test("A", "B", "C", true, 1, 10.0, false);
	}
}
