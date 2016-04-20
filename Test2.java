package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		
		//Create an object for Firefox
		FirefoxDriver driver = new FirefoxDriver();
		//Get url
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		//implicit waiting time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Maximize the browser
		driver.manage().window().maximize();
		//Get Title
		System.out.println(driver.getTitle());
		//Enter Useername
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		//Click login
		driver.findElementByClassName("decorativeSubmit").click();	
		//Click logout
		driver.findElementByXPath("//*[@id='logout']/input").click();
		
		driver.close();
		}
}
