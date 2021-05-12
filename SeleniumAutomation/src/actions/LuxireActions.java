package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LuxireActions {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://luxire.com/");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 WebElement ele = driver.findElement(By.xpath("//a[text()='Jackets']"));
		 Actions a = new Actions(driver);
		 a.moveToElement(ele).perform();
		 driver.findElement(By.xpath("(//a[text()='Jackets'])[2]"));
		 System.out.println("passed.....");
		 driver.close();

	}

}
