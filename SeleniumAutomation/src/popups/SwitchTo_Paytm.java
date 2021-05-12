package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Paytm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div[data-reactid='46']")).click();
	//	Thread.sleep(3000);
		driver.switchTo().frame(1);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		System.out.println("=========");
		driver.findElement(By.xpath("//span[contains(text(),' Google Play')]")).click();
		driver.close();

	}

}
