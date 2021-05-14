package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.jq.ReporterPanel;

public class Demo {
	@Test
	public void demo()
	{
		Reporter.log("Hello Selenium", true);
	}
}
