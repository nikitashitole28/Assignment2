package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Animal {
	private String name;
	private String colour;

	public Animal() {
		super();

	}

	public Animal(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", colour=" + colour + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(colour, other.colour) && Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}

public class SearchObj {

	public static void main(String[] args) {
		Animal a = new Animal("dog", "black");
		Animal a1 = new Animal("cow", "white");
		Animal a2 = new Animal("cat", "white");

		List<Animal> lst1 = new ArrayList<>();
		lst1.add(a);
		lst1.add(a1);
		lst1.add(a2);

		List<Animal> collect = lst1.stream().filter(x -> x.getName().startsWith("c")).collect(Collectors.toList());
		collect.forEach(x->System.out.println(x));
		

	}

}
