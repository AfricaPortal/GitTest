package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	
	@Test
	public void validLoginTest() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actualheader = driver.findElement(By.xpath("/h6[contains(normalize-space(),'Dash')]")).getText();
		Assert.assertEquals(actualheader, "Dashboard");
		System.out.println("-----------------------");

		
	}
	
	@DataProvider
	public Object[][] validdata(){
	Object[][]data = new String[3][2];
	
	
data[0][0]="Saul";
data[0][1]="Saul";

data[1][0]="Saul";
data[1][1]="Saul";

data[2][0]="Saul";
data[2][1]="Saul";
return data;
	}


	
	
	//@Test(dataProvider="validdata",dataProviderClass=DataUtils.class)
	public void invalidLoginTest(String user,String pass) {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String invalidmsg = driver.findElement(By.xpath("//p[contains(normalize-space(), 'Invalid credentials']")).getText();
		Assert.assertEquals(invalidmsg, "Invalid credentials");

		System.out.println(invalidmsg);
	}

}
