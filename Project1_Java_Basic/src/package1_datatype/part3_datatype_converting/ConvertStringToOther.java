package package1_datatype.part3_datatype_converting;

public class ConvertStringToOther {
	public static void main(String[] args) {
		String stringVar = "123";
		
		int intVar = Integer.parseInt(stringVar);
		Integer integerVar = Integer.parseInt(stringVar);
		System.out.println(intVar + integerVar);
		// > Chuyen String ve thanh kieu int
		// > Tuong tu voi cac kieu khac
	}
}
