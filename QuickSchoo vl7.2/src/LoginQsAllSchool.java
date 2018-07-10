import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginQsAllSchool {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 FileInputStream fio = new FileInputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
		 XSSFWorkbook book = new XSSFWorkbook(fio);
		 XSSFSheet sh = book.getSheet("Production");
		// sh2._xSSFSheet=sh;
		 
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
	
		
		
 		 for (int i=1; i<=45;i++)
		 {	 
		chrome.get(sh.getRow(i).getCell(0).getStringCellValue());
		Thread.sleep(2000);				
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		chrome.manage().window().maximize();
		
		chrome.findElement(By.id("txtUserName")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
	    chrome.findElement(By.id("txtPassword")).sendKeys(sh.getRow(i).getCell(2).getStringCellValue());
	    chrome.findElement(By.id("btnLogin")).click();
	    Thread.sleep(2000);
	    String url=chrome.getCurrentUrl();
	    System.out.println("Login done " +i+"URL: "+url);
	    /* try {
	    String welcome = chrome.findElement(By.xpath(".//*[@id='ctl00_lblWelcome']")).getText();
		 }
 		
		 catch (Exception e) {
			System.out.println("Not login" +i);
		}*/
		}
	     
	     
			    
	    
}
}
