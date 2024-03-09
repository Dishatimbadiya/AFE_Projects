package app;

public class Player {
	private String name;
	private String email;
	private String contactNo;
	private String address;
	private int age;
	public Player()
	{
		
	}
	public Player(String name, String email, String contactNo, String address, int age) {
		super();
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.address = address;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [name=" + name + ", email=" + email + ", contactNo=" + contactNo + ", address=" + address
				+ ", age=" + age + "]";
	}
	
}
