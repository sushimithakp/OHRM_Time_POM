package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class HomePageTest extends TestBase
{
	 LoginPage lp = new LoginPage();
	 HomePage hp = new HomePage();
  
  @Test(priority=3)
  public void getTimePage()
  {
	  hp.clickTime();
  }
  @BeforeMethod
  public void openBrowser()
  {
	  initialization();
	  lp.loadLoginPageFile();
	  lp.login();
	  hp.loadHomePageFile();
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}
