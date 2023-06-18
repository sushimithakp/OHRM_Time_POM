package testcases;

import org.testng.annotations.Test;
import base.TestBase;
import pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase
{   
	
     LoginPage lp = new LoginPage();
     
	 @Test(priority=1)
	  public void title()
	  {
		 String title =lp.getLoginPageTitle();
		 Assert.assertEquals(title, prop.getProperty("title"));
		 System.out.println(title);
	  }
	  
	  @Test(priority=2)
	  public void loginSuccess()
	  {
		  lp.login();
	  }
  @BeforeMethod
  public void launchURL() 
  {
	  initialization();
	  lp.loadLoginPageFile();
	 
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}
