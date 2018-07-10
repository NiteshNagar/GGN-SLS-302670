import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MarkAttendancefortoday {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		String BaseUrl = "https://www.iniitian.com/";

		FileInputStream fio = new FileInputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fio);
		XSSFSheet sh = book.getSheetAt(0);
						
		
		chrome.get(BaseUrl);
		chrome.manage().window().maximize();
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		chrome.findElement(By.xpath("/html/body/form/div/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[2]/input")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		chrome.findElement(By.name("emppassword")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());

		
		chrome.findElement(By.xpath("/html/body/form/div/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[4]/td/input")).click();		
		
		try {
			
			chrome.findElement(By.xpath(".//*[@id='lnkBtnAttendance']")).click();
			System.err.println("Attendance Marked successfully");
			chrome.quit();

		}catch (Exception e) {
			System.out.println("You already marked the attendance");
			chrome.quit();

		}
		
		book.close();
	}

}
