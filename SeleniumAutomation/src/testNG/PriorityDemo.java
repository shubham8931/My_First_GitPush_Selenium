package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority = 3, invocationCount = 4)
	public void call()
	{
		Reporter.log("calling", true);
	}
	
	@Test(priority = 2, enabled = false)
	public void chat()
	{
		Reporter.log("chatting", true);
	}
	
	@Test(priority = 1)
	public void test()
	{
		Reporter.log("Hiiii", true);
	}

}
