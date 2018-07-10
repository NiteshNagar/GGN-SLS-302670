import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Browser.timeSheetmethodvariables;

public class testsssss {
public static void main(String[] args) throws IOException, InterruptedException {
	   
	
			System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
			
		String BaseUrl = "https://www.iniitian.com/";

		FileInputStream fio = new FileInputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fio);
		XSSFSheet sh = book.getSheetAt(0);
	//	ct2._xSSFSheet =sh;				
		
		chrome.get(BaseUrl);
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		
		chrome.findElement(By.xpath("/html/body/form/div/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		chrome.findElement(By.name("emppassword")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());

		
		chrome.findElement(By.xpath("/html/body/form/div/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/input")).click();
		//chrome.findElement(By.id("hlkAttendanceSystem")).click();
		
		book.close();

		chrome.get("https://pd2.iniitian.com/ess/Attendance/Entry/Attendancetms_Calendar.aspx");
		chrome.findElement(By.xpath(".//*[@id='ctl00_ProjectAllocation']")).click();
		Thread.sleep(2000);
		
		
	    ArrayList<String> tabs2 = new ArrayList<String> (chrome.getWindowHandles());
	    chrome.switchTo().window(tabs2.get(1));
	    
	  /*  System.out.println("enter the number.");
		Scanner in = new Scanner(System.in);
		in.close();*/
	    
	/*    System.out.println(chrome.findElement(By.xpath(".//*[@id='GvProjectAllocation']/tbody/tr[2]/td[2]")).getText());
	    System.out.println(chrome.findElement(By.xpath(".//*[@id='GvProjectAllocation']/tbody/tr[2]/td[3]")).getText());
	            
	                     */
	    XSSFSheet sh3 = book.getSheetAt(3);
	    
	    String TaskSelectionFromExcelSheet = sh3.getRow(1).getCell(13).getStringCellValue();
		System.out.println("TaskSelectionFromExcelSheet = " +TaskSelectionFromExcelSheet);
	    
	    for(int taskname =2; taskname <=10; taskname++)
	    {
	    System.out.println(chrome.findElement(By.xpath(".//*[@id='GvProjectAllocation']/tbody/tr["+taskname+"]/td[2]")).getText());	
		//Task Selection get from excel
		 
	    }
	    
	    
	    
	    
	    
	    /*
	    .//*[@id='GvProjectAllocation']/tbody/tr[2]/td[2]
	    .//*[@id='GvProjectAllocation']/tbody/tr[3]/td[2]
	    .//*[@id='GvProjectAllocation']/tbody/tr[4]/td[2]
	    .//*[@id='GvProjectAllocation']/tbody/tr[5]/td[2]
	    
	    */
	    
	    
	   /* for(int l=0; l<=10; l++)
	    {
	    	
	    // for May Task 	       
		chrome.findElement(By.xpath("html/body/div[1]/div/section/div/div[2]/form/div[4]/fieldset/div/div/center/div/table/tbody/tr[5]/td[6]/a")).click();
		*/
		
}
}
