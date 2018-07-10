import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
	
		String BaseUrl = "http://172.23.3.170/blank2/default.aspx";
				
		 for (int i=0; i<5;i++)
		 {	 
		chrome.get(BaseUrl);				
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		chrome.manage().window().maximize();
		
		
		
		
		
		
		
		/*chrome.findElement(By.id("txtUserName")).sendKeys(Username[i]);
	    chrome.findElement(By.id("txtPassword")).sendKeys(Password[i]);
	    chrome.findElement(By.id("btnLogin")).click();
	    */
	 
	    
	    chrome.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	     System.out.println("Value "+i);
	     
		 }
		
		
}
}
