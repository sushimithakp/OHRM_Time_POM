package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.TimePage;
import pages.TimeSheet;
import pages.WeekTimeSheet;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class WeekTimeSheetTest extends TestBase
{
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	TimePage tp = new TimePage();
	TimeSheet ts = new TimeSheet();
	WeekTimeSheet wts = new WeekTimeSheet();
	
	@Test(priority=24)
	  public void edit()
	  {
		  wts.clickEdit();
	  }
	  
	  @Test(priority=25)
	  public void clickAddRow()
	  {
		  wts.clickEdit();
		  wts.addRow();
	  }
	  
	  
	  
	  @Test(priority=26)
	  public void clickReset()
	  {
		  wts.clickEdit();
		  wts.reset();
	  }
	  @Test(priority=27)
	  public void clickCancel()
	  {
		  wts.clickEdit();
		  wts.cancel();
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
	  ts.getTimeSheet();
	  ts.enterEmployee();
	  ts.viewRecord();
	  wts.loadWeekTimeSheetFile();
  }

  @AfterMethod
  public void closeBrowser()
  {
	  driver.quit();
  }

}
