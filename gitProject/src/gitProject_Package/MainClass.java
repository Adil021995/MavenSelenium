package gitProject_Package;

public class MainClass
{
   public static void main(String[] args) throws Exception 
   {
	   Input_SendKeys obj = new Input_SendKeys();
	   obj.openUrl();
	   obj.displayInfo();
	   obj.sendKeys();
	   obj.logout();
   }
}
