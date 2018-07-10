package Testpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;



public class test1 {


public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.firefox.marionette","D:\\Automation\\Browser\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.facebook.com");

	Thread.sleep(5000);
	driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("niit");
}
}
