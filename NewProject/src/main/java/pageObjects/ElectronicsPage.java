package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElectronicsPage {
	
	public WebDriver driele;
	By imageloc=By.xpath("//a[@class='_2OJxl5']/img");
	public ElectronicsPage(WebDriver driver) {		
		driele=driver;
	}

	public WebElement imageFun()
	{
		
		return driele.findElement(imageloc);
	}
	
}
