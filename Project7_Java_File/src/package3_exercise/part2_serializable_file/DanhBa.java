package package3_exercise.part2_serializable_file;

import java.io.Serializable;

public class DanhBa implements Serializable {
	private String name;
	private int phoneNumber;
	
	public DanhBa(String name, int phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public DanhBa() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
