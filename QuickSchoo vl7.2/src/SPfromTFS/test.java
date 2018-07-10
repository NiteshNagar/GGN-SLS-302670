package SPfromTFS;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		String BaseUrl = "http://172.23.3.91/nguruilp/Login.aspx";

		chrome.navigate().to(BaseUrl);
		chrome.manage().window().maximize();
		chrome.findElement(By.id("txt_username")).sendKeys("kirti00123");
		chrome.findElement(By.id("txt_password_1")).sendKeys("PASSWORD");
		chrome.findElement(By.id("btn_submit")).click(); 
		//System.out.println(chrome.switchTo().alert().getText());
		
		String parentWindowHandler = chrome.getWindowHandle();
		System.out.println(parentWindowHandler);
		chrome.switchTo().window("model popup");
		
		chrome.findElement(By.xpath(".//*[@id='Wrapper_btn_close']")).click(); 
		
}
}