package week1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver4= new ChromeDriver();
		driver4.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver4.findElementByLinkText("Contact Us").click();//entering contact link
		
		//switch to second window
		Set<String> newwindow=driver4.getWindowHandles();// set is created to get the collection of all window handles
		//int i=1;
		
		for (String eachwindow : newwindow) // iterating for each window
		{
			driver4.switchTo().window(eachwindow);
			//i++;
			}
		//if(i==2) // perform this for the second window
		{
			System.out.println("The windowhandle is "+driver4.getWindowHandle());
			System.out.println("the url of the current window is "+driver4.getCurrentUrl());
			///Thread.sleep(3000);	
		}
		
		driver4.quit();
		

	}
}
