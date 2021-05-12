package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excelDataSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream f =new FileInputStream("./excelDataSheet.xlsx");
		
		Workbook wb = WorkbookFactory.create(f);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("username")).sendKeys(username);
		
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		
		driver.findElement(By.name("pwd")).sendKeys(password);
		
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(4000);
		driver.close();

	}

}
