package package1_another_class;

import java.util.ArrayList;

class Player{
	private String name;

	public Player(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

// Cach 1
class Team<T>{
	private ArrayList<T> team = new ArrayList<T>();
	
	public void addMember(T member) {
		team.add(member);
	}
	
	public void get() {
		for(T member : team) {
			System.out.println(((Player) member).getName());
		}
	}
}
//> Trong ham get() ta phai ep kieu cho member do T la moi kieu nen 
//		muon su dung ham getName() thi phai ep kieu
// > Tuy nhien neu ta them 1 kieu khong phai Player thi se bi sai
//		khi ep kieu nen cach nay khong nen su dung
// > Thay vao do ta nen su dung cach 2

// Cach 2
class Group<T extends Player>{
	private ArrayList<T> group = new ArrayList<T>();

	public void addMember(T member) {
		group.add(member);
	}
	
	public void get() {
		for(T member : group) {
			System.out.println(member.getName());
		}
	}
}
// > Khi cho ke thua T extends Player thi T chi co the la kieu Player hoac
//		cac kieu co lien quan den Player nhu cac class ke thua Player, ... 
//		thoi nen se khong can phai ep kieu ma van su dung duoc getName()

public class Main {
	public static void main(String[] args) {
		Team<Object> team = new Team<>();
		team.addMember(new Player("Donald Trump"));
		team.addMember(new String("ABC")); 
		// > Ngay lap tuc bi sai vi day la String, khong phai Player nen  
		//		khong ep kieu Player duoc
		team.get();
		
		Group<Player> group = new Group<>();
		group.addMember(new Player("Donald Trump"));
		group.addMember(new Player("Putin"));
		group.get();
	}
}
