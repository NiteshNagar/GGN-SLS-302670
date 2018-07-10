
public class child1 extends Parent1 {

	int x = 10;
	
	void show() {
		System.out.println(x);
		System.out.println(super.x);
		
	}
	
	public static void main(String[] args) {
		child1 c1 = new child1();

		c1.show();
		
		
	}
}
