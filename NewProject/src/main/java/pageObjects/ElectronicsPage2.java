package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElectronicsPage2 {
	
	public WebDriver dritit;
	By title=By.xpath("//a[@title='Electronics']/span[1]");
	By item=By.xpath("//a[@title='Samsung']/span[1]");
	public ElectronicsPage2(WebDriver driver) {		
		dritit=driver;
	}

	public WebElement titleFun()
	{
		
		return dritit.findElement(title);
	}
	
	public WebElement itemFun()
	{
		return dritit.findElement(item);
	}
	
}
