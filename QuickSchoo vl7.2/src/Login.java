import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		
//		System.setProperty("webdriver.firefox.bin","C:\\Users\\nitesh.nagar\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
	   System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
         
//	WebDriver driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
//		 File pathToBinary = new File("C:\\Program Files\\Mozilla Firefox15\\Firefox.exe");
//		 FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
//		 FirefoxProfile firefoxProfile = new FirefoxProfile();
//		 FirefoxDriver driver = new FirefoxDriver(ffBinary,firefoxProfile);
		
		driver.get("https://www.google.co.in");

//		driver.findElement(By.id("ct100_cph_txtUserName")).sendKeys("admin_1");
		
//		driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
		
		System.out.println("Nitesh");
	}
	
	
}
