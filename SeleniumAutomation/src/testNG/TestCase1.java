package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {
	 WebDriver driver;
	 
	 @BeforeMethod
	 public void openBrowser()
	 {
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost/login.do");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	 }
    
	 @Test
	 public void openApp()
	 {
		 
		    driver.findElement(By.id("username")).sendKeys("user");
			driver.findElement(By.name("pwd")).sendKeys("user");
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
			driver.findElement(By.id("logoutLink")).click();
			String title = driver.getTitle();
			Assert.assertEquals(title, "actiTIME - Login");
			Reporter.log(title, true);
			String url = driver.getCurrentUrl();
			Reporter.log(url, true);
	 }
	 
	 @AfterMethod
	 public void closeApp()
	 {
		 driver.close();
	 }
}
