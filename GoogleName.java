package week1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleName {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver2= new ChromeDriver();
		driver2.get("https://www.google.co.in");
		driver2.findElementById("lst-ib").sendKeys("sheelaselvakumar");
		driver2.findElementByClassName("sbico").click();
		Thread.sleep(9000);
		List <WebElement> namelinks= driver2.findElementsByTagName("a");
		System.out.println("the no of links are"+ namelinks.size());
		for (WebElement links : namelinks) 
		{
			if((links.getText().contains("Sheela"))||(links.getText().contains("sheela")))
			
			//if((links.getAttribute("href").contains("sheela"))|| (links.getAttribute("href").contains("SHEELA"))) // shows exception
			{
			System.out.println(links.getAttribute("href"));
			}
		}
		
	}
	}