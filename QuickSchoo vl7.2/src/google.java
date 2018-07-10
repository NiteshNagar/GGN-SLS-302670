import java.util.List;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("http://automationpractice.com/index.php");
	
		chrome.manage().window().maximize();
		chrome.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[1]/a")).click();
				
//	    String a = chrome.findElement(By.xpath(".//*[@id='center_column']/ul/li[1]/div/div[2]/h5/a")).getText(); 
//	    System.out.println(a);

		System.out.println("Nitesh");
		System.out.println("Nagar");
		
//		
//		.//*[@id='center_column']/ul/li[2]/div/div[2]/h5/a
//		.//*[@id='center_column']/ul/li[3]/div/div[2]/h5/a
//		.//*[@id='center_column']/ul/li[4]/div/div[2]/h5/a
//		
		List<WebElement>elems = chrome.findElements(By.className("ajax_block_product"));
		int count = elems.size();
		System.out.println(count);
		
		
	}

}
