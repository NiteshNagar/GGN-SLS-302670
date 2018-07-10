import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FBlogin {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("disable-popup-blocking");
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);

		// Implicit Wait and Explicit Wait

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
																																																											String str = "kavinnagar";
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("bhambholeroadtrip");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(str);

		
		Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='u_0_2']")));

		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click();
		System.out.println("Logged in");

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE);
		action.build().perform();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='userNavigationLabel']")));
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();

		System.out.println("FB menu");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[starts-with(@id,'js_')]/div/div/ul/li[12]/a/span/span")));
	//	chrome.findElement(By.xpath(".//*[starts-with(@id,'js_')]/div/div/ul/li[12]/a/span/span")).click();
		System.out.println("Log out click");

	}
}
