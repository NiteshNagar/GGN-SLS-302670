
public class StaticKeyword {

	int empID;
	String name;
	static String Company = "Q3";

	StaticKeyword(int r, String n) {
		empID = r;
		name = n;
	}
	
	StaticKeyword(int r, String n, String c) {
		empID = r;
		name = n;
		Company = c;
		
	}

	void display() {
		System.out.println(empID + " " + name + " " + Company);
	}

	public static void main(String args[]) {
		StaticKeyword s1 = new StaticKeyword(111, "Abhishek");
		s1.display();
		StaticKeyword s2 = new StaticKeyword(222, "Shahbaz","NIIT");
		s2.display();
	}
}
	

