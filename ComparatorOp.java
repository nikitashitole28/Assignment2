package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Emp{
	private Integer id;
	private String name;
	public Emp() {
		super();
		
	}
	public Emp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class ComparatorOp {
	

	public static void main(String[] args) {
		
		List<Emp> lst1=new ArrayList<>();
		lst1.add(new Emp(1,"abc"));
		lst1.add(new Emp(3,"ddd"));
		lst1.add(new Emp(2,"fff"));
		lst1.add(new Emp(4,"ggg"));
		
		
		
		Comparator<Emp> multisort = Comparator.comparing(Emp::getId).thenComparing(Emp::getName);
		Collections.sort(lst1,multisort);
		lst1.forEach(x->System.out.println(x));
		
		
	}

}
