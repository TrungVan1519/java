package package1_datatype.part3_datatype_converting;

import java.util.ArrayList;

public class ConvertArrayListToArray {
	public static void main(String[] args) {
		ArrayList<String> stringArrList = new ArrayList<String>();
		stringArrList.add("Dau");
		stringArrList.add("Xanh");
		stringArrList.add("Rau");
		stringArrList.add("Muong");
		
		// Su dung toArray() co doi so chinh la mang muon convert sang
		String[] stringArr2 = new String[stringArrList.size()];
		stringArrList.toArray(stringArr2);
		iterateArray(stringArr2);
	}
	
	private static void iterateArray(String[] stringArr) {
		for(var s : stringArr) {
			System.out.println(s);
		}
	}
}
