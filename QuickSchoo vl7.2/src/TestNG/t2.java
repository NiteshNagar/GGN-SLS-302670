package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class t2 {

	

	@BeforeSuite
	public void beformethod(){
		System.out.println("Nagar");
	}
}
