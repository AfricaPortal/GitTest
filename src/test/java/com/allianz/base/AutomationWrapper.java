	package com.allianz.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class AutomationWrapper {
	
protected	WebDriver driver;

@BeforeMethod
	 public void initialize()
	 {
	driver = new ChromeDriver ();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	 }

public void teardown() {
	driver.quit();
}

}
