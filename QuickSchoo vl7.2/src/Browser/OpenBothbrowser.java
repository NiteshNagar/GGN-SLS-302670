package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBothbrowser {

	public static void main(String[] args) {
		
		//For Firfox browser uncomment below 2 lines
	System.setProperty("webdriver.firefox.marionette","D:\\Automation\\Browser\\geckodriver.exe");
	 driver = new FirefoxDriver();
		
		//For Chrome browser uncomment below 2 lines
	 //   System.setProperty("webdriver.chrome.driver","D:\\Automation\\Browser\\chromedriver.exe");
	//    WebDriver driver1 = new ChromeDriver();
		
		//For Safari browser uncomment below line
    //   WebDriver driver = new SafariDriver();
		
		driver.get("https://www.google.com");

		
	}
	
}
