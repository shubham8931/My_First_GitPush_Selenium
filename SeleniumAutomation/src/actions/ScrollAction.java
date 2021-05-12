package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			//Typecasting
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0, 4000)");
			
			System.out.println("Scrolled down...");
			
			js.executeScript("window.scrollBy(0, -4000)");
			
			System.out.println("Scrolled up...");
			
			driver.close();
	}

}
