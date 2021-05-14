package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverSkillRary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//span[text()='GEARS']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
	  driver.findElement(By.xpath("//a[contains(text(),' SkillRary Demo APP')]")).click();
			  
		WebElement ele1 = driver.findElement(By.cssSelector("button[class = 'dropbtn']"));
		a.moveToElement(ele1).perform();
		driver.findElement(By.xpath("//a[text()= 'Selenium Training']")).click();
		driver.close();
	

	}

}
