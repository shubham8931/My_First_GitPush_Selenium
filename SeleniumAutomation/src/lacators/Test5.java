package lacators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Verification
		
		if(title.equals("Swag Labs"))
		{
			System.out.println("Passed!!!");
		}
		else {
			System.out.println("Failed....");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(4000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		Thread.sleep(3000);
		
		driver.close();

	

	}

}
