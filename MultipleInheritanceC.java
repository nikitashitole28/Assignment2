package Assignment;



public class MultipleInheritanceC extends MultipleInheritanceB {

	void showC() {
		System.out.println("c class method");

	}

	public static void main(String[] args) {
		MultipleInheritanceA si = new MultipleInheritanceA();
		si.showA();
		// si.showB();
		// si.showC();
		System.out.println("----------------------------");
		MultipleInheritanceB sc = new MultipleInheritanceB();
		sc.showA();
		sc.showB();
		// sc.showC();
		System.out.println("----------------------------");
		MultipleInheritanceC s = new MultipleInheritanceC();
		s.showA();
		s.showB();
		s.showC();
	}
}

	
	/*output:a class method
	----------------------------
	a class method
	b class method
	----------------------------
	a class method
	b class method
	c class method  */


		

	


