package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.PunchIn;
import pages.TimePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PunchInTest extends TestBase
{
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	TimePage tp = new TimePage();
	PunchIn pi = new PunchIn();
	@Test(priority=6)
	  public void Note() 
	  {
		  pi.enterNote();
	  }
	  
	  @Test(priority=7)
	  public void In()
	  {
		  pi.clickIn();
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
	  
	  
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}
