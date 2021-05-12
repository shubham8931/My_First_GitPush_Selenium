package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SkillRaryDropdown {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("cars"));
		Select s = new Select(ele);
		s.selectByIndex(2);
		s.selectByValue("399");
		List<WebElement> optios = s.getOptions();
		System.out.println(optios.size());
		for(WebElement allOptions : optios)
		{
			System.out.println(allOptions.getText());
		}
		//System.out.println(optios.);
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectByIndex(2);
			s.deselectByValue("399");
		}
		driver.close();

	}

}
