package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonAct {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		   WebElement ele = driver.findElement(By.name("url"));
		   Actions a = new Actions(driver);
		   a.contextClick(ele).perform();
		   Thread.sleep(5000);
		   driver.close();
		 
	}

}
