package di;

public class Customer {
	
	String name;
	int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Customer(int age) {
		super();
		this.age = age;
	}
	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name is : "+name);
		System.out.println("Age is : "+age);
	}

}
