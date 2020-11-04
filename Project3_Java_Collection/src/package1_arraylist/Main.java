package package1_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	static ArrayList<String> string2;
	static ArrayList<String> string3;
	
	public static void main(String[] args) {
		//// Khoi tao 1 ArrayList moi
		ArrayList<String> string1 = new ArrayList<String>();
		
		//// Them phan tu
		System.out.println("==> Them phan tu cho ArrayList");
		addToArrayList(string1);
		
		//// Chen phan tu vao 1 vi tri co san
		System.out.println("==> Chen phan tu cho ArrayList");
		insertIntoArrayList(string1);
		
		//// Sua phan tu
		System.out.println("==> Sua phan tu trong ArrayList");
		updateFromArrayList(string1);
		
		//// Tim kiem phan tu
		System.out.println("==> Tim kiem phan tu trong ArrayList");
		searchingElement("Updated String", string1);
		
		//// Xoa phan tu
		System.out.println("==> Xoa phan tu trong ArrayList");
		removeFromArrayList(string1);
		
		//// Khoi tao 1 ArrayList tu 1 ArrayList co san
		createArrayListByExistOne(string1);
		
		//// Clear ArrayList
		System.out.print("==> Clear ArrayList:");
		string1.clear();
		System.out.println(" So phan tu trong ArrayList la " + string1.size());
		selectFromArrayList(string1);
		
		//----------------------------------------------------------------//
		//// In ket qua khoi tao 1 ArrayList tu 1 ArrayList co san
		System.out.println("==> string2:");
		selectFromArrayList(string2);
		System.out.println("==> string3:");
		selectFromArrayList(string3);
		
		//// Sap xep ArrayList su dung class Collections, khong can sap xep
		////	kieu thu cong
		sortArrayList();
		
		//// Chuyen kieu ArrayList sang Array
		System.out.println("==> Chuyen ArrayList sang Array");
		String[] stringArr = new String[string2.size()];
		string2.toArray(stringArr);
		for(var s : stringArr) {
			System.out.print(s + "\t");
		}
	}

	private static void createArrayListByExistOne(ArrayList<String> string) {
		// Cach 1: Su dung Constructor co doi so
		string2 = new ArrayList<String>(string);
		
		// Cach 2: Su dung addAll()
		string3 = new ArrayList<String>();
		string3.addAll(string);
		string3.addAll(string2);
	}
	
	private static void sortArrayList() {
		ArrayList<Integer> forSorting = new ArrayList<Integer>();
		for(var s : string3) {
			forSorting.add(Integer.parseInt(s));
		}
		System.out.println("==> Sap xep:");
		System.out.println("+ Theo thu tu tang dan");
		Collections.sort(forSorting);
		for(var i : forSorting) {
			System.out.print(i + "\t");
		}
		
		System.out.println("\n+ Theo thu tu giam dan");
		Collections.reverse(forSorting);
		for(var i : forSorting) {
			System.out.print(i + "\t");
		}
		System.out.println("\n");
	}

	private static void addToArrayList(ArrayList<String> string) {
		for(int i = 0; i < 5; i++) {
			string.add(Integer.toString(i));
		}
		for(int i = 6; i < 10; i++) {
			string.add((new Integer(i)).toString());
		}
		selectFromArrayList(string);
	}
	
	private static void insertIntoArrayList(ArrayList<String> string) {
		string.add(5, "Inserted String");
		selectFromArrayList(string);
	}

	private static void selectFromArrayList(ArrayList<String> string) {
		for (String str : string) {
			System.out.print(str + "\t");
		}
		System.out.println("\n");
	}

	private static void updateFromArrayList(ArrayList<String> string) {
		string.set(5, "Updated String");
		selectFromArrayList(string);
	}


	private static void searchingElement(String string, ArrayList<String> string1) {
		int position = -1;
		
		// Cach 1: Su dung Collections.binarySearch()
		System.out.print("+ Tim kiem su dung Collections.binarySearch(): ");
		position = Collections.binarySearch(string1, string);
		if(position > -1) {
			System.out.println("Tim thay o vi tri " + position + "\n");
		} else {
			System.out.println("Khong tim thay " + string);
		}
		// > Khong co tac dung voi String vi no la kieu Wrapper class
		
		// Cach 2: Su dung arraylistVar.contains()
		System.out.print("+ Time kiem su dung arraylistVar.contains(): ");
		if(string1.contains(string)) {
			position = string1.indexOf(string);
			System.out.println("Tim thay o vi tri " + position + "\n");
		} else {
			System.out.println("Khong tim thay " + string + "\n");
		}
		// > Luon co tac dung vi doi so truyen vao la kieu Object (Wrapper class)
	}
	
	private static void removeFromArrayList(ArrayList<String> string) {
		String removedString = string.remove(5);
		System.out.println("String bi xoa: " + removedString);
		selectFromArrayList(string);
	}
}
