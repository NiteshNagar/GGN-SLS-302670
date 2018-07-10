package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeSuite
	public void beforsuit()
	{
		System.out.println("This is BeforeSuit method");
	}
	
	@BeforeClass
	public void beforclass()
	{
		System.out.println("This is BeforeClass Method");
	}
	
	@BeforeTest
	public void befortestmethod()
		{
		System.out.println("This is test BeforeTestMethod");
	}
	
	@BeforeMethod
	public void BeforMethod()
	{
		System.out.println("This is befor method");
	}
	
	@BeforeMethod
	public void BeforMethod2()
	{
		System.out.println("This is befor method2");
	}
	
	
	@Test
	public void method1()
	{
		System.out.println("This is test method 1");
	}
	
	@Test
	public void method2()
	{
		System.out.println("This is test Method 2");
	}
	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("This is test AfterMethod");		
	}
	
	
	
	@AfterTest
	public void aftertestmethod()
	{
		System.out.println("This is test AftertestMethod");	
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("This is aftersuit method");
	}
	
	
}


