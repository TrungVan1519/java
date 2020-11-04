package package4_hashset;

import java.util.HashSet;
import java.util.Set;

class Animal{
	protected String name;
	
	public Animal(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Ten: " + this.name;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + 1519;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (obj instanceof Animal) {
			Animal other = (Animal) obj;
			if(this.name == null || other.name == null) {
				return false;
			}
			return this.name.contentEquals(other.name);
		}
		return false;
	}
}
class Dog extends Animal{
	public Dog(String name) {
		super(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (obj instanceof Dog) {
			Dog other = (Dog) obj;
			if(this.name == null || other.name == null) {
				return false;
			}
			return this.name.contentEquals(other.name);
		}
		return false;
	}
}

public class Main_Override_equals_And_hashCode_In_Inheritance {
	public static void main(String[] args) {
		// Trong da hinh ta co nhu sau:
		//	+ Animal = new Animal
		//	+ Animal = new Dog
		// Tu do ma Set<Animal> co the them ca 2 object cua 2 class du chung
		//		co cung ten
		// Neu khong muon Set<Animal> co the them ca 2 object nay vi chung 
		//		co cung ten thi ta chi duoc override ham equals() trong class
		//		cha (class Animal) ma khong duoc phep override equals() trong
		//		class con (class Dog)
		Set<Animal> animals = new HashSet<Animal>();
		animals.add(new Animal("ABC"));
		animals.add(new Dog("ABC"));
		for (Animal animal : animals) {
			System.out.println(animal.getClass());
			System.out.println(animal);
		}
		
	}
}
