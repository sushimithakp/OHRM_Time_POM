package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

import base.TestBase;

public class ProjectsPage extends TestBase
{
	
	public void clickProjectInfo()
	{
		String projectInfo = prop.getProperty("projectInfo_loc");
		driver.findElement(By.id(projectInfo)).click();
		
	}
	public void clickProjects()
	{
		String projects = prop.getProperty("project_loc");
		driver.findElement(By.id(projects)).click();
		
	}
	
	public void clickAdd()
	{
		String add = prop.getProperty("addbtn_loc");
		driver.findElement(By.id(add)).click();
		
	}
	public void clickCustomerLink()
	{
		String cName = prop.getProperty("customerName_loc");
		driver.findElement(By.id(cName)).click();
		
	}
	public void aAddCName()
	{
		String addCName = prop.getProperty("addCustomerName_loc");
		driver.findElement(By.id(addCName)).sendKeys("Nyx");
		
		
	}
	public void addCDesc()
	{
		String addCDescription = prop.getProperty("addCustomerDescription_loc");
		driver.findElement(By.id(addCDescription)).click();
		driver.findElement(By.id(addCDescription)).sendKeys("Bank");
		
	}
	public void saveCdetail()
	{
		String saveCDetail = prop.getProperty("saveDetails_loc");
		driver.findElement(By.id(saveCDetail)).click();
		
		
	}
	public void clickProjectName()
	{
		String pName = prop.getProperty("addProjectName_loc");
		driver.findElement(By.id(pName)).sendKeys("BankApp");
		
		
	}
	public void clickProjectAdmin()
	{
		String pAdmin = prop.getProperty("addProjectAdmin_loc");
		driver.findElement(By.id(pAdmin)).sendKeys("Sushmitha bhojappa");
		
	
	}
	public void clickDescription()
	{
		String description = prop.getProperty("addProjectDescription_loc");
		driver.findElement(By.id(description)).sendKeys("Bank Application");
		
	}
	public void clickSave()
	{
		String save = prop.getProperty("save_loc");
		driver.findElement(By.id(save)).submit();
		
	}
	public void clickCancel()
	{
		String cancel = prop.getProperty("cancel_loc");
		driver.findElement(By.id(cancel)).click();
		
		
	}
	public  void loadProjectsPageFile()
	{

		
		FileInputStream fi;
		try 
		{
			
			fi = new FileInputStream("Z:\\Selenium_EXLR\\OrangeHRM_Time_POM\\src\\main\\java\\config\\ProjectsPageConfig.properties");
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
