package package2_composition;

class Armor {
	private int strength;

	public Armor(int strength) {
		super();
		this.strength = strength;
	}
	
	public int getStrength() {
		return strength;
	}
}

class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

class IronMan {
	Armor armor = null;
	Person man = null;
	// > Day la co che composition
	// > Gom nhieu obj vao trong 1 obj duy nhat, no giup ta khong phai 
	//		ke thua nhieu class ma van co cac thuoc tinh va ham can thiet
	
	public IronMan(int strength, String name) {
		super();
		this.armor = new Armor(strength);
		this.man = new Person(name);
	}
	
	public void getInfo() {
		System.out.println(man.getName() + "'armor has " 
								+ armor.getStrength());
	}
}

public class Main {
	public static void main(String[] args) {
		IronMan ironMan = new IronMan(1000, "Tony Stark");
		ironMan.getInfo();
	}
}
