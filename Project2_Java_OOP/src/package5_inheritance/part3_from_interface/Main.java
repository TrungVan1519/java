package package5_inheritance.part3_from_interface;

interface IDescription {
	void showType();
}

class Shape {
	private String type;
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}

class Circle extends Shape implements IDescription {
	@Override
	public void showType() {
		System.out.println("Type of this is: " + this.getType());
	}
}

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setType("Circle");
		circle.showType();
		// > Qua trinh chay:
		//		+ Class Circle extends class Shape de co prop String type
		//		+ Class Circle implements inteface IDescription de override
		//			ham showType() in ra String type da ke thua trong Shape
	}
	// => Tong ket:
	//	> Cac ham trong interface mac dinh dung de override nen se tu dong
	//		khong co than ham (nhu abstract method cua abstract class) va 
	//		modifier access la public (nen khong phai ghi modifier access)
}
