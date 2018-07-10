package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailTask {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.firefox.marionette", "D:\\Automation\\Browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// comment the above 2 lines and uncomment below 2 lines to use Chrome
		// comment the below 2 lines and uncomment below 2 lines to use FireFox
		// System.setProperty("webdriver.chrome.driver","D:\\Automation\\Browser\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		// For Safari browser uncomment below 2 lines
		// WebDriver driver = new SafariDriver();
		                                                                                                                                               String str = "testing@123";
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath(".//*[@id='identifierId'][@type='email']")).sendKeys("nitesh.nagara100@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();

		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(str);
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();

		System.out.println("Logged in gmail successfully");

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[text()='COMPOSE']")));

		driver.findElement(By.xpath(".//*[text()='COMPOSE']")).click();
		System.out.println("compose E- mail cliked");

		 driver.findElement(By.xpath(".//textarea[contains(@name,'to')]")).sendKeys("nitesh.nagara100@gmail.com");
		 driver.findElement(By.xpath(".//*[contains(@class,'Am Al editable LW-avf')]")).sendKeys("Hi nitesh \n \nPlease find attached file   \n\n\n Thanks and Regards \n Nitesh Nagar");
			
		 driver.findElement(By.xpath(".//*[text()='Send'][@role='button']")).click();
		
		 Alert alert = driver.switchTo().alert();
		 Thread.sleep(5000L);
		 String sr = alert.getText();
		 System.out.println("get text string contains this value----->"+sr);
		 alert.accept();
		 
		// driver.findElement(By.xpath(".//*[text()='Send'][@role='button']")).click();
				
		Thread.sleep(2000);
		driver.close();
	}

}
