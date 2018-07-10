package Browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TimeSheetAbhishek {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		timeSheetmethodvariables sh2 = new timeSheetmethodvariables();
		
	System.setProperty("webdriver.firefox.marionette","D:\\Automation\\Browser\\geckodriver.exe");
	 WebDriver driver = new FirefoxDriver();
	 sh2._webDriver = driver;
	
	 driver.manage().window().maximize();
	 
	 FileInputStream fio = new FileInputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
	 XSSFWorkbook book = new XSSFWorkbook(fio);
	 XSSFSheet sh = book.getSheet("Abhishek");
	 sh2._xSSFSheet=sh;
	 
	 
	 for(int i=1;i<=12;i++)
	 {
		 driver.get("http://konnect.iniitian.com/inst/sls/Quick-School/QSNET/Lists/Team%20Time%20Sheet/NewForm.aspx?Source=http%3A%2F%2Fkonnect%2Einiitian%2Ecom%2Finst%2Fsls%2FQuick%2DSchool%2FQSNET%2FLists%2FTeam%2520Time%2520Sheet%2FTTS%2520%2520Date%2520Wise%2Easpx&RootFolder=");
	    
		// Runtime.getRuntime().exec("D:\\Automation\\AutoITEXC\\Konnect_login.exe");	
	     
	     
		 sh2.i=i;
	 driver.findElement(By.xpath(".//*[@id='Ticket_x0020_ID_0b5a69c2-d4fd-4756-a1c6-c550879f53c8_$TextField']")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
	 String Value = sh.getRow(i).getCell(2).getStringCellValue();
	 Thread.sleep(1000);
	 if(Value.equalsIgnoreCase("Client Issue"))
	 {
		 WebElement WorkType=  driver.findElement(By.xpath(".//*[@id='Work_x0020_Type_84b6d136-1446-4a9d-8ac5-c69be06024b6_$DropDownChoice']"));
		 Select wt = new Select(WorkType);
		 wt.selectByVisibleText("Client Issue");
		 Thread.sleep(1000);
		 fill(sh2);
		  
	 }
	 else{
		 WebElement WorkType=  driver.findElement(By.xpath(".//*[@id='Work_x0020_Type_84b6d136-1446-4a9d-8ac5-c69be06024b6_$DropDownChoice']"));
		 Select wt = new Select(WorkType);
		 wt.selectByVisibleText("Client Request");
		 fill(sh2); 
		 	 
	 }	
	 
	 }
	   
	
	}
	
	public static void fill(timeSheetmethodvariables receiverobj) throws InterruptedException{
		receiverobj._webDriver.findElement(By.xpath(".//*[@id='Work_x0020_Detail_f9414f47-d367-4ed0-b11a-6b033672dbdb_$TextField']")).sendKeys(receiverobj._xSSFSheet.getRow(receiverobj.i).getCell(1).getStringCellValue());
	//	receiverobj._webDriver.findElement(By.xpath(".//*[@id='Date_3eaa7c51-8835-4524-ac4d-ed4d3cebb62a_$DateTimeFieldDateDatePickerImage']")).click();
		receiverobj._webDriver.findElement(By.xpath(".//*[@id='Hours_b3bf5c86-5cb8-4ed6-85ca-ac7ba8162be1_$NumberField']")).sendKeys(receiverobj._xSSFSheet.getRow(receiverobj.i).getCell(4).getStringCellValue()); 
		
		Thread.sleep(1000);
		WebElement State= receiverobj._webDriver.findElement(By.xpath(".//*[@id='Stage_fa3347c1-4172-4adf-8d77-da0c0ceae2ac_$DropDownChoice']"));
		Select state = new Select(State);
		state.selectByVisibleText("Code");
		
		receiverobj._webDriver.findElement(By.xpath(".//*[@id='Title_fa564e0f-0c70-4ab9-b863-0177e6ddd247_$TextField']")).sendKeys("Coding"); 
		
		receiverobj._webDriver.findElement(By.xpath(".//*[@id='Ticket_x0020_Link_66c01e4f-60f7-433d-af8b-60c490ab2b00_$UrlFieldUrl']")).clear();

		receiverobj._webDriver.findElement(By.xpath(".//*[@id='Ticket_x0020_Link_66c01e4f-60f7-433d-af8b-60c490ab2b00_$UrlFieldUrl']")).clear();
		receiverobj._webDriver.findElement(By.xpath(".//*[@id='Ticket_x0020_Link_66c01e4f-60f7-433d-af8b-60c490ab2b00_$UrlFieldUrl']")).sendKeys("http://localhost/qsnet");
	
		receiverobj._webDriver.findElement(By.xpath(".//*[@id='Date_3eaa7c51-8835-4524-ac4d-ed4d3cebb62a_$DateTimeFieldDate']")).clear();
		receiverobj._webDriver.findElement(By.xpath(".//*[@id='Date_3eaa7c51-8835-4524-ac4d-ed4d3cebb62a_$DateTimeFieldDate']")).sendKeys(receiverobj._xSSFSheet.getRow(receiverobj.i).getCell(3).getStringCellValue());
			
		receiverobj._webDriver.findElement(By.xpath(".//*[@id='ctl00_ctl39_g_2a38da46_8518_4471_b242_1107a47c6a92_ctl00_toolBarTbl_RightRptControls_ctl00_ctl00_diidIOSaveItem']")).click();				
		Thread.sleep(1000);
	}
	
	
}
