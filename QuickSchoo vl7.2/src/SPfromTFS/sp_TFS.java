package SPfromTFS;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sp_TFS {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		String BaseUrl = "http://ho-cnf-tfs:8080/tfs/SLS-GGN34/QuickSchoolNet/_versionControl?path=%24%2FQuickSchoolNet%2FQSNET_LATEST%2FFile%20List&_a=contents";

		FileInputStream fio = new FileInputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fio);
		XSSFSheet sh = book.getSheetAt(1);
		
		chrome.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);		
		
		chrome.get(BaseUrl);
		chrome.manage().window().maximize();
		Thread.sleep(5000);
		
		
		chrome.findElement(By.xpath(".//*[@id='row_32_2']/div[1]/div[2]/a")).click();
		chrome.findElement(By.linkText("Click to download file to your computer.")).click();
		
		try {
			
			for(int i = 1;i<=50;i++)
			{
				chrome.findElement(By.xpath(".//*[@id='sourcePath']")).clear();
				chrome.findElement(By.xpath(".//*[@id='sourcePath']")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
				chrome.findElement(By.xpath(".//*[@id='1']/div[3]/div[3]/div[2]/div[1]/table/tbody/tr/td[2]/div/div[1]")).click();
				Thread.sleep(3000);
				
				chrome.findElement(By.xpath("//*[text()='Download']")).click();
				System.out.println(i+"-" +"Done");
				/*sh.getRow(i).getCell(1).setCellValue("");	
				
				FileOutputStream fos1 = new FileOutputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
				book.write(fos1);*/
						
				/*for(int j=i; j>=1;j++)
				{
						
				sh.getRow(j).getCell(1).setCellValue("");	
				
				FileOutputStream fos1 = new FileOutputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
				book.write(fos1);
				}*/
			
			}
							
		} catch (Exception e) {
			System.out.println(e.getMessage());
			book.close();
			chrome.close();

			//FileOutputStream fos = new FileOutputStream("D:\\Automation\\ExcelFiles\\Automation.xlsx");
							
		}
		
		
		
		
		
		
		
	}
	
}


