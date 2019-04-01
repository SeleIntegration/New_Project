package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver drilog;
	By uname=By.className("_2zrpKA");
	By pwd= By.xpath("//input[@class='_2zrpKA _3v41xv']");
	By signin= By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']");
	By closebutton=By.xpath("//button[@class='_2AkmmA _29YdH8']");
	By search=By.className("LM6RPg");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		drilog=driver;
	}

	public WebElement getLogin()
	{
		
		return drilog.findElement(uname);
	}
	
	public WebElement getPwd()
	{
		return drilog.findElement(pwd);
	}	
	
	public WebElement signIn()
	{
		return drilog.findElement(signin);
	}
	public WebElement closeButton()
	{
		return drilog.findElement(closebutton);
	}
	public WebElement searchText()
	{
		return drilog.findElement(search);
	}
	
}
