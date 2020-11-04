package package4.inner_interface;

class Outer {
	private String stringOuter = "String of class Outer";
	
	public interface IInner {
		void getString(String str);
	}
}

public class Main {
	public static void main(String[] args) {
		class Test implements Outer.IInner {
			@Override
			public void getString(String str) {
				System.out.println("String is: " + str);
			}
		}
		
		Test test = new Test();
		test.getString("ABC");
	}
}
