package package7_passing_variables;

class Player{
	private String name;
	
	public Player(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Main {
	public static void main(String[] args) {
		int varInt = 0;
		System.out.println("==> Truyen bien primitive");
		System.out.println("varInt truoc goi ham passedByValue():" + varInt);
		passedByValue(varInt);
		System.out.println("varInt sau goi ham passedByValue():" + varInt);
		System.out.println();
		// > Voi kieu int (va kieu primitive noi chung) thi truyen cho ham khac se khong
		//		anh huong toi no o ham main
		
		//-----------------------------------------------------------------------------------
		System.out.println("\n==> Truyen bien non-primitive");
		Player pVar = new Player("ABC");
		System.out.println("pVar truoc goi ham passedByReference1():" + pVar.getName());
		passedByReference1(pVar);
		System.out.println("pVar sau khi goi ham passedByReference1():" + pVar.getName());
		System.out.println();
		System.out.println("pVar truoc goi ham passedByReference2():" + pVar.getName());
		passedByReference2(pVar);
		System.out.println("pVar sau khi goi ham passedByReference2():" + pVar.getName());
		// > Voi kieu non-primitive thi truyen cho ham khac thi cung se anh huong toi chinh 
		//		no o ham main
	}
	
	private static void passedByValue(int varInt) {
		varInt = 1000;
		System.out.println("varInt trong ham passedByValue():" + varInt);
	}
	
	private static void passedByReference1(Player pVar) {
		pVar = new Player("XYZ");
		// > Voi kieu non-primitive thi khi gan cho 1 bien khac thi cung se khong anh huong gi 
		//		giong nhu truyen kieu primitive
		System.out.println("pVar trong ham passedByReference1():" + pVar.getName());
	}

	private static void passedByReference2(Player pVar) {
		pVar.setName("MNPQ");
		System.out.println("pVar trong ham passedByReference2():" + pVar.getName());
	}
}
