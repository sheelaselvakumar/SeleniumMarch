package week1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DeveloperForceSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open browser
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
		driver.manage().window().maximize();
		//enter first name
		driver.findElementById("first_name").sendKeys("Sheela");
		//enter last name
		driver.findElementById("last_name").sendKeys("Saravanan");
		//enter email
		driver.findElementByName("user[email]").sendKeys("sheelaselvakumar14@gmail.com");
		//enter role
		driver.findElementByName("user[job_role]").sendKeys("Developer");
		//enter company
		driver.findElementByName("user[company]").sendKeys("Capgemini");
		//enter country
		driver.findElementByName("user[country]").sendKeys("India");
		//enter postal code
		driver.findElementById("postal_code").sendKeys("603204");
		//enter user @company.com
		driver.findElementByName("user[username]").sendKeys("sheela@xyz.com");
		
		driver.findElementById("eula").click();
		
		driver.findElementById("submit_btn").click();
		System.out.println("signup done now trying to login");
		
		driver.close();
		
		//Login
		
		//new firefox driver
		
		FirefoxDriver driver1=new FirefoxDriver();
		driver1.get("https://login.salesforce.com/?startURL=%2Fsetup%2Fsecur%2FRemoteAccessAuthorizationPage.apexp%3Fsource%3DCAAAAVOlZ_HUME8wMTAwMDAwMDA0QzkzAAAAyPR-mGUQcroX-HGdEj85SIFnETEOhvPh2H0A44dpkQPnJX_vD1atfSuOkHi-MfGSTcXhOy4tsVBWTw34V5k8j6VVgOzxQPTUTW87VTYHTWCTWwSaVoeqRJqCgC5qtCLbGJCgi1H1fOJvN17kzXRK5spX9mSUxxtrd7HFv43Rlz7YYQ2U6zNl3jDd3Hz6i3yDEtkeMGrwSAjZ0aHYXKhx-q8Nqb4U-1gbNjptNEqPbOoPSKvN_bIT6VjFdqlYDGGFL2yi6dct0yOxDUpJ8TPynEDdXGrLPjBb_2iC0CJpUhjcFMHx_589_er5o8tUfKYyJVEA2Hd59B3N1AFqpH5rM-euHvrZAHSq24fV3nKJMATYmkaBxaVoBkQK8uajWE0bhnQHenbz71YwaxxSSvQ5yKUclaN2l0izK2xUvxRKnIlABM8SlKGU0SLId1-XHAh5yYrII2rb7MrBVkTO5yOZoy-dJRBsuoo39nQ5zijkvgecLN96csqf4DMTC4crRck4L--t0CDXN4q87Esio9uklGimMTNBEqAVDFcsSsSeMv9gwycAk4nIrav8TY0EA-zCdGXmvQFJh2YlIke3tcctJZoYY0UjpHIY8gFk2fDDpxH8B25mmNiYtqL4qQRSmVwSucp7LiUZH_D-DT_6DyzWrmaWNDdYCPAS0NP_w8_yooHyl51T6RQ7mmDs3eU9DqVwqajcfPl7xUaEYwZEP1198GICQikUsEe5be1eHKUfNcye3lnaOEreEHAW8HqEF74X_D_4tPMUWVA85zMyYaPhH_DiECjBOzUDa3YRsr0MzzlTW0R_BLJkiFBXIKZnfMrTzC0znb-Yav_YQsHzo6rV8CulxNEcFy30MQeYpE5KJyFjYRu6nVCbLAmm9VsQEeAVcIEDTUwYHZOG46uxyRIHV9WkHeIJVRgk6CSfsu8a7f-EQ_hVahwSL5qUebnzoZQMHhSUsPBgfqOy01muKu9vnmqqMOhs7FvlJLoOb-jccuwMND8IWmacpomx2YUd3sByeyhQKiwRC6CR3pok4mTXMFSoNCvxHOnMMwIMRm4s-Rn8OzVGPEWMYjOwJUoeLOA9qstTM9lkI6HIALuFddViHDIdaEkmqKFDoScli0ltbV-D&sdtd=1");
		driver1.manage().window().maximize();
		driver1.findElementById("username").sendKeys("Sheela");
		driver1.findElementById("password").sendKeys("Nairiti123");
		driver1.findElementByName("rememberUn").click();
		driver1.findElementById("Login").click();
		
		driver1.close();
		
				
	}

}
