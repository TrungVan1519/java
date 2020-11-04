package package4_hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main_Union_Intersect_In_Set {
	public static void main(String[] args) {
		Integer[] arrInt1 = new Integer[11];
		Integer[] arrInt2 = new Integer[11];
		getData(arrInt1, arrInt2);
		
		System.out.println("==> 1.Hop cua 2 Set (Hop cua 2 tap hop)");
		Set<Integer> union = new HashSet<Integer>();
		union.addAll(Arrays.asList(arrInt1));
		union.addAll(Arrays.asList(arrInt2));
		selectFromSet(new TreeSet<Integer>(union));
		// > Do Set khong them cac phan tu bi trung lap nen su dung addAll()
		//		se mang y nghia hop 2 tap hop
		
		System.out.println("\n\n==> 2.Giao cua 2 Set (Giao cua 2 tap hop)");
		Set<Integer> intersection = new HashSet<Integer>();
		intersection.addAll(Arrays.asList(arrInt1));
		intersection.retainAll(Arrays.asList(arrInt2));
		selectFromSet(new TreeSet<Integer>(intersection));
		// > Su dung ham retainAll() co tac dung chi tra ve cac gia tri bi
		//		trung lap nen se mang y nghia giao cua 2 tap hop
		
		System.out.println("\n\n==> 3.Tru cua 2 Set (Tru cua 2 tap hop)");
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(arrInt1));
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(arrInt2));  
		System.out.println("=> set1 va set2 ban dau:");
		System.out.print("+ set1 ban dau:\t");
		selectFromSet(new TreeSet<Integer>(set1));
		System.out.print("\n+ set2 ban dau:\t");
		selectFromSet(new TreeSet<Integer>(set2));
		
		System.out.print("\n=> set1 - set2:\t");
		set1.removeAll(set2);
		selectFromSet(new TreeSet<Integer>(set1));
		
		set1 = new HashSet<Integer>(Arrays.asList(arrInt1));
		set2 = new HashSet<Integer>(Arrays.asList(arrInt2));  
		System.out.print("\n=> set2 - set1:\t");
		set2.removeAll(set1);
		selectFromSet(new TreeSet<Integer>(set2));
		
		System.out.println("\n\n==> 4.Symmertric difference");
		union.removeAll(intersection);
		selectFromSet(new TreeSet<Integer>(union));
	}
	
	private static void getData(Integer[] arrInt1, Integer[] arrInt2) {
		int i = 0;
		int value = -5;
		while(value <= 5) {
			arrInt1[i++] = value++;
		}
		
		i = 0;
		value = 0;
		while(value <= 10) {
			arrInt2[i++] = value++;
		}
	}

	private static void selectFromSet(Collection<Integer> set) {
		for (Integer integer : set) {
			System.out.print(integer + "\t");
		}
	}
}
