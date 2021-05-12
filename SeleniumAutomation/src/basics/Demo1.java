package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("user");
		driver.findElement(By.className("login_Btn")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();

	}

}
