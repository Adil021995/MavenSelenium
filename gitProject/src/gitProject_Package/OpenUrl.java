package gitProject_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrl 
{
   public String baseUrl = "https://www.facebook.com/";
   public String driverPath = "F:\\SELENIUM - jarfiles\\chrome-driver\\chromedriver.exe";
   public WebDriver driver;
   
   public void openUrl()
   {
	   System.setProperty("webdriver.chrome.driver", driverPath);
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   driver.get(baseUrl);
   }
   
   public void displayInfo()
   {
	   String url = driver.getCurrentUrl();
	   System.out.println("Current Url = "+url);
	   
	   String title = driver.getTitle();
	   System.out.println("Title = "+title);
   }
}
