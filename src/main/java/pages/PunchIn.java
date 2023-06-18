package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class PunchIn extends TestBase
{
	public void enterNote() 
	{
		String note = prop.getProperty("note_loc");
		driver.findElement(By.id(note)).sendKeys("GoodMorning");
	}
	
	public PunchOut clickIn()
	{
		String in = prop.getProperty("punchIn_loc");
		driver.findElement(By.id(in)).click();
		return new PunchOut();
	}
	public  void loadPunchInFile()
	{
		FileInputStream fi;
		try 
		{
			
			fi = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time_POM\\src\\main\\java\\config\\PunchInConfig.properties");
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
