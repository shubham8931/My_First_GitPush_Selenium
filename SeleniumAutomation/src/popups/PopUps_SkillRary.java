package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUps_SkillRary {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("course"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()= 'Selenium Training']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		Thread.sleep(4000);
		Alert a1 = driver.switchTo().alert();
		
		System.out.println(a1.getText());
		Thread.sleep(4000);
		a1.accept();
		driver.close();
		
		
		

	}

}
