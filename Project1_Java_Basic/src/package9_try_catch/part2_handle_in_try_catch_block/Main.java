package package9_try_catch.part2_handle_in_try_catch_block;

public class Main {
	public static void main(String[] args) {
		System.out.println("==> Tu dong xu ly loi he thong");
		autoHandle();
				
		System.out.println("\n==> Phai throw moi duoc xu ly loi");
		haveToThrow();
	}
	
	private static void autoHandle() {
		try {
			int error = 10/0;
			
		} catch (Exception e) {
			System.out.println("\tException thong bao loi: " + e.getMessage());
		}
	}
	
	private static void haveToThrow() {
		try {
			int mauSo = 0;
			if(mauSo == 0) {
				throw new Exception("Ta thich thi no se la loi");
			}
		
		} catch (Exception e) {
			System.out.println("\tException thong bao loi: " + e.getMessage());
		}
	}
}
