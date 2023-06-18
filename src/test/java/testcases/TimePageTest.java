package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.TimePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TimePageTest extends TestBase
{
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	TimePage tp = new TimePage();
	
   @Test(priority=4)
   public void clickAttendance()
   {
		  tp.attendance();
   }
   @Test(priority=5)
   public void clickOnPunchInOut()
   {
	   tp.attendance();
	   tp.punchInOut();
   }
   
  @BeforeMethod
  public void openBrowser() 
  {
	  initialization();
	  lp.loadLoginPageFile();
	  lp.login();
	  hp.loadHomePageFile();
	  hp.clickTime();
	  tp.loadTimePageFile();
	  
	 
  }

  @AfterMethod
  public void closeBrowser()
  {
	  driver.quit();
  }

}
