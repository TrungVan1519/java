package package4_hashset; 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main_Basic_Set {
	public static void main(String[] args) {
		Set<Integer> setInt = new HashSet<Integer>();
		for (int i = 1; i <= 10; i++) {
			setInt.add(i);
		}
		
		// Truy van cach 1:
		for (Integer integer : setInt) {
			System.out.println(integer);
		}
		
		// Truy van cach 2:
		Iterator<Integer> iterator = setInt.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println(setInt.contains(1));
	}
}
