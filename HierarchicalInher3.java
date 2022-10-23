package Assignment;


public class HierarchicalInher3 extends HierarchicalInher1 {
	void showC() {

		System.out.println("c class method");
	}

	public static void main(String[] args) {

		HierarchicalInher1 hi = new HierarchicalInher1();
		hi.showA();
		// hi.showB();
		// hi.showC();
		System.out.println("----------------");

		HierarchicalInher2 h2 = new HierarchicalInher2();
		h2.showA();
		h2.showB();
		// h2.showC();
		System.out.println("----------------");

		HierarchicalInher3 h3 = new HierarchicalInher3();
		h3.showA();
		// h3.showB();
		h3.showC();

	}
}
/* OUTPUT:      a class method
                ----------------
                a class method
                b class method
                ----------------
                a class method
                c class method   */




