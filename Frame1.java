package week1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1

{

	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver3= new ChromeDriver();
		driver3.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
        try {
			driver3.switchTo().frame("iframeResult");
			
			
				driver3.findElementByTagName("Button").click();
				Alert a = driver3.switchTo().alert();
				a.dismiss();
				System.out.println("this line is after dismiss");
		} 
        catch (Exception e) {
			// TODO Auto-generated catch block
        	System.out.println("hi");
			//e.printStackTrace();
		}
					// TODO Auto-generated catch block
			
		
        
        System.out.println(driver3.findElementById("demo").getText());
        
       if(driver3.findElementById("demo").getText().contains("Cancel"))
       {
    	   System.out.println("Link Text contains Cancel");
       }
       else
       {
    	   System.out.println("Link Text does not contain Cancel");
       }
	
	}
	

}
