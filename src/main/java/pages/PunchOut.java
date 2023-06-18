package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;


import base.TestBase;

public class PunchOut extends TestBase
{
	public void clickNote()
	{
		String note = prop.getProperty("note_loc");
		driver.findElement(By.id(note)).sendKeys("ThankYou");
		
	}
	
	public PunchIn clickOut()
	{
		String outbtn = prop.getProperty("out_loc");
		driver.findElement(By.id(outbtn)).click();
		return new PunchIn();
		
	}
	public  void loadPunchOutFile()
	{
		FileInputStream fi;
		try 
		{
			
			fi = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time_POM\\src\\main\\java\\config\\OunchOutConfig.properties");
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
