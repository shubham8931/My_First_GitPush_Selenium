package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwitterTest {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement ele1 = driver.findElement(By.cssSelector("input[type='text']"));
		System.out.println(ele1.isDisplayed());
		
		WebElement ele2 = driver.findElement(By.cssSelector("input[type='password']"));
		System.out.println(ele2.isDisplayed());
		WebElement ele3 = driver.findElement(By.xpath("(//span[text()='Log in'])[1]"));
		System.out.println(ele3.isEnabled());
		System.out.println("passed........");
		driver.close();

	}

}
