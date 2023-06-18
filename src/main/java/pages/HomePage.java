package pages;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class HomePage extends TestBase
{
	public TimePage clickTime()
	{
		String time = prop.getProperty("time_loc");
		driver.findElement(By.id(time)).click();
		String title =driver.getTitle();
		System.out.println(title);
		return new TimePage();
	}
	public  void loadHomePageFile()
	{
		FileInputStream fi;
		try 
		{
			
			fi = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time_POM\\src\\main\\java\\config\\HomePageConfig.properties");
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
