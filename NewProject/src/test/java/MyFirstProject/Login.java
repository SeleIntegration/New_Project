package MyFirstProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.Base;

public class Login extends Base{
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
		LoginPage p1=new LoginPage(driver);
		p1.getLogin().sendKeys("ABCD");
		p1.getPwd().sendKeys("XYZ123");
		p1.signIn().click();
		p1.closeButton().click();
		log.info("Login small window closed");
		p1.searchText().sendKeys("Electronics Items");
		p1.searchText().sendKeys(Keys.ENTER);
		log.info("Enter key pressed to serach");
	}
	
	@AfterTest
	public void done()
	{
		driver.close();
	}
	
	

}
