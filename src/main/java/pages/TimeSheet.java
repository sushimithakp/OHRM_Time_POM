package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;



import base.TestBase;

public class TimeSheet extends TestBase
{
	public void getTimeSheet()
	{
		String timeSheet = prop.getProperty("timeSheet_loc");
		driver.findElement(By.id(timeSheet)).click();
		
	}
	
	public void enterEmployee()
	{
		String eName = prop.getProperty("eName_loc");
		driver.findElement(By.id(eName)).click();
		driver.findElement(By.id(eName)).sendKeys("s");
		String suggestion = prop.getProperty("suggestion_loc");
		driver.findElement(By.xpath(suggestion)).click();
		
	}
	
	public WeekTimeSheet viewRecord()
	{
		String view = prop.getProperty("view_loc");
		driver.findElement(By.id(view)).click();
		return new WeekTimeSheet();
	}
	public  void loadTimeSheetFile()
	{

		
		FileInputStream fi;
		try 
		{
			
			fi = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time_POM\\src\\main\\java\\config\\TimeSheetConfig.properties");
			prop = new Properties();
			prop.load(fi);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}

	}
}
