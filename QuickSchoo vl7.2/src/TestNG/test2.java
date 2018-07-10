package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {

	
	@BeforeMethod
	public void method23()
	{
		System.out.println("1");
	}
	
	
	
	@Test
	public void method3()
	{
		System.out.println("2");
	}
	
	@Test
	public void method4()
	{
		System.out.println("4");
	}
	
	
	@AfterTest
	public void method5()
	{
		System.out.println("3");
	}
	
	
}
