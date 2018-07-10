package htmldriver;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.htmlunit.HtmlUnitDriver;		
public class htmlUnitYest {				
		public static void main(String[] args) throws IOException, InterruptedException {
                     // Creating a new instance of the HTML unit driver
                      
                     WebDriver chrome = new HtmlUnitDriver();
                      
           		     // Navigate to Google		
                     chrome.get("https://www.iniitian.com/");					
                     System.out.println("Nitesh");
                     
                     FileInputStream fio = new FileInputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
             		XSSFWorkbook book = new XSSFWorkbook(fio);
             		XSSFSheet sh = book.getSheetAt(0);
             		
             		
            		chrome.manage().window().maximize();
            		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
            		System.out.println("Nitesh");
                    
            		chrome.findElement(By.xpath("/html/body/form/div/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
            		chrome.findElement(By.name("emppassword")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
            		System.out.println("Nitesh");
                    
            		
            		chrome.findElement(By.xpath("/html/body/form/div/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/input")).click();
            		//chrome.findElement(By.id("hlkAttendanceSystem")).click();
            		
            		book.close();

            		chrome.get("https://pd2.iniitian.com/ess/Attendance/Entry/Attendancetms_Calendar.aspx");
            		chrome.findElement(By.xpath(".//*[@id='ctl00_ProjectAllocation']")).click();
            		Thread.sleep(2000);
            		System.out.println("Nitesh");
                    
            		
            	    ArrayList<String> tabs2 = new ArrayList<String> (chrome.getWindowHandles());
            	    chrome.switchTo().window(tabs2.get(1));
            	    System.out.println("Nitesh");
                    
            	    
            	    // for May Task 	       
            		chrome.findElement(By.xpath("html/body/div[1]/div/section/div/div[2]/form/div[4]/fieldset/div/div/center/div/table/tbody/tr[5]/td[6]/a")).click();
            		//chrome.findElement(By.xpath("html/body/div[1]/div/section/div/div[2]/form/div[4]/fieldset/div/div/center/div/table/tbody/tr[2]/td[6]/a")).click();

            		chrome.findElement(By.xpath(".//*[@id='ctl00_MainContent_lnkNewTask']")).click();
            		System.out.println("Nitesh");
                    
             		
			/*		 // Locate the searchbox using its name		
                     WebElement element = driver.findElement(By.name("q"));	
                     
                    // Enter a search query		
                    element.sendKeys("Guru99");	
                   
		            // Submit the query. Webdriver searches for the form using the text input element automatically		
                    // No need to locate/find the submit button		
                    element.submit();			
                    
            		// This code will print the page title		
                    System.out.println("Page title is: " + driver.getTitle());		
             */       
                   
                     
                    
            		chrome.quit();			
         }		
}