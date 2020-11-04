package package9_try_catch.part1_throw_to_others;

public class Main {
	public static void main(String[] args) {
		System.out.println("==> Su dung try-catch");
		try {
			useTryCatch(10, 0);
			
		} catch (Exception e) {
			System.out.println("Exception thong bao loi: " + e.getMessage());
		}
		
		System.out.println("\n==> Khong can su dung try-catch");
		try {
			notUseTryCatch(10, 0);
			
		} catch (Exception e) {
			System.out.println("Exception thong bao loi: " + e.getMessage());
		}
	}

	private static void useTryCatch(int tuSo, int mauSo) throws Exception{
		try {
			System.out.println("It should be error: " + (tuSo / mauSo));
			
		} catch (Exception e) {
			throw e;
		}
	}

	private static void notUseTryCatch(int tuSo, int mauSo) throws Exception{
		if(mauSo == 0) {
			throw new Exception("Khong duoc chia cho 0");
		}
	}
}
