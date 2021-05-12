package dropdown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookDropDown {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        
        WebElement ele = driver.findElement(By.xpath("//select[@title = 'Month']"));
        
        Select s = new Select(ele);
        List<WebElement> option = s.getOptions();
        
        ArrayList a = new ArrayList<>();
        
        for(WebElement AllOptions : option)
        {
        	String text = AllOptions.getText();
        	System.out.println(text);
        	a.add(text);
        }
        
        System.out.println("**** After sorting ****");
        Collections.sort(a);
        for(Object SortedList:a )
        {
        	System.out.println(SortedList);
        }
        driver.close();
	}

}
