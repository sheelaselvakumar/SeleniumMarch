package week1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

public class IRCTC 
{

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf?BV_SessionID=@@@@1674814468.1458755921@@@@&BV_EngineID=ccchadgilkgfdghcefecehidfgmdfkn.0");
		//maximise browser
		driver.manage().window().maximize();
		//Enter the user name
		driver.findElementById("userRegistrationForm:userName").sendKeys("Sheelasaravanan");
		//Enter the password
		driver.findElementById("userRegistrationForm:password").sendKeys("Nannu123");
		//confirm password
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Nannu123");
		//enter security question
		driver.findElementById("userRegistrationForm:securityQ").sendKeys("What is your pet name?");
		//enter the security answer
		driver.findElementByName("userRegistrationForm:securityAnswer").sendKeys("Alex");
		//enter the preferred language
		driver.findElementByName("userRegistrationForm:prelan").sendKeys("English");
		//enter first name
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sheela");
		//enter middle name
		driver.findElementById("userRegistrationForm:middleName").sendKeys("S");
		//enter last name
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Saravanan");
		//select the radio button for gender
		driver.findElementById("userRegistrationForm:gender:1").click();
		//select the radio button for marital status
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		//enter dob day
		driver.findElementByName("userRegistrationForm:dobDay").sendKeys("03");
		//enter dob month
		driver.findElementByName("userRegistrationForm:dobMonth").sendKeys("SEP");
		//enter dob year
		driver.findElementByName("userRegistrationForm:dateOfBirth").sendKeys("1991");
		//enter occupation
		driver.findElementById("userRegistrationForm:occupation").sendKeys("Professional");
		//enter email
		driver.findElementById("userRegistrationForm:email").sendKeys("sheelaselvakumar14@gmail.com");
		//enter mobile
		driver.findElementByName("userRegistrationForm:mobile").sendKeys("9791919589");
		//enter nationality
		driver.findElementById("userRegistrationForm:nationalityId").sendKeys("India");
		//enter address 
		driver.findElementById("userRegistrationForm:address").sendKeys("MIG-4,akshaya apartments");
		//select country
		driver.findElementById("userRegistrationForm:countries").sendKeys("India");
		//enter pincode
		driver.findElementById("userRegistrationForm:pincode").sendKeys("603204");
		//enter state
		Thread.sleep(6000);
		driver.findElementByXPath("//*[@id='userRegistrationForm:j_idt152_body']/table/tbody/tr[3]/td/table/tbody/tr[13]/td[1]/label").click();
		Thread.sleep(6000);
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("TAMILNADU");
	    //Thread.sleep(6000);
		//enter city name
		Select dropdowncity=new Select(driver.findElementById("userRegistrationForm:cityName"));
		dropdowncity.selectByValue("Kanchipuram");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(6000);
		//enter P.O
		Select dropdownpost=new Select(driver.findElementById("userRegistrationForm:postofficeName"));
		dropdownpost.selectByValue("Singaperumalkoil S.O");
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("0444413319");
		//enter copy to office address radio button
		
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
			
		//close the browser
		driver.close();
		
	

	}

}
