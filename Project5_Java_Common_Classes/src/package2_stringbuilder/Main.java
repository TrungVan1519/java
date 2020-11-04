package package2_stringbuilder;

public class Main {
	public static void main(String[] args) {
		//// Khoi tao obj StringBuilder
		StringBuilder varString1 = new StringBuilder();
		StringBuilder varString2 = new StringBuilder("ABC");
		
		//// Noi String 
		varString1.append(varString2);
		System.out.println("==> Noi String:" + varString1);
		
		//// Chen vao String
		varString1.insert(0, '!');
		varString1.insert(0, "~~");
		System.out.println("\n==> Chen vao String: " + varString1);
		
		
		//// Xoa subString trong String
		varString1.delete(0, 3);
		System.out.println("\n==> Xoa subString trong String:" + varString1);
		// > Xoa tu vi tri 0 va xoa 1 subString dai 3 char
		
		//// Dao nguoc String
		System.out.println("\n==> Dao nguoc String:" + varString1.reverse());
	}
}
