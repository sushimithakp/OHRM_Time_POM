package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;



import base.TestBase;

public class TimePage extends TestBase
{
	
	
	
	public void attendance()
	{
		String attendance = prop.getProperty("attendance_loc");
		driver.findElement(By.id(attendance)).click();
		
		
	}
	
	public PunchIn punchInOut()
	{
		
		String punchInOut = prop.getProperty("punchInOut_loc");
		driver.findElement(By.id(punchInOut)).click();
		return new PunchIn();
	}
	public  void loadTimePageFile()
	{
		FileInputStream fi;
		try 
		{
			
			fi = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time_POM\\src\\main\\java\\config\\TimePageConfig.properties");
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
