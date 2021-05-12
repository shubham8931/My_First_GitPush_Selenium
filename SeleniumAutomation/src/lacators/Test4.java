package lacators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//Verification
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Passed!!!");
		}
		else {
			System.out.println("Failed....");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.id("welcome")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

	}

}
