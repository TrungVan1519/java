package package4.inner_class;

class Outer {
	private String stringOuter = "String of class Outer";
	
	public void createInnerObj() {
		System.out.println("stringOuter: " + stringOuter);
		Inner inner = new Inner();
		System.out.println("stringInner: " + inner.stringInner);
	}
	
	public class Inner {
		private String stringInner = "String of class Inner";
	}
}

public class Main {
	public static void main(String[] args) {
		// Tao obj cua class Outer
		Outer outer = new Outer();
		// Tao obj cua class Inner trong class Outer
		Outer.Inner inner = outer.new Inner();
		
		outer.createInnerObj();
	}
	// => Tong ket:
	//	> Khi su dung class Inner thi cung chi su dung duoc trong chinh 
	//		class Outer va no cung cap 1 so gi do can thiet cho class Outer
	//	> Con muon khoi tao cho rieng moi obj class Inner de su dung thi 
	//		ho se khong ranh de tao 1 class Outer chua ben ngoai
}
