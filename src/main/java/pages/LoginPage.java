package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import base.TestBase;

public class LoginPage extends TestBase
{
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	public HomePage login()
	{
		String usr = prop.getProperty("usr_loc");
		String pwd = prop.getProperty("pwd_loc");
		String btn = prop.getProperty("loginbutton_loc");
		String usrname = prop.getProperty("username");
		String password = prop.getProperty("password");
		driver.findElement(By.id(usr)).sendKeys(usrname);
		driver.findElement(By.id(pwd)).sendKeys(password);
		driver.findElement(By.id(btn)).click();
		return new HomePage();
	}

	
	public  void loadLoginPageFile()
	{
		FileInputStream fi;
		try 
		{
			
			fi = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time_POM\\src\\main\\java\\config\\LoginPageConfig.properties");
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
