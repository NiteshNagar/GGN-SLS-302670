/*
Constructor in Java

In Java, constructor is a block of codes similar to method. 
It is called when an instance of object is created and memory is allocated for the object.

It is a special type of method which is used to initialize the object.

        When a constructor is called
Everytime an object is created using new() keyword, atleast one constructor is called. 
It is called a default constructor.

Note: It is called constructor because it constructs the values at the time of object creation. 
It is not necessary to write a constructor for a class. 
It is because java compiler creates a default constructor if your class doesn't have any.

		Rules for creating java constructor
There are basically two rules defined for the constructor.

Constructor name must be same as its class name
Constructor must have no explicit return type


		Types of java constructors
There are two types of constructors in java:

Default constructor (no-arg constructor)
Parameterized constructor*/

/* 
 What is the purpose of default constructor?
 
Default constructor is used to provide the default values to the object like 0, null etc. depending on the type.
*/

/*
Java parameterized constructor
A constructor which has a specific number of parameters is called parameterized constructor.

Why use parameterized constructor?
Parameterized constructor is used to provide different values to the distinct objects.
Example of parameterized constructor
In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.

*/

public class Constructor {

	int id;
	String name;

	Constructor(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {

		Constructor s1 = new Constructor(111, "Karan");
		Constructor s2 = new Constructor(222, "Aryan");
		s1.display();
		s2.display();

	}

}
