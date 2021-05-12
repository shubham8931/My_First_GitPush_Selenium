package lacators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("shubhamth8931@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tulasi8931");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		driver.findElement(By.cssSelector("div[class='j83agx80 l9j0dhe7']")).click();
		driver.findElement(By.xpath("(span[@class='d2edcug0 hpfvmrgz qv66sw1b c1et5uql lr9zc1uh a8c37x1j keod5gw0 nxhoafnm aigsh9s9 d3f4x2em fe6kdd0r mau55g9w c8b282yb iv3no6db jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m'])[5]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Passed!!!!!!!!");
		}
		else {
			System.out.println("Failed.......");
		}
		
		driver.close();
	}
}
	