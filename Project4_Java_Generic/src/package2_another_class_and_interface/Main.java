package package2_another_class_and_interface;

interface ITesting{
}

class Testing{
}

class Generic1<T extends ITesting>{
} // > Khi T ke thua inteface thi cung su dung "extends" thay cho "implements"

class Generic2<T extends Testing & ITesting>{
} // > Khi T ke thua class, inteface cung luc thi su dung "extends" va '&'

public class Main {
	public static void main(String[] args) {
		
	}
}
