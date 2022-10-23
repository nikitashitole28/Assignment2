package Assignment;

import java.util.Objects;

class MethodOverload{
	
	public void run(int a) {
		System.out.println("single parameter");
	}
	
	public void run(int a,int b) {
		System.out.println("double parameter");
	}
}

class Parent {

	public void showA() {

		System.out.println("parent class");
	}

}

class Child extends Parent {
	public void showB() {

		System.out.println("child class");
	}
}

abstract class Abstrac {
	abstract void show();

}

class Bank {

	private int id;
	private String name;
	private String add;

	public Bank(int id, String name, String add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(add, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		return Objects.equals(add, other.add) && id == other.id && Objects.equals(name, other.name);
	}

}

public class OopsFeatures extends Abstrac {

	public static void main(String[] args) {

		// encapsulation
		Bank b = new Bank(1, "nikita", "pune");
		Bank b1 = new Bank(2, "jugal", "pune");
		Bank b2 = new Bank(3, "dilip", "pune");

		System.out.println(b.getId() + " " + b.getName() + " " + b.getAdd());
		
		
		// inheritance
		
		Child c=new Child();
		c.showA();
		
		// method overloading
		MethodOverload mo=new MethodOverload();
		mo.run(1);
		mo.run(2, 3);

	}
	
	// abstraction
			@Override
			void show() {

				System.out.println("abstraction");

			}
			



}
