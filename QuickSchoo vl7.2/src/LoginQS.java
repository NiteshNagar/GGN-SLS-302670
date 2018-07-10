import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginQS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Eclipse\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		String [] BaseUrl =new String []{   "https://quickschool.niitnguru.com/Aisedu" ,
		     "https://quickschool.niitnguru.com/DPSD" ,
		    "https://quickschool.niitnguru.com/literavalleyschool" ,
		     "https://quickschool.niitnguru.com/bpsdoha" ,
		     "https://quickschool.niitnguru.com/thealschool" ,
		    "https://quickschool.niitnguru.com/trialschool" ,
		   "https://quickschool.niitnguru.com/trinityglobalschool" ,
		   "https://quickschool.niitnguru.com/SHSS" ,
		     "https://quickschool.niitnguru.com/BEMS" ,
		   "https://quickschool.niitnguru.com/jajooschool" ,
		    "https://quickschool.niitnguru.com/rdps" ,
		   "https://quickschool.niitnguru.com/baems" ,
		   "https://quickschool.niitnguru.com/vrikshaschool" ,
		     "https://quickschool.niitnguru.com/DemoSchool" ,
		     "https://quickschool.niitnguru.com/dpspanipatref" ,
		    "https://quickschool.niitnguru.com/kdbps" ,
		     "https://quickschool.niitnguru.com/MVN" ,
		     "https://quickschool.niitnguru.com/NewSchool" ,
		     "https://quickschool.niitnguru.com/sps" ,
		     "https://quickschool.niitnguru.com/statepublicschools" ,
		     "https://quickschool.niitnguru.com/theanandaacademy" ,
		     "https://quickschool.niitnguru.com/WockhardtGlobalSchool" ,
		     "https://quickschool.niitnguru.com/SMB" ,
		     "https://quickschool.niitnguru.com/DOLPHINS" ,
		     "https://quickschool.niitnguru.com/RKVVM" ,
		     "https://quickschool.niitnguru.com/noelschool" };
		
		
	
		/*String BaseURL1 = "https://quickschool.niitnguru.com/Aisedu";
		String BaseURL2 = "https://quickschool.niitnguru.com/DPSD";
		String BaseURL3 = "https://quickschool.niitnguru.com/literavalleyschool";
		String BaseURL4 = "https://quickschool.niitnguru.com/bpsdoha";
		String BaseURL5 = "https://quickschool.niitnguru.com/thealschool";
		String BaseURL6 = "https://quickschool.niitnguru.com/trialschool";
		String BaseURL7 = "https://quickschool.niitnguru.com/trinityglobalschool";
		String BaseURL8 = "https://quickschool.niitnguru.com/SHSS";
		String BaseURL9 = "https://quickschool.niitnguru.com/BEMS";
		String BaseURL10 = "https://quickschool.niitnguru.com/jajooschool";
		String BaseURL11 = "https://quickschool.niitnguru.com/rdps";
		String BaseURL12 = "https://quickschool.niitnguru.com/baems";
		String BaseURL13 = "https://quickschool.niitnguru.com/vrikshaschool";
		String BaseURL14 = "https://quickschool.niitnguru.com/DemoSchool";
		String BaseURL15 = "https://quickschool.niitnguru.com/dpspanipatref";
		String BaseURL16 = "https://quickschool.niitnguru.com/kdbps";
		String BaseURL17 = "https://quickschool.niitnguru.com/MVN";
		String BaseURL18 = "https://quickschool.niitnguru.com/NewSchool";
		String BaseURL19 = "https://quickschool.niitnguru.com/sps";
		String BaseURL20 = "https://quickschool.niitnguru.com/statepublicschools";
		String BaseURL21 = "https://quickschool.niitnguru.com/theanandaacademy";
		String BaseURL22 = "https://quickschool.niitnguru.com/WockhardtGlobalSchool";
		String BaseURL23 = "https://quickschool.niitnguru.com/SMB";
		String BaseURL24 = "https://quickschool.niitnguru.com/DOLPHINS";
		String BaseURL25 = "https://quickschool.niitnguru.com/RKVVM";
		String BaseURL26 = "https://quickschool.niitnguru.com/noelschool";*/
 
		 
		String [] Username = new String[]{ "admin_1",
				 "admin_1",
				 "admin_1",
				 "admin_2",
				 "admin_1",
				 "admin_1315",
				
				 "admin_1",
				 "admin_1",
				 "admin_1",
				
				 "admin_1",
				 "admin_1",
				 "admin_1",
				
				 "admin_1",
				 "admin_1314",
				
				 "admin_1",
				
				 "admin_3",
				 "admin_3",
				 "admin_3",
				
				 "admin_3",
				 "admin_3",
				
				 "admin_1",
				 "admin_1",
				
				 "admin_1",
				 "admin_7",
				 "admin_1",
				
				 "admin_5",
				"admin_1",

				 "admin_5"};

		
		/* String Username1= "admin_1";
		 String Username2= "admin_1";
		 String Username3= "admin_1";
		 String Username4= "admin_2";
		 String Username5= "admin_1";
		 String Username6= "admin_1315";
		 
		 String Username7= "admin_1";
		 String Username8= "admin_1";
		 String Username9= "admin_1";
		 
		 String Username10= "admin_1";
		 String Username11= "admin_1";
		 String Username12= "admin_1";
		 
		 String Username13= "admin_1";
		 String Username14= "admin_1314";
		 
		 String Username15= "admin_1";
		 
		 String Username16= "admin_3";
		 String Username17= "admin_3";
		 String Username18= "admin_3";
		 
		 String Username19= "admin_3";
		 String Username20= "admin_3";
		 
		 String Username21= "admin_1";
		 String Username22= "admin_1";
		 
		 String Username23= "admin_1";
		 String Username24= "admin_7";
		 String Username25= "admin_1";
		 
		 String Username26= "admin_5";
		 */
		 
		 
		String [] Password = new String[]{ "server12w",
				 "dpis2017d",
				 "amit#p7lvs",
				 "samsun5ma",
				 "wine1wine",
				 "trial@!2niit",
				 "FEB_23BT",
				 "khargone1s",
				 "burhani1s",
				 "abcdef01s",
				 "qsnet2008tm",
				 "sadguru18d",
				 "school1s",
				 "qsnet2008tm",
				 "prat1shtha",
				 "ansr2017gzb",
				 "niketan1b",
				 "qserp#2nguru",
				 "password3rn",
				 "sps01jinder",
				 "qawsedrf321tg",
				 "sandeep@123s",
				 "national1s",
				 "Tina1986a",
				 "rkvvm$2017QS",
				 "noelschoolakola5e",
				"rkvvm$2017QS",
				"noelschoolakola5e"

				};
		
		/* String Password1 = "server12w";
		 String Password2 = "dpis2017d";
		 String Password3 = "amit#p7lvs";
		 String Password4 = "samsun5ma";
		 String Password5 = "wine1wine";
		 String Password6 = "trial@!2niit";
		 String Password7 = "FEB_23BT";
		 String Password8 = "khargone1s";
		 String Password9 = "burhani1s";
		 String Password10 = "abcdef01s";
		 String Password11 = "qsnet2008tm";
		 String Password12 = "sadguru18d";
		 String Password13 = "school1s";
		 String Password14 = "qsnet2008tm";
		 String Password15 = "prat1shtha";
		 String Password16 = "ansr2017gzb";
		 String Password17 = "niketan1b";
		 String Password18 = "qserp#2nguru";
		 String Password19 = "password3rn";
		 String Password20 = "sps01jinder";
		 String Password21 = "qawsedrf321tg";
		 String Password22 = "sandeep@123s";
		 String Password23 = "national1s";
		 String Password24 = "Tina1986a";
		 String Password25 = "rkvvm$2017QS";
		 String Password26 = "noelschoolakola5e";
*/
		  
		 
		 for (int i=1; i<=26;i++)
		 {	 
		chrome.get(BaseUrl[i] );				
		chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		chrome.manage().window().maximize();
		chrome.findElement(By.id("txtUserName")).sendKeys(Username[i]);
	    chrome.findElement(By.id("txtPassword")).sendKeys(Password[i]);
	    chrome.findElement(By.id("btnLogin")).click();
	    
	    for(int p = 0; p<=50000; p++)
	    {
	    	System.out.print("");
	    }
	    chrome.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	     System.out.println("Value "+i);
	     
		 }
	     
	     
			/*chrome.get(BaseURL2);				
			chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

			chrome.manage().window().maximize();
			chrome.findElement(By.id("txtUserName")).sendKeys(Username2);
		    chrome.findElement(By.id("txtPassword")).sendKeys(Password2);
		    chrome.findElement(By.id("btnLogin")).click();
		    
		    
		    chrome.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		     System.out.println("Value 2");
		     
		     
				chrome.get(BaseURL3);				
				chrome.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

				chrome.manage().window().maximize();
				chrome.findElement(By.id("txtUserName")).sendKeys(Username1);
			    chrome.findElement(By.id("txtPassword")).sendKeys(Password1);
			    chrome.findElement(By.id("btnLogin")).click();
			    
			    
			    chrome.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
			     System.out.println("Value 1");
		     */
	     
	    
	    
	   /* String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
	    chrome.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);*/
	   //chrome.findElement(By.cssSelector("abc")).sendKeys(Keys.CONTROL + "t");

	   	    
	    
	    
}
}
