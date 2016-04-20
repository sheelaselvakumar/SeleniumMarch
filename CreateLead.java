package week1;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead 
{

	public static void main(String[] args) throws InterruptedException
	
	{
		//open browser and get URL
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo1.opentaps.org/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");//enter username
		driver.findElementById("password").sendKeys("crmsfa");//enter pwd
		driver.findElementByClassName("decorativeSubmit").click();
		Thread.sleep(3000);
		
		driver.findElementByXPath("//*[@id='button']/a/img").click();//click on crm button
		driver.findElementByLinkText("Create Lead").click();//click on create lead
		driver.findElementById("createLeadForm_companyName").sendKeys("Leaf");//enter company name
		driver.findElementById("createLeadForm_firstName").sendKeys("Test");//enter firstname
		driver.findElementById("createLeadForm_lastName").sendKeys("justjelly");//enter last name
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Conference");//enter source drop down
		Select marketingdropdown=new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		marketingdropdown.selectByValue("CATRQ_AUTOMOBILE");//select value from drop down
		//driver.findElementById("createLeadForm_birthDate-button").click();
		driver.findElementById("createLeadForm_birthDate").sendKeys("03/03/16");
		driver.findElementByClassName("smallSubmit").click();
		
		
		
		

	}

}
