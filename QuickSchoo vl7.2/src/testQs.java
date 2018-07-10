import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testQs {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		String [] BaseUrl =new String []{   "http://172.23.3.170/blank2/default.aspx" ,
		     "http://172.23.3.170/Nitesh/default.aspx" };
		
		String [] Username = new String[]{ "admin_1",
				 "admin_1"};
		
		String [] Password = new String[]{ "nitesh",
				 "nitesh"};
		
		
		 for (int i=0; i<2;i++)
		 {	 
		chrome.get(BaseUrl[i] );				
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		chrome.manage().window().maximize();
		chrome.findElement(By.id("txtUserName")).sendKeys(Username[i]);
	    chrome.findElement(By.id("txtPassword")).sendKeys(Password[i]);
	    chrome.findElement(By.id("btnLogin")).click();
	    
	    for(int p = 0; p<=50000; p++)
	    {
	    	
	    }
	    
	    chrome.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
	     System.out.println("Value "+i);
	     
		 }
		
		
}
}
