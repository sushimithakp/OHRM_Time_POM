package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class WeekTimeSheet extends TestBase
{
	public void clickEdit()
	{
		String edit = prop.getProperty("edit_loc");
		driver.findElement(By.id(edit)).click();
		
	}
	
	public void addRow()
	{
		String addRow = prop.getProperty("addRow_loc");
		driver.findElement(By.id(addRow)).click();
		
	}
	public void reset()
	{
		String reset = prop.getProperty("reset_loc");
		driver.findElement(By.id(reset)).click();
		
	}
	public void cancel()
	{
		String cancel = prop.getProperty("cancel_loc");
		driver.findElement(By.id(cancel)).click();
		
	}
	
	public  void loadWeekTimeSheetFile()
	{

		
		FileInputStream fi;
		try 
		{
			
			fi = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time_POM\\src\\main\\java\\config\\WeekTimeSheetConfig.properties");
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
