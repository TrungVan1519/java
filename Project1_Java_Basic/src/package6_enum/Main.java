package package6_enum;

enum XepLoai {
	GIOI,
	TRUNGBINH,
	YEU
}
class UseDefaultEnum {
	private XepLoai loai;

	public XepLoai getXepLoai(int diem) {
		if(diem >= 8) 				   loai = XepLoai.GIOI;
		else if(diem < 8 && diem >= 5) loai = XepLoai.TRUNGBINH;
		else if(diem < 5 && diem >= 0) loai = XepLoai.YEU;
		return loai;
	}
}

// --------------------------------------------------------------------
enum Rank {
	RANK1 ("Hard"),
	RANK2 ("Normal"),
	RANK3 ("Easy");
	
	private String description;
	private Rank(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
}
class UseEnumWithDescription {
	private Rank rank;
	
	public String getDecription(int option) {
		if(option == 1) 		rank = Rank.RANK1;
		else if(option == 2)	rank = Rank.RANK2;
		else if(option == 3)	rank = Rank.RANK3;
		return rank.getDescription();
	}
}
// --------------------------------------------------------------------

public class Main {
	public static void main(String[] args) {
		System.out.print("==> Enum mac dinh: ");
		testDefaultEnum();
		
		System.out.print("\n==> Enum co mo ta: ");
		testEnumWithDescription();
	}

	private static void testDefaultEnum() {
		UseDefaultEnum defaultEnum = new UseDefaultEnum();
		System.out.println(defaultEnum.getXepLoai(8));
	}

	private static void testEnumWithDescription() {
		UseEnumWithDescription enumWithDescription = new UseEnumWithDescription();
		System.out.println(enumWithDescription.getDecription(1));
	}
}
