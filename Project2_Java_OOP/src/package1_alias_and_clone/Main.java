package package1_alias_and_clone;

class ForDeepCopy {
	private String test = "";
	
	public ForDeepCopy(String test) {
		super();
		this.test = test;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}

class ForShallowCopy implements Cloneable {
	private String test = "";
	
	public ForShallowCopy(String test) {
		super();
		this.test = test;
	}

	public String getTest() {
		return test;
	}
	
	public void setTest(String test) {
		this.test = test;
	}
	
	protected ForShallowCopy copy() throws CloneNotSupportedException {
		return (ForShallowCopy) this.clone();
	}
}
// > Class muon clone duoc phai ke thua interface Cloneable nhung khong duoc override ham clone()

public class Main {
	public static void main(String[] args) {
		System.out.println("==> Test co che DeepCopy");
		testDeepCopy();
		
		System.out.println("\n==> Test co che ShallowCopy");
		testShallowCopy();
	}

	private static void testDeepCopy() {
		// Tao 1 obj ForDeepCopy
		ForDeepCopy deepCopy1 = new ForDeepCopy("ForDeepCopy");
		// Tao 1 obj khac va gan cho obj da tao
		ForDeepCopy deepCopy2 = deepCopy1;
		
		System.out.println("deepCopy1.getTest() ban dau: " + deepCopy1.getTest());
		System.out.println("deepCopy2.getTest() ban dau: " + deepCopy2.getTest());
		deepCopy2.setTest("deepCopy2 sua nhung deepCopy1 cung bi anh huong");
		System.out.println("deepCopy1.getTest() sau khi deepCopy2 sua test: " + deepCopy1.getTest());
		System.out.println("deepCopy2.getTest() sau khi deepCopy2 sua test: " + deepCopy2.getTest());
	}

	private static void testShallowCopy() {
		// Tao 1 obj ShallowCopy
		ForShallowCopy shallowCopy1 = new ForShallowCopy("ForShallowCopy");
		// Tao 1 obj khac va gan cho obj da tao
		ForShallowCopy shallowCopy2 = null ;
		try {
			shallowCopy2 = shallowCopy1.copy();
		
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("shallowCopy1.getTest() ban dau: " + shallowCopy1.getTest());
		System.out.println("shallowCopy2.getTest() ban dau: " + shallowCopy2.getTest());
		shallowCopy2.setTest("shallowCopy2 sua nhung shallowCopy1 khong bi anh huong");
		System.out.println("shallowCopy1.getTest() sau khi shallowCopy2 sua test: " + shallowCopy1.getTest());
		System.out.println("shallowCopy2.getTest() sau khi shallowCopy2 sua test: " + shallowCopy2.getTest());
	}
}
