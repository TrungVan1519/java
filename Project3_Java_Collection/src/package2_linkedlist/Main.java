package package2_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) {
		//// Them, sua, xoa cac phan tu voi LinkedList deu giong ArrayList
		LinkedList<String> cities = new LinkedList<String>();
		addToLinkedList(cities);
		
		//// Co phan truy van thi dac biet 1 chut
		// Cach 1: Su dung vong lap kieu truyen thong
		selectFromLinkedList1(cities);
		System.out.println();
		// Cach 2: Su dung inteface Iterator
		selectFromLinkedList2(cities);
		System.out.println();
		// Cach 3: Su dung inteface ListIterator
		selectFromLinkedList3(cities);
	}

	private static void addToLinkedList(LinkedList<String> cities) {
		cities.add("Lang Son");
		cities.add("Ha Noi");
		cities.add("Da Nang");
		cities.add("Ho Chi Minh");
		cities.add("Ca Mau");
	}

	private static void selectFromLinkedList1(LinkedList<String> cities) {
		System.out.println("==> Su dung for:");
		for(String city : cities) {
			System.out.print(city + "\t");
		}
	}

	private static void selectFromLinkedList2(LinkedList<String> cities) {
		System.out.println("\n==> Su dung Iterator:");
		Iterator<String> iterator = cities.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "\t");
		}
	}

	private static void selectFromLinkedList3(LinkedList<String> cities) {
		System.out.println("\n==> Su dung ListIterator:");
		ListIterator<String> listIterator = cities.listIterator();
		
		System.out.println("+ Duyet theo chieu xuoi:");
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + "\t");
		}
		
		System.out.println("\n+ Duyet theo chieu nguoc:");
		while(listIterator.hasPrevious()) {
			System.out.print(listIterator.previous() + "\t");
		}
		// > Su dung ListIterator thi co the duyet theo 2 chieu: xuoi, nguoc
		//		nhung muon duyet theo chieu nguoc thi truoc do ta phai duyet 
		//		theo chieu xuoi truoc chu neu ban dau duyet theo chieu nguoc
		//		luon thi khong duyet duoc
		// > Khi dang duyet ListIterator theo chieu xuoi listIterator.next() thi muon stop 
		//		tai gia tri dang xet thi phai su dung listIterator.previous(), sau   
		//		do muon duyet nguoc lai thi phai tiep tuc listIterator.previous() tiep. 
		//		listIterator.previous() dau tien khong co tac dung truy van gia
		//		tri truoc gia tri dang xet ngay lap tuc, no chi co tac dung stop 
		//		tai vi tri dang xet va quay nguoc chieu de chuan bi duyet 
		//		ListIterator theo chieu nguoc lai thoi
	}
}
