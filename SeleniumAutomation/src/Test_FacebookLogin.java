import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_FacebookLogin {

		public static void main(String[] args) {

			System.out.println("Program Started");
			//WebDriverManag.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			driver.get("http://www.facebook.com");
			
		}

	}



