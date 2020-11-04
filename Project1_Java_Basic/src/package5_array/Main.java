package package5_array;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//// Cach khai bao mang
		int[] intArr1 = new int[5];
		int[] intArr2 = new int[intArr1.length];
		int[] intArr3 = new int[] {1, 2, 3};
		int[] intArr4 = {4, 5, 6};
		
		//// Duyet mang
		System.out.println("==> Iterate intArr2");
		iterateArray(intArr3);
		System.out.println("==> Iterate intArr3");
		iterateArray(intArr4);
		
		//// Sua mang
		// Cach 1: Sua cung ham voi khai bao mang
		System.out.println("==> Updated intArr2");
		for(int i = 0; i < intArr3.length; i++) {
			intArr3[i] = 0;
		}
		iterateArray(intArr3);
		// Cach 2: Sua khac ham voi khai bao mang (truyen di cho ham khac)
		System.out.println("==> Updated intArr3");
		updateArray(intArr4);
		iterateArray(intArr4);
		
		//// Sap xep mang
		System.out.println("==> Sorted intArr5");
		int[] intArr5 = {1, 4, 2, 3};
//		Arrays.sort(intArr5);
		Arrays.parallelSort(intArr5, 0, intArr5.length);
		// > 2 ham sort nay cua Arrays la giong nhau
		iterateArray(intArr5);
	}
	
	private static void iterateArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	private static void updateArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		// > Neu muon sua mang bang cach truyen di cho ham khac ta phai lam nhu tren
		//		(Sua tung phan tu cho mang)
		
		int[] newArray = {1000, 1000, 1000};
		array = newArray;
		// > Neu nhu su dung cach nay thi la SAI hoan toan vi khi thoat ham nay
		//		newArray se bi GC huy lam mat du lieu nen mang se khong bi thay doi
		// > Khi chay ket qua cac elements trong intArr3 se bi update = 0 ma khong
		//		phai 1000 vi mang newArray se bi huy nen intArr3 se khong update theo
		//		kieu nay
	}
}
