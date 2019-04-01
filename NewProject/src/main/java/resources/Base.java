package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	public static WebDriver driver;
	public Properties p=new Properties();
	@SuppressWarnings("deprecation")
	public WebDriver initialFunc() throws IOException
	{
		FileInputStream fs=new FileInputStream("E:\\Sel_Project\\NewProject\\src\\main\\java\\resources\\data.properties");
		p.load(fs);
		String str=p.getProperty("browser");
		if(str.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\drivers\\jar_files\\chromedriver_win32\\chromedriver.exe");
			//ChromeOptions options = new ChromeOptions(); 
			//options.addArguments("disable-infobars"); 
			//driver=new ChromeDriver(options);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(str.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "E:\\drivers\\jar_files\\IEDriverServer_Win32_3.12.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(str.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\drivers\\jar_files\\IEDriverServer_Win32_3.12.0\\geckodriver-v0.20.1-win32\\geckodriver.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();

			 capabilities = DesiredCapabilities.firefox();
			 capabilities.setBrowserName("firefox");
			 capabilities.setVersion("47.0.2");
			 capabilities.setPlatform(Platform.WINDOWS);
			 capabilities.setCapability("marionette", false);

			 driver = new FirefoxDriver(capabilities);
			
			
		}
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	return driver;
		
		
	}
	
	

}
