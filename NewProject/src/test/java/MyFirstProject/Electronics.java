package MyFirstProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.ElectronicsPage;
import pageObjects.LoginPage;
import resources.Base;

public class Electronics extends Base{
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void common() throws IOException
	{
		driver=initialFunc();
		driver.get(p.getProperty("URL"));
		
	}
	
	@Test
	public void deriveFunc() throws IOException, InterruptedException
	{
		ElectronicsPage e=new ElectronicsPage(driver);
		LoginPage lpage=new LoginPage(driver);
		lpage.closeButton().click();
		System.out.println(e.imageFun().isDisplayed());
		log.info("Boolean value printed");
		Assert.assertTrue(e.imageFun().isSelected());
		
	}
	
	@AfterTest
	public void done()
	{
		driver.close();
	}
	

	
	
	

}
