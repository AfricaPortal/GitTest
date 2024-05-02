package com.allianz.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {

	


//	 public void initialize()
//	 {
//	driver = new ChromeDriver ();
//	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    driver.manage().window().maximize();
//		 
//	 }

	@Test
	public void titletest() {
		System.out.println("the title is : ");
		String actualvalue = driver.getTitle();
		//String gettext = driver.findElement(By.xpath("//p[contains(normalize-space(), 'OS')]")).getText();

		// Assert.assertEquals(gettext, "OS", "This is wrong");
		Assert.assertEquals(actualvalue, "OrangeHRM");

	}

	@Test
	public void Applicationdescription() {
		System.out.println("Description is : ");
	}
	
	
	@AfterMethod
	public void closure() {
		driver.quit();
	}

}
