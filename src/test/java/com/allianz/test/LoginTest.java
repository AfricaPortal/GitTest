package com.allianz.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.allianz.base.AutomationWrapper;

public class LoginTest extends AutomationWrapper {
	
	@Test
	public void validLoginTest() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("-----------------------");

		
	}
	@Test
	public void invalidLoginTest() {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin23");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String invalidmsg = driver.findElement(By.xpath("//p[text() = 'Invalid credentials']")).getText();
		System.out.println(invalidmsg);
	}

}
