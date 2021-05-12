package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.cssSelector("input[class = 'desktop-searchBar']"));
		System.out.println(ele.getText());
		Point loc = ele.getLocation();
		System.out.println("X coordinate :"+loc.x);
		System.out.println("Y coordinate :"+loc.y);
		driver.close();

	}

}
