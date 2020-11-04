package package9_try_catch.part3_create_myexception_classes;

// Tu tao ra class xu ly error cua chinh minh
class MyEx extends Exception{
	public MyEx() {
	}

	public MyEx(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MyEx(String message, Throwable cause) {
		super(message, cause);
	}

	public MyEx(String message) {
		super(message);
	}

	public MyEx(Throwable cause) {
		super(cause);
	}
}

public class Main {
	public static void main(String[] args)  {
		System.out.println("==> Test try - 1 catch");
		try1Catch();
		
		System.out.println("\n==> Test try - nhieu catch");
		tryNhieuCatch();
	}

	private static void try1Catch() {
		System.out.println("+ Kieu 1: Loi do class ta tu tao ra thi phai throw moi duoc xu ly");
		try {
			throw new MyEx("Thich thi cu nem ra loi day :V");
			
		} catch (MyEx e) {
			System.out.println("\tMyEx thong bao loi: " + e.getMessage());
		}
		
		// --------------------------------------------------------------------
		System.out.println("+ Kieu 2: Loi he thong tu dong duoc xu ly");
		try {
			int error = 10/0;
			
		} catch (Exception e) {
			System.out.println("\tException thong bao loi: " + e.getMessage());
		}
		
		// ---------------------------------------------------------------------
		System.out.println("+ Kieu 3: Loi he thong phai throw moi duoc xu ly");
		try {
			int mauSo = 0;
			if(mauSo == 0) {
				throw new Exception("Ta thich thi no se la loi");
			}
		
		} catch (Exception e) {
			System.out.println("\tException thong bao loi: " + e.getMessage());
		}
	}

	private static void tryNhieuCatch() {
		try {
			System.out.println("It gonna be error: " + (10 / 0));
			// Cho chay den catch(MyEx myEx)
			
			throw new MyEx("Test class MyEx do ta tu tao ra");
			
		} catch (MyEx myEx) {
			System.out.println("MyEx thong bao loi: " + myEx.getMessage());
			
		} catch (Exception ex) {
			System.out.println("Exception thong bao loi: " + ex.getMessage());
			
		} finally {
			System.out.println("Co hay khong cung duoc, khong quan trong lam");
		}
		
		System.out.println("Day la thu tu cua 1 cau truc try-catch-finally day du");
	}
	// => Tong ket:
	//	> Voi class xu ly loi do chinh ta tao ra (MyEx) thi ta se phai throw loi 
	//		khi ta muon thi moi duoc xu ly
	//	> Voi class xu ly loi cua he thong (Exception) thi throw cung duoc ma khong
	//		throw cung duoc (luc nay no se tu dong duoc xu ly neu code bi loi)
	//	> Khi chay code trong try loi thi se nhay toi 1 catch chua class xu ly loi
	//		(cua ta hoac cua he thong) tuong ung voi viec ta throw loi gi hoac code 
	//		bi loi gi, khi xu ly xong trong catch se nhay ra ngoai catch do va khong
	//		tiep tuc cac catch khac nua 
	//	> Nhu trong VD tren catch(MyEx myex) se khong bao gio duoc xu ly vi truoc do code
	//		ta da bi loi 10/0 va se tu dong nhay vao catch(Exception ex) roi, sau khi 
	//		xu ly xong trong catch do thi se nhay xuong finally va xong finally thi nhay
	//		ra ngoai => Het
}
