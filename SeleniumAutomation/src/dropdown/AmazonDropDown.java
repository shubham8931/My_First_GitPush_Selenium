package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

	public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	   WebElement ele = driver.findElement(By.name("url"));
		
		Select sel = new Select(ele);
		List<WebElement> option = sel.getOptions();
		System.out.println(option.size());
		for(WebElement allOptions : option)
		{
			System.out.println(allOptions.getText());
		}
		

	}

}
