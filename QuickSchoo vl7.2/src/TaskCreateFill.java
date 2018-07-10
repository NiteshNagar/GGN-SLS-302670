import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TaskCreateFill {


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

		for(int y=2; y<=100; y++){
			
		//Open Fill detail page 01 June 2018
		chrome.get("https://pd2.iniitian.com/ess/Attendance/Entry/TimeSheet_Maintenance.aspx?P1=d4oty0zJ8yVCeFGvWFHJzQ%3d%3d&P2=_gtknNE9foHOhFB899j3ow%3d%3d");
		
		Thread.sleep(2000);		
		
		//Select To date 
		chrome.findElement(By.xpath(".//*[@id='txtReqByDate']")).click();
		
		//Get Month on site by default it 6
		chrome.findElement(By.xpath("html/body/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
		int FrommonthOnSite = 6;
		
		XSSFSheet sh3 = book.getSheetAt(3);
		
		//Get month from Sheet
		String datefromexcelMonth = sh3.getRow(y).getCell(8).getStringCellValue();
		System.out.println("datefromexcelMonth =" +datefromexcelMonth);
		
				
		//Get date from sheet
		String datefromexcelday = sh3.getRow(y).getCell(7).getStringCellValue();
		System.out.println("datefromexcelday = " +datefromexcelday);
		
		//Convert Excel month into a number
		int ExcelMonthconIntoANumber = 0;
		switch (datefromexcelMonth) {
		case "January":
			ExcelMonthconIntoANumber = 1;
			break;
			
		case "February":
			ExcelMonthconIntoANumber = 2;
			break;
		
		case "March":
			ExcelMonthconIntoANumber =3;
			break;
			
		case "April":
			ExcelMonthconIntoANumber = 4;
			break;
			
		case "May":
			ExcelMonthconIntoANumber = 5;
			break;
			
		case "June":
			ExcelMonthconIntoANumber = 6;
			break;
			
		case "July":
			ExcelMonthconIntoANumber = 7;
			break;
			
		case "August":
			ExcelMonthconIntoANumber = 8;
			break;
		
		case "September":
			ExcelMonthconIntoANumber = 9;
			break;
			
		case "October":
			ExcelMonthconIntoANumber = 10;
			break;
			
		case "November":
			ExcelMonthconIntoANumber = 11;
			break;
			
		case "December":
			ExcelMonthconIntoANumber = 12;
			break;
			
			
		default:
			ExcelMonthconIntoANumber = 0;
			break;
		}

		System.out.println("ExcelMonthconIntoANumber =" +ExcelMonthconIntoANumber);
		
		
		if(FrommonthOnSite>ExcelMonthconIntoANumber)
		{
		   System.out.println("Calender month on niitian is large");
		   		int countofclickbackside = FrommonthOnSite- ExcelMonthconIntoANumber;
		   		System.out.println("countofclickbackside =" +countofclickbackside);
		   		for (int back=countofclickbackside; back>=1; back--)
		   		{
		   		//Click on prev < on calender
					chrome.findElement(By.xpath("html/body/div[3]/div[1]/table/thead/tr[1]/th[1]/i")).click();
				}
		   			   		
				   		
		}else if(FrommonthOnSite<ExcelMonthconIntoANumber){
			System.out.println("Excel month is large");
			   	int countofclickforward = ExcelMonthconIntoANumber- FrommonthOnSite;
			   	System.out.println("countofclickforward =" +countofclickforward);
			   	
			   	for (int back=countofclickforward; back>=1; back--)
		   		{
		   		//Click on prev < on calender
					chrome.findElement(By.xpath("html/body/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();

		   		}
			   	
			   	
		}else{
			System.out.println("Months are equal");
			
		}
		
		chrome.findElement(By.xpath("html/body/div[3]/div[1]/.//td[contains(concat(' ', normalize-space(@class), ' '), ' day ') and not(contains(concat(' ', normalize-space(@class), ' '), ' day old')) and not(contains(concat(' ', normalize-space(@class), ' '), ' day new')) and (contains(concat(' ', normalize-space(@class), ' '), ' day')) and text()='"+datefromexcelday+"']")).click();
		
		//Get month from site
		int TomonthOnSite =6;
		
		//From date select to fill 
		chrome.findElement(By.xpath(".//*[@id='txtReqToDate']")).click();

		//get From month from sheet
		String datefromexcelMonth2 = sh3.getRow(y).getCell(11).getStringCellValue();
		System.out.println("datefromexcelMonth2 =" +datefromexcelMonth2);

		//Get From date from sheet
		String datefromexcelday2 = sh3.getRow(y).getCell(10).getStringCellValue();
		System.out.println("datefromexcelday = " +datefromexcelday2);
		
		
		//Convert Excel month into a number
				int ExcelMonthconIntoANumberto = 0;
				switch (datefromexcelMonth2) {
				case "January":
					ExcelMonthconIntoANumberto = 1;
					break;
					
				case "February":
					ExcelMonthconIntoANumberto = 2;
					break;
				
				case "March":
					ExcelMonthconIntoANumberto =3;
					break;
					
				case "April":
					ExcelMonthconIntoANumberto = 4;
					break;
					
				case "May":
					ExcelMonthconIntoANumberto = 5;
					break;
					
				case "June":
					ExcelMonthconIntoANumberto = 6;
					break;
					
				case "July":
					ExcelMonthconIntoANumberto = 7;
					break;
					
				case "August":
					ExcelMonthconIntoANumberto = 8;
					break;
				
				case "September":
					ExcelMonthconIntoANumberto = 9;
					break;
					
				case "October":
					ExcelMonthconIntoANumberto = 10;
					break;
					
				case "November":
					ExcelMonthconIntoANumberto = 11;
					break;
					
				case "December":
					ExcelMonthconIntoANumberto = 12;
					break;
					
					
				default:
					ExcelMonthconIntoANumberto = 0;
					break;
				}

				System.out.println("ExcelMonthconIntoANumberto =" +ExcelMonthconIntoANumberto);
				
				
				if(TomonthOnSite>ExcelMonthconIntoANumberto)
				{
				   System.out.println("Calender month on niitian is large");
				   		int countofclickbackside = TomonthOnSite- ExcelMonthconIntoANumberto;
				   		System.out.println("countofclickbackside =" +countofclickbackside);
				   		for (int back=countofclickbackside; back>=1; back--)
				   		{
				   		//Click on prev < on calender
							chrome.findElement(By.xpath("html/body/div[4]/div[1]/table/thead/tr[1]/th[1]/i")).click();
						}
				   			   		
						   		
				}else if(TomonthOnSite<ExcelMonthconIntoANumberto){
					System.out.println("Excel month is large");
					   	int countofclickforward = ExcelMonthconIntoANumberto- TomonthOnSite;
					   	System.out.println("countofclickforward =" +countofclickforward);
					   	
					   	for (int back=countofclickforward; back>=1; back--)
				   		{
				   		//Click on prev < on calender
							chrome.findElement(By.xpath("html/body/div[4]/div[1]/table/thead/tr[1]/th[3]/i")).click();

				   		}
					   	
					   	
				}else{
					System.out.println("Months are equal");
					
				}
				
				chrome.findElement(By.xpath("html/body/div[4]/div[1]/.//td[contains(concat(' ', normalize-space(@class), ' '), ' day ') and not(contains(concat(' ', normalize-space(@class), ' '), ' day old')) and not(contains(concat(' ', normalize-space(@class), ' '), ' day new')) and (contains(concat(' ', normalize-space(@class), ' '), ' day')) and text()='"+datefromexcelday2+"']")).click();
		
		
		//Project Specific		
		chrome.findElement(By.xpath(".//*[@id='ctl00_MainContent_rbltaskType_2']")).click();
		
		Thread.sleep(2000);
		
		//Click on Project
		//chrome.findElement(By.xpath(".//*[@id='ddlProjects']")).click();
		
		//Get month and year from Sheet
				String datefromexcelMonthandyear = sh3.getRow(y).getCell(12).getStringCellValue();
				System.out.println("datefromexcelMonth =" +datefromexcelMonthandyear);
						
		
		//Get values from drop down
		Select element = new Select(chrome.findElement(By.xpath(".//*[@id='ddlProjects']")));
		List<WebElement> listval=element.getOptions();
		Iterator<WebElement> itr=listval.iterator();
		while(itr.hasNext()){
			String val=itr.next().getText();
			if(val.contains(datefromexcelMonthandyear)){
				new Select(chrome.findElement(By.xpath(".//*[@id='ddlProjects']"))).selectByVisibleText(val);
				break;
			}
		}
		
		WebElement NOT= chrome.findElement(By.xpath(".//*[@id='ddlNatureTask']"));
		Select natureofTask = new Select(NOT);
		natureofTask.selectByVisibleText(sh3.getRow(y).getCell(6).getStringCellValue());
		
		//listval.contains(datefromexcelMonth)
		
		//datefromexcelMonth
		
		//System.out.println(element.contains(datefromexcelMonth));
		
		//Task Selection get from excel
		String TaskSelectionFromExcelSheet = sh3.getRow(y).getCell(18).getStringCellValue();
		System.out.println("TaskSelectionFromExcelSheet = " +TaskSelectionFromExcelSheet);
		
		//Select Task on site
		//Get values from drop down
				Select element2 = new Select(chrome.findElement(By.xpath(".//*[@id='lstTask']")));
				List<WebElement> listval2=element2.getOptions();
				Iterator<WebElement> itr2=listval2.iterator();
				while(itr2.hasNext()){
					String val2=itr2.next().getText();
					if(val2.contains(TaskSelectionFromExcelSheet)){
						new Select(chrome.findElement(By.xpath(".//*[@id='lstTask']"))).selectByVisibleText(val2);
						break;
					}
				}
		
		//fill time in hours
				chrome.findElement(By.xpath(".//*[@id='txtTimespent']")).sendKeys(sh3.getRow(y).getCell(4).getStringCellValue());
				
		//Fill Description TKT ID
				chrome.findElement(By.xpath(".//*[@id='txtremarsk']")).sendKeys(sh3.getRow(y).getCell(15).getStringCellValue());

		//click on complete
			chrome.findElement(By.xpath(".//*[@id='ctl00_MainContent_btnComplete']")).click();
				Thread.sleep(2500);
		}		
				
		Thread.sleep(2500);
		
	//	chrome.quit();
		
}
}
