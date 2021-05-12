package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.eclipse.org/downloads/");
	
		
		//title of the application
		String title = driver.getTitle();
		System.out.println(title);
		
		//url of the application
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.close();
	}

}
