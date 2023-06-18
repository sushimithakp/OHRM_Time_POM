package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
import pages.ProjectsPage;
import pages.TimePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ProjectsPageTest extends TestBase
{
	LoginPage lp = new LoginPage();
	HomePage hp = new HomePage();
	TimePage tp = new TimePage();
	ProjectsPage pp = new ProjectsPage();
	
	@Test(priority=10)
	  public void projectInfo() 
	  {
		  pp.clickProjectInfo();
	  }
	  
	  
	  @Test(priority=11)
	  public void projects() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
	  }
	  
	  @Test(priority=12)
	  public void add() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
	  }
	  
	  @Test(priority=13)
	  public void CustomerLink() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
		  pp.clickCustomerLink();
	  }
	  
	  @Test(priority=14)
	  public void cName() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
		  pp.clickCustomerLink();
		  pp.aAddCName();
	  }
		
	
	  @Test(priority=15)
	  public void cDesc() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
		  pp.clickCustomerLink();
		  pp.aAddCName();
		  pp.addCDesc();
	  }
	 
	  @Test(priority=16)
	  public void saveDetails() 
	  {
		  pp.clickProjectInfo();
		  pp.clickProjects();
		  pp.clickAdd();
		  pp.clickCustomerLink();
		  pp.aAddCName();
		  pp.addCDesc();
		  pp.saveCdetail();
	  } 
		@Test(priority=17)
		  public void clickPName() 
		  {
			  pp.clickProjectInfo();
			  pp.clickProjects();
			  pp.clickAdd();
			  pp.clickCustomerLink();
			  pp.aAddCName();
			  pp.addCDesc();
			  pp.saveCdetail();
			  pp.clickProjectName();
		  }
		@Test(priority=18)
		  public void clickPAdmin() 
		  {
			  pp.clickProjectInfo();
			  pp.clickProjects();
			  pp.clickAdd();
			  pp.clickCustomerLink();
			  pp.aAddCName();
			  pp.addCDesc();
			  pp.saveCdetail();
			  pp.clickProjectName();
			  pp.clickProjectAdmin();
		  }
		
		@Test(priority=19)
		  public void clickDesc() 
		  {
			  pp.clickProjectInfo();
			  pp.clickProjects();
			  pp.clickAdd();
			  pp.clickCustomerLink();
			  pp.aAddCName();
			  pp.addCDesc();
			  pp.saveCdetail();
			  pp.clickProjectName();
			  pp.clickProjectAdmin();
			  pp.clickDescription();
		  }
		
		@Test(priority=20)
		  public void cSave() 
		  {
			  pp.clickProjectInfo();
			  pp.clickProjects();
			  pp.clickAdd();
			  pp.clickCustomerLink();
			  pp.aAddCName();
			  pp.addCDesc();
			  pp.saveCdetail();
			  pp.clickProjectName();
			  pp.clickProjectAdmin();
			  pp.clickDescription();
			  pp.clickSave();
		  }
		
  @BeforeMethod
  public void openBrowser() 
  {
	  initialization();
	  lp.loadLoginPageFile();
	  lp.login();
	  hp.loadHomePageFile();
	  hp.clickTime();
	  pp.loadProjectsPageFile();
	  
  }

  @AfterMethod
  public void closeBrowser() 
  {
	  driver.quit();
  }

}
