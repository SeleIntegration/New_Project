package MyFirstProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.ElectronicsPage2;
import pageObjects.LoginPage;
import resources.Base;

public class Validate extends Base{
	
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
		LoginPage lpage=new LoginPage(driver);
		lpage.closeButton().click();
		lpage.searchText().sendKeys("Electronics Items");
		lpage.searchText().sendKeys(Keys.ENTER);
		log.info("Enter key pressed");
		ElectronicsPage2 el=new ElectronicsPage2(driver);
		Actions act=new Actions(driver);
		act.moveToElement(el.titleFun()).perform();
		act.moveToElement(el.itemFun()).click().perform();
		log.info("Samsung option clicked");
		
	}	
	
	@AfterTest
	public void done()
	{
		driver.close();
	}

}
