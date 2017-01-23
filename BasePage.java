package PageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static WebDriver driver;
	
	public static void tearDown() {
		
		driver.close();
	}
	
	public static void setUp(String url)
	{
		
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get(url);
	}
	
	
}
