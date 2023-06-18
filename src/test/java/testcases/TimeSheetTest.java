package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.TimePage;
import pages.TimeSheet;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TimeSheetTest extends TestBase
{
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	TimePage tp = new TimePage();
	TimeSheet ts = new TimeSheet();
	
	
	@Test(priority=21)
	  public void timeSheet() 
	  {
		  ts.getTimeSheet();
		  
	  }
	  @Test(priority=22)
	  public void employee()
	  {
		  ts.enterEmployee();
	  }
	  
	  @Test(priority=23)
	  public void getRecord()
	  {
		  ts.viewRecord();
	  }
	  
  @BeforeMethod
  public void openBrowser() 
  {
	  initialization();
	  lp.loadLoginPageFile();
	  lp.login();
	  hp.loadHomePageFile();
	  hp.clickTime();
	  ts.loadTimeSheetFile();
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}
