
public class Child3 extends Parent3 {

	void test (){
		System.out.println("Test method of child class");
	}
	
	void print(){
	super.test();
	test();	
	}
	
	
public static void main(String[] args) {
	Child3 c1 = new Child3();
	c1.print();
	
}
}


