package week1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//set property for chrome drive
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver1 =new ChromeDriver();//object initiate for chrome driver
		driver1.get("https://www.google.co.in");//get url
		List <WebElement> links =driver1.findElementsByTagName("a");// find list by tag name
		System.out.println("count of links"+links.size());// no of links	
		for (WebElement webElement : links) // iterate for each web element
		{	 if( webElement.getAttribute("href").contains("c"))
		 {
			 if(webElement.getLocation().getX() >50)
			 { if(webElement.getSize().getWidth()>20)
				 {System.out.println("opening the link"+ webElement.getText()); 
					 webElement.click();
					 break;
				 }
				 else
				 {	System.out.println("no links match found");
						
				 } } }}
		
		Thread.sleep(3000);
		driver1.close();
}}
