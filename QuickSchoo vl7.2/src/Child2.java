
public class Child2 extends Parent2{

	String color="black";  
	void printColor(){  
	System.out.println(color);//prints color of Child2 class  
	System.out.println(super.color);//prints color of Parent2 class  
	}  
		
	public static void main(String[] args) {
		
		Child2 d=new Child2();  
			d.printColor();  

	}

}
