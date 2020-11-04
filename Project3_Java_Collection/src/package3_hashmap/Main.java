package package3_hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	static HashMap<Integer, String> another1, another2;
	
	public static void main(String[] args) {
		//// Khoi tao 1 HashMap moi
		HashMap<Integer, String> languages = new HashMap<Integer, String>();
		
		//// Them phan tu
		addToHashMap(languages);
		for(Map.Entry<Integer, String> entry : languages.entrySet()) {
			System.out.println(entry);
		}
		
		//// Khong co chen phan tu vao vi tri co san trong HashMap
		
		//// Sua phan tu
		updateFromHashMap(languages);
		for(Map.Entry<Integer, String> entry : languages.entrySet()) {
			System.out.println(entry);
		}
		
		//// Tim kiem key, value
		searchForKeyOrValue(languages);
		
		//// Xoa phan tu
		deleteFromHashMap(languages);
		for(Map.Entry<Integer, String> entry : languages.entrySet()) {
			System.out.println(entry);
		}
		
		//// Khoi tao HashMap tu 1 HashMap co san
		createHashMapByExistOne(languages);
		
		//// Truy van HashMap
		selectFromHashMap(languages);
		
		//// Clear HashMap
		System.out.println("\n==> Clear HashMap:");
		languages.clear();
		System.out.println("Size cua HashMap: " + languages.size());
		
		
		//// Chuyen kieu HashMap sang Array
		System.out.println("\n==> Chuyen HashMap sang Array");
		System.out.println("+ Array key");
		Integer[] aInt = new Integer[another1.keySet().size()];
		another1.keySet().toArray(aInt);
		for (Integer integer : aInt) {
			System.out.print(integer + "\t");
		}
		
		System.out.println("\n+ Array value");
		String[] string = new String[another1.values().size()];
		another1.values().toArray(string);
		if(Arrays.binarySearch(string, "String 1") > -1) {
			System.out.println(Arrays.binarySearch(string, "String 1"));
		} else {
			System.out.println("Khong ton tai value \"String 1\" trong array value");
		}
	}

	private static void createHashMapByExistOne(HashMap<Integer, String> languages) {
		another1 = new HashMap<Integer, String>(languages);
		
		another2 = new HashMap<Integer, String>();
		another2.putAll(another2);
	}

	private static void deleteFromHashMap(HashMap<Integer, String> languages) {
		System.out.println("\n==> Xoa phan tu");
		languages.remove(2);
		// > Trong HashMap muon xoa phan tu ta phai xoa theo key vi HashMap
		//		xac dinh cac phan tu thong qua key chu khong qua chi so index
		
		languages.remove(1, "...");
		// > Chi duoc xoa phan tu co key = 1 && value = "..." neu phan tu chi
		//		thoa man 1 trong 2 thi cung khong duoc xoa
	}

	private static void searchForKeyOrValue(HashMap<Integer, String> languages) {
		System.out.println("\n==> Tim kiem");
		System.out.println("+ Key:");
		if(languages.containsKey(1)) {
			System.out.println("Tim thay key = 1");
		} else {
			System.out.println("Khong tim thay key = 1");
		}
		
		System.out.println("+ Value:");
		if(languages.containsValue("Java")) {
			System.out.println("Tim thay value = \"Java\"");
		} else {
			System.out.println("Khong tim thay value = \"Java\"");
		}
	}

	private static void updateFromHashMap(HashMap<Integer, String> languages) {
		System.out.println("\n==> Sua phan tu trong HashMap");
		languages.put(2, "C#");
		// > Su dung put cho 1 phan tu da ton tai trong HashMap thi se tu dong
		//		hieu la update
	}

	private static void addToHashMap(HashMap<Integer, String> languages) {
		System.out.println("\n==> Them phan tu cho HashMap");
		languages.put(1, "Java");
		languages.put(2, "CSharp");
		languages.put(3, "Javascript");
		languages.put(4, "Python");
		// > Su dung put cho 1 phan tu chua ton tai trong HashMap thi se tu dong
		//		hieu la add
	}
	
	private static void selectFromHashMap(HashMap<Integer, String> languages) {
		System.out.println("\n==> Truy van HashMap:");
		System.out.print("+ Danh sach keys:\t");
		//// Duyet danh sach key
		for (Integer key : languages.keySet()) {
			System.out.print(key + "\t");
		}

		//// Duyet danh sach value
		System.out.print("\n+ Danh sach values:\t");
		for (String value : languages.values()) {
			System.out.print(value + "\t");
		}
		
		//// Duyet danh sach key/value
		System.out.println("\n+ Danh sach key/value");
		System.out.println("- Cach 1:");
		// Cach 1:
		for(Integer key : languages.keySet()) {
			System.out.println("Key: " + key + "\tValue: " + languages.get(key));
		}
		System.out.println("- Cach 2:");
		// Cach 2:
		for(Map.Entry<Integer, String> entry : languages.entrySet()) {
			System.out.println(entry
								+ "\n\t" + entry.getKey()
								+ "\t" + entry.getValue());
		}
	}
}
