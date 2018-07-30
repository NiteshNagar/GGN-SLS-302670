
import java.io.FileInputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Browser.timeSheetmethodvariables;
public class Taskcreated {
	
public static void main(String[] args) throws IOException, InterruptedException {
    
	timeSheetmethodvariables ct2 = new timeSheetmethodvariables();
	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		
		ct2._webDriver = chrome;		
		String BaseUrl = "https://www.iniitian.com/";

		FileInputStream fio = new FileInputStream("D:\\Automation\\Excelfiles\\Automation.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fio);
		XSSFSheet sh = book.getSheet("Inniitian");
		ct2._xSSFSheet = sh;
		
		
			
		chrome.get(BaseUrl);
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		
		chrome.findElement(By.xpath("html/body/div[1]/div/section/div/div[2]/form/div[4]/fieldset/div/div/center/div/table/tbody/tr[2]/td[6]/a")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		chrome.findElement(By.name("emppassword")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());

	
		
		chrome.findElement(By.xpath("/html/body/form/div/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/input")).click();
		
		book.close();

		chrome.get("https://pd2.iniitian.com/ess/Attendance/Entry/Attendancetms_Calendar.aspx");
		chrome.findElement(By.xpath(".//*[@id='ctl00_ProjectAllocation']")).click();
		Thread.sleep(2000);
		
		
	    ArrayList<String> tabs2 = new ArrayList<String> (chrome.getWindowHandles());
	    chrome.switchTo().window(tabs2.get(1));
	    
	
	    // for May Task 	       
		chrome.findElement(By.xpath("html/body/div[1]/div/section/div/div[2]/form/div[4]/fieldset/div/div/center/div/table/tbody/tr[3]/td[6]/a")).click();
			
		for(int p=1; p<=100; p++){
			
			ct2.p=p;
		
		chrome.findElement(By.xpath(".//*[@id='ctl00_MainContent_lnkNewTask']")).click();
		
		chrome.findElement(By.xpath(".//*[@id='txtProjectByDate']")).click();
		
	//	 Runtime.getRuntime().exec("D:\\Automation\\AutoITEXC\\Inniitian_calender_task.exe");	
		String[] result = chrome.findElement(By.xpath("html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")).getText().split(" ");
		System.out.println("result" +result[0]);

		
		//Date pick from excel
		XSSFSheet sh3 = book.getSheet("New TT");
		ct2._xSSFSheet = sh3;
		
		//Excel Date Original 
		System.out.println(sh3.getRow(p).getCell(2).getStringCellValue());
		
		//Converted month from excel
		String datefromexcelMonth =  sh3.getRow(p).getCell(8).getStringCellValue();
		System.out.println("datefromexcelMonth =" +datefromexcelMonth);
		
		//Converted day from excel
		/*String datefromexcelday =  sh3.getRow(1).getCell(7).getStringCellValue();
		System.out.println(datefromexcelday);*/
		ct2.datefromexcelday = sh3.getRow(p).getCell(7).getStringCellValue();
		System.out.println("datefromexcelday = " + ct2.datefromexcelday);
		
		
		//Convert Web site month into a number
		int monthNumber = 0;
		
		switch (result[0]) {
		case "January":
			monthNumber = 1;
			break;
			
		case "February":
			monthNumber = 2;
			break;
		
		case "March":
			monthNumber =3;
			break;
			
		case "April":
			monthNumber = 4;
			break;
			
		case "May":
			monthNumber = 5;
			break;
			
		case "June":
			monthNumber = 6;
			break;
			
		case "July":
			monthNumber = 7;
			break;
			
		case "August":
			monthNumber = 8;
			break;
		
		case "September":
			monthNumber = 9;
			break;
			
		case "October":
			monthNumber = 10;
			break;
			
		case "November":
			monthNumber = 11;
			break;
			
		case "December":
			monthNumber = 12;
			break;
			
			
		default:
			monthNumber = 0;
			break;
		}

		System.out.println("monthNumber = " +monthNumber);
		
		
		//Conver excel date into a number
		int monthNumber2 = 0;
		switch (datefromexcelMonth) {
		case "January":
			monthNumber2 = 1;
			break;
			
		case "February":
			monthNumber2 = 2;
			break;
		
		case "March":
			monthNumber2 =3;
			break;
			
		case "April":
			monthNumber2 = 4;
			break;
			
		case "May":
			monthNumber2 = 5;
			break;
			
		case "June":
			monthNumber2 = 6;
			break;
			
		case "July":
			monthNumber2 = 7;
			break;
			
		case "August":
			monthNumber2 = 8;
			break;
		
		case "September":
			monthNumber2 = 9;
			break;
			
		case "October":
			monthNumber2 = 10;
			break;
			
		case "November":
			monthNumber2 = 11;
			break;
			
		case "December":
			monthNumber2 = 12;
			break;
			
			
		default:
			monthNumber2 = 0;
			break;
		}

		System.out.println("monthNumber2 =" +monthNumber2);
		
		ct2.dynamicDatefromExcel = sh3.getRow(p).getCell(7).getStringCellValue();
		System.out.println("dynamicDatefromExcel =" +ct2.dynamicDatefromExcel);
		
		if(monthNumber>monthNumber2)
		{
		   System.out.println("Calender month on niitian is large");
		   		int countofclickbackside = monthNumber- monthNumber2;
		   		System.out.println("countofclickbackside =" +countofclickbackside);
		   		for (int back=countofclickbackside; back>=1; back--)
		   		{
		   		//Click on prev < on calender
					chrome.findElement(By.xpath("html/body/div[2]/div[1]/table/thead/tr[1]/th[1]/i")).click();
				}
		   		filldate(ct2);		   		
				   		
		}else if(monthNumber<monthNumber2){
			System.out.println("Excel month is large");
			   	int countofclickforward = monthNumber2- monthNumber;
			   	System.out.println("countofclickforward =" +countofclickforward);
			   	
			   	for (int back=countofclickforward; back>=1; back--)
		   		{
		   		//Click on prev < on calender
					chrome.findElement(By.xpath("html/body/div[2]/div[1]/table/thead/tr[1]/th[3]/i")).click();

		   		}
			   	filldate(ct2);
			   	
		}else{
			System.out.println("Months are equal");
			filldate(ct2);
		}
		
			
		
		// To date selection 
		chrome.findElement(By.xpath(".//*[@id='txtProjectToDate']")).click();
		
	//	 Runtime.getRuntime().exec("D:\\Automation\\AutoITEXC\\Inniitian_calender_task.exe");	
		String[] todate = chrome.findElement(By.xpath("html/body/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText().split(" ");
		System.out.println("todate =" +todate[0]);                
			
		//Excel Date Original 
		System.out.println("Excel Orignal Date =" +sh3.getRow(1).getCell(3).getStringCellValue());
		
		//Converted month from excel
		String datefromexcelMonth2 =  sh3.getRow(p).getCell(11).getStringCellValue();
		System.out.println("datefromexcelMonth2 =" +datefromexcelMonth2);
		
		//Converted day from excel
		/*String datefromexcelday =  sh3.getRow(1).getCell(7).getStringCellValue();
		System.out.println(datefromexcelday);*/
		ct2.datefromexcelday2 = sh3.getRow(p).getCell(10).getStringCellValue();
		System.out.println("datefromexcelday2 =" +ct2.datefromexcelday2);
		
		
		//Convert Web site month into a number
		int monthNumber4 = 0;
		
		switch (todate[0]) {
		case "January":
			monthNumber4 = 1;
			break;
			
		case "February":
			monthNumber4 = 2;
			break;
		
		case "March":
			monthNumber4 =3;
			break;
			
		case "April":
			monthNumber4 = 4;
			break;
			
		case "May":
			monthNumber4 = 5;
			break;
			
		case "June":
			monthNumber4 = 6;
			break;
			
		case "July":
			monthNumber4 = 7;
			break;
			
		case "August":
			monthNumber4 = 8;
			break;
		
		case "September":
			monthNumber4 = 9;
			break;
			
		case "October":
			monthNumber4 = 10;
			break;
			
		case "November":
			monthNumber4 = 11;
			break;
			
		case "December":
			monthNumber4 = 12;
			break;
			
			
		default:
			monthNumber4 = 0;
			break;
		}

		System.out.println("monthNumber4 =" +monthNumber4);
		
		
		//Conver excel date into a number
		int monthNumber3 = 0;
		switch (datefromexcelMonth2) {
		case "January":
			monthNumber3 = 1;
			break;
			
		case "February":
			monthNumber3 = 2;
			break;
		
		case "March":
			monthNumber3 =3;
			break;
			
		case "April":
			monthNumber3 = 4;
			break;
			
		case "May":
			monthNumber3 = 5;
			break;
			
		case "June":
			monthNumber3 = 6;
			break;
			
		case "July":
			monthNumber3 = 7;
			break;
			
		case "August":
			monthNumber3 = 8;
			break;
		
		case "September":
			monthNumber3 = 9;
			break;
			
		case "October":
			monthNumber3 = 10;
			break;
			
		case "November":
			monthNumber3= 11;
			break;
			
		case "December":
			monthNumber3 = 12;
			break;
			
			
		default:
			monthNumber3 = 0;
			break;
		}

		System.out.println("monthNumber3 =" +monthNumber3);
		
			
		if(monthNumber4>monthNumber3)
		{
		   System.out.println("Calender month on niitian is large");
		   		int countofclickbackside2 = monthNumber4- monthNumber3;
		   		System.out.println("countofclickbackside2 =" +countofclickbackside2);
		   		for (int back=countofclickbackside2; back>=1; back--)
		   		{
		   		//Click on prev < on calender
					chrome.findElement(By.xpath("html/body/div[3]/div[1]/table/thead/tr[1]/th[1]/i")).click();
					
				}
				//Set Date from Excel
		   		
				   		
		}
		else if(monthNumber3>monthNumber4){
			System.out.println("Excel month is large");
			   	int countofclickforward2 = monthNumber3- monthNumber4;
			   	System.out.println("countofclickforward2 =" +countofclickforward2);
			   	
			   	for (int back=countofclickforward2; back>=1; back--)
		   		{
		   		//Click on prev < on calender
					chrome.findElement(By.xpath("html/body/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
		   		}
			//   	chrome.findElement(By.xpath("html/body/div[2]/div[1]/.//td[contains(concat(' ', normalize-space(@class), ' '), ' day ') and not(contains(concat(' ', normalize-space(@class), ' '), ' day old')) and not(contains(concat(' ', normalize-space(@class), ' '), ' day new')) and (contains(concat(' ', normalize-space(@class), ' '), ' day')) and text()='22']")).click();

			   	
		}else{
			System.out.println("Months are equal");
	
		}
	
		String todatefill = sh3.getRow(p).getCell(10).getStringCellValue();
		System.out.println("todatefill =" +todatefill);		
		
		chrome.findElement(By.xpath("html/body/div[3]/div[1]/.//td[contains(concat(' ', normalize-space(@class), ' '), ' day ') and not(contains(concat(' ', normalize-space(@class), ' '), ' day old')) and not(contains(concat(' ', normalize-space(@class), ' '), ' day new')) and (contains(concat(' ', normalize-space(@class), ' '), ' day')) and text()='"+todatefill+"']")).click();
	
	//	chrome.findElement(By.xpath(".//*[@id='ctl00_MainContent_lnksaveTask']")).click();
		Thread.sleep(2000);
		chrome.findElement(By.xpath(".//*[@id='ctl00_MainContent_lnksaveTask']")).click();
		//chrome.findElement(By.xpath(".//*[@id='ctl00_MainContent_lnksaveTask']")).click();
		Thread.sleep(2000);
		
		/*
		
		*/
		System.out.println("done");
	// "+todatefill+"
	}
		Thread.sleep(3000);
//chrome.quit();	
	}




public static void filldate(timeSheetmethodvariables receiverobj2) throws InterruptedException{
	//Set Date from Excel
	receiverobj2._webDriver.findElement(By.xpath("html/body/div[2]/div[1]/.//td[contains(concat(' ', normalize-space(@class), ' '), ' day ') and not(contains(concat(' ', normalize-space(@class), ' '), ' day old')) and not(contains(concat(' ', normalize-space(@class), ' '), ' day new')) and (contains(concat(' ', normalize-space(@class), ' '), ' day')) and text()='"+receiverobj2.dynamicDatefromExcel+"']")).click();
	//Set Name
	receiverobj2._webDriver.findElement(By.xpath(".//*[@id='txtProjectName']")).sendKeys(receiverobj2._xSSFSheet.getRow(receiverobj2.p).getCell(0).getStringCellValue());
	//Set Description
	receiverobj2._webDriver.findElement(By.xpath(".//*[@id='txtProjectDesc']")).sendKeys(receiverobj2._xSSFSheet.getRow(receiverobj2.p).getCell(1).getStringCellValue());
	//Set duration
	receiverobj2._webDriver.findElement(By.xpath(".//*[@id='txtTaskDuration']")).sendKeys(receiverobj2._xSSFSheet.getRow(receiverobj2.p).getCell(4).getStringCellValue());
	
	//Set pecentage
	 receiverobj2._webDriver.findElement(By.xpath("//*[@id='TxtCompletion']")).sendKeys("100");
	
	//set assign to 
		receiverobj2._webDriver.findElement(By.xpath(".//*[@id='chkself']")).click();
	 
	Thread.sleep(2000);
	//select Nature of task
	WebElement ProductName=  receiverobj2._webDriver.findElement(By.xpath(".//*[@id='ddlNatureTask']"));
	Select NatureOfTask = new Select(ProductName);
	NatureOfTask.selectByVisibleText(receiverobj2._xSSFSheet.getRow(receiverobj2.p).getCell(6).getStringCellValue());
	
	
			 
}                                   

}
