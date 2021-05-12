package lacators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("button[class ='button buttonBlue']")).click();
		System.out.println("---------------");
		//driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
		
		driver.findElement(By.cssSelector("span[class='fa fa-user']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		System.out.println("===============");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("vtiger"))
		{
			System.out.println("Passed!!!");
		}
		else
		{
			System.out.println("Failed....");
		}
		
		Thread.sleep(3000);
		driver.close();

	}

}
