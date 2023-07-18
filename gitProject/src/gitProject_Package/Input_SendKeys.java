package gitProject_Package;

import org.openqa.selenium.By;

public class Input_SendKeys extends OpenUrl
{
    public void sendKeys() throws Exception
    {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("adil@gmail.com");
    	
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id = 'pass']")).sendKeys("Adil021995");	
    }
    
    public void logout()
    {
    	driver.quit();
    }
}
