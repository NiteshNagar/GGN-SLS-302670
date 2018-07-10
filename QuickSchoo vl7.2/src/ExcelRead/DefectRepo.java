package ExcelRead;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class DefectRepo {


	public static void main(String[] args) throws IOException, InterruptedException {
		
	/*	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();*/
		
		System.setProperty("webdriver.firefox.marionette","D:\\Automation\\Browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		FileInputStream fio = new FileInputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
		XSSFWorkbook WB = new XSSFWorkbook(fio);
		
		/*XSSFSheet sh= WB.getSheetAt(0);
		*/
		
		XSSFSheet sh1 = WB.getSheet("Nitesh");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://konnect.iniitian.com/inst/sls/Quick-School/QSNET/default.aspx");
		driver.manage().window().maximize();
		
		
		 Runtime.getRuntime().exec("D:\\Automation\\AutoITEXC\\Konnect_login.exe");	
		 
		System.out.println("Login done");
		
	/*	driver.findElement(By.xpath(".//*[@id='zz13_RootAspMenu']/li[3]/ul/li[2]/a/span/span")).click();		
		driver.findElement(By.xpath(".//*[@id='idHomePageNewItem']/span[2]")).click();*/
		
		try {
			
		
		for (int l=1;l<=100;l++)
					
		{
			
			driver.findElement(By.xpath(".//*[@id='zz13_RootAspMenu']/li[3]/ul/li[2]/a/span/span")).click();		
			driver.findElement(By.xpath(".//*[@id='idHomePageNewItem']/span[2]")).click();
						
		driver.switchTo().frame(1);
			
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		//fill details of defect
		driver.findElement(By.xpath("//input[@id='Title_fa564e0f-0c70-4ab9-b863-0177e6ddd247_$TextField']")).sendKeys(sh1.getRow(l).getCell(0).getStringCellValue());
				
		//Select Parent ID 
		WebElement parent=  driver.findElement(By.xpath(".//*[@id='Parent_x0020_ID_68dc65d7-9e3c-4f11-8227-e05cc9418d3d_$LookupField']"));
		Select PID = new Select(parent);
		PID.selectByVisibleText(sh1.getRow(l).getCell(4).getStringCellValue());
		
		//Select CR check box
		driver.findElement(By.xpath(".//*[@id='CR_x0020_Defect_cee2923a-7546-4d86-af16-f835b7ded72b_$BooleanField']")).click();
		
		//Select ProductName		
		WebElement ProductName=  driver.findElement(By.xpath(".//*[@id='Product_x0020_Name_ba2a9302-8140-4825-907e-2941dbff2189_$DropDownChoice']"));
		Select PName = new Select(ProductName);
		PName.selectByVisibleText("QS");
		
		//Select Module name
		WebElement Modulename=  driver.findElement(By.xpath(".//*[@id='Module_x0020_Name_b9e8c2f0-9e05-4375-ac92-f26c1c5a941b_$DropDownChoice']"));
		Select MName = new Select(Modulename);
		MName.selectByVisibleText(sh1.getRow(l).getCell(3).getStringCellValue());
			
		//Select Subpath
		WebElement Subpath=  driver.findElement(By.xpath(".//*[@id='Sub_x0020_Path_dec7bf61-c975-4626-852a-25f7a3151d86_$DropDownChoice']"));
		Select Spath = new Select(Subpath);
		Spath.selectByVisibleText("Activity");
		
		//Page selection
		WebElement pagesel=  driver.findElement(By.xpath(".//*[@id='Page0_9dd73d33-5cb2-48ae-9194-ffc1da88789d_$DropDownChoice']"));
		Select pageselection = new Select(pagesel);
		pageselection.selectByVisibleText("Student Info");
				
		//details
		driver.findElement(By.xpath(".//*[@id='Description_6901e2ba-d438-432b-b9a7-b995fd92d5f5_$TextField']")).sendKeys(sh1.getRow(l).getCell(1).getStringCellValue());
		
		//set priority
		WebElement priority=  driver.findElement(By.xpath(".//*[@id='Priority_1145e915-81c9-4c0d-b4af-50749412c6ca_$DropDownChoice']"));
		Select pri = new Select(priority);
		pri.selectByVisibleText("1-Resolve Immediately");
		
		//set severity
		WebElement severity=  driver.findElement(By.xpath(".//*[@id='Severity_f8070b32-9858-4e13-81b6-1d03bb03d428_$DropDownChoice']"));
		Select sev = new Select(severity);
		sev.selectByVisibleText("1-Critical");
		
		//Reported Release
		WebElement ReportedR=  driver.findElement(By.xpath(".//*[@id='Reported_x0020_Release_7bc68585-80ba-4870-a62e-ab7fe74bcc36_$DropDownChoice']"));
		Select RR = new Select(ReportedR);
		RR.selectByVisibleText("7.3");
				
		//Planned Release
		WebElement PlannedR=  driver.findElement(By.xpath(".//*[@id='Planned_x0020_Release_cadc7588-bf27-4e1e-a983-be71491ca9fc_$DropDownChoice']"));
		Select PR = new Select(PlannedR);
		PR.selectByVisibleText("7.4");
		
				
		//DevAssign
		driver.findElement(By.xpath("//input[@id='Developer_x0020_Assigned_ebe2111c-8b65-4be7-a8df-b0de3ad2bc9b_$ClientPeoplePicker_EditorInput']")).sendKeys(sh1.getRow(l).getCell(2).getStringCellValue());
	     //Tester Assign 
		driver.findElement(By.xpath(".//*[@id='Tester_x0020_Assigned_b3793c8e-f347-401f-9398-c979e1d7d1e7_$ClientPeoplePicker_EditorInput']")).sendKeys("Nitesh Nagar");

		

	       
		    /* WebElement devassign= driver.findElement(By.xpath("//input[@id='Developer_x0020_Assigned_ebe2111c-8b65-4be7-a8df-b0de3ad2bc9b_$ClientPeoplePicker_EditorInput']"));
	        Actions ac = new Actions(driver);
	        Thread.sleep(5000L);
	        ac.moveToElement(devassign).click().sendKeys("jskahdkjsdhkasjdh").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.TAB).build().perform();
	        Thread.sleep(5000);
		*/
							
		//Select State
		WebElement State=  driver.findElement(By.xpath(".//*[@id='State_0019bd6d-2517-4f1c-8b82-2f50da5e066e_$DropDownChoice']"));
		Select st = new Select(State);
		st.selectByVisibleText("Closed");
		
		
		//Comment
		driver.findElement(By.xpath(".//*[@id='Comments_e8fbee05-1646-4b82-8adc-3bca0c27fe6c_$TextField']")).sendKeys("Fixed and Verified");
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath(".//*[@id='Ribbon.ListForm.Edit.Commit.Publish-Large']")).click();
		driver.findElement(By.xpath(".//*[@id='Ribbon.ListForm.Edit.Commit.Publish-Large']")).click();
		
		}
		
		
		} catch (Exception e) {
		System.out.println("Time sheet filled successfully");	
		WB.close();
		driver.quit();
		}		
		
		// driver = webdriver.PhantomJS()
		
		
	/*	for(int i=1; i<=30;i++)
		{
			
			
			chrome.get(sh1.getRow(i).getCell(0).getStringCellValue());
			chrome.manage().window().maximize();
			
			String version = chrome.findElement(By.xpath(".//*[@id='spnVersion']")).getText();
		
			System.out.println(version);
			
			if(version.compareTo("Version 7.3")==0)
			{
				chrome.findElement(By.id("txtUserName")).sendKeys(sh1.getRow(i).getCell(1).getStringCellValue());
			    chrome.findElement(By.id("txtPassword")).sendKeys(sh1.getRow(i).getCell(2).getStringCellValue());
			    chrome.findElement(By.id("btnLogin")).click();
				System.out.print(i+"-" +"done");		
			}
			else {
				//System.out.print(i+"-" +"Version error");
				
			}
			
			}
		*/
	
		
	}
	
	
	
	
}
