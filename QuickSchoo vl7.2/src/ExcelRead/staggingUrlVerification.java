package ExcelRead;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class staggingUrlVerification {

public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		FileInputStream fio = new FileInputStream("D:\\Sel.xlsx");
		XSSFWorkbook WB = new XSSFWorkbook(fio);
		
		/*XSSFSheet sh= WB.getSheetAt(0);
		*/
		
		XSSFSheet sh1 = WB.getSheet("nitesh");
		chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		for(int i=1; i<=30;i++)
		{
			
			
			chrome.get(sh1.getRow(i).getCell(0).getStringCellValue());
			
			chrome.manage().window().maximize();
			
			chrome.findElement(By.id("txtUserName")).sendKeys(sh1.getRow(i).getCell(1).getStringCellValue());
		    chrome.findElement(By.id("txtPassword")).sendKeys(sh1.getRow(i).getCell(2).getStringCellValue());
		    chrome.findElement(By.id("btnLogin")).click();
			System.out.print(i+"-" +"done");	
			}
			
	
				
		WB.close();
		
	}
	
	
	
	
}
