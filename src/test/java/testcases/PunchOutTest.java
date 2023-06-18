package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.PunchIn;
import pages.PunchOut;
import pages.TimePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PunchOutTest extends TestBase
{
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	TimePage tp = new TimePage();
	PunchIn pi = new PunchIn();
	PunchOut po = new PunchOut();
	
	  @Test(priority=8)
	  public void enterNote() 
	  {
		  po.clickNote();
	  }
	  
	  @Test(priority=9)
	  public void Out()
	  {
		  po.clickOut();
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
	  tp.attendance();
	  tp.punchInOut();
	  pi.loadPunchInFile();
	  pi.clickIn();
	  po.loadPunchOutFile();
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}
