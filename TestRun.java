package TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestRun {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		
		String dir_path=System.getProperty("user.dir");
		System.out.println(dir_path);
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lincolncheckpoint.com/default.aspx");
		
		
		driver.findElement(By.id("email")).sendKeys("vinay.gl@lnttechservices.com");
		driver.findElement(By.id("password")).sendKeys("Gowda@23");
		driver.findElement(By.id("signIn")).click();
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("NavMenu_lblLocation")).click();
		
		
		Select company=new Select(driver.findElement(By.id("NavMenu_cboLocation")));
		List<WebElement> allOptions = company.getOptions();
		
		int size=allOptions.size();
		
		for(int dp=1;dp<size;dp++)
		{
			company.selectByIndex(dp);
		
		driver.findElement(By.id("NavMenu_lbManage")).click();
		
		if(driver.findElement(By.xpath(".//*[@id='NavMenu_navigationAlertMessage']")).isEnabled())
		{
			System.out.println("user is not having access");
		}
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='header_linkUser']")).click();
		
		String user_get[]=new String[18];
		
		List<WebElement> first_col = driver.findElements(By.xpath("//a[text() = 'Edit']"));
		int col_size=first_col.size();
		
		
		
		for (int i=0;i<col_size;i++) 
		{
			
			List<WebElement> first_col1 = driver.findElements(By.xpath("//a[text() = 'Edit']"));
			
			first_col1.get(i).click();
			
			
			
		     try{
		     driver.findElement(By.xpath("//*[@id='hlEditPersonalInformation']")).click();
		     
		     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			    
	    	 //Personal information
	    	
			user_get[0] = driver.findElement(By.xpath("//*[@id='lblUserTitle']")).getText();
			user_get[1] = " ";
			user_get[2] = driver.findElement(By.xpath("//*[@id='lblGeneralSection']")).getText();
			user_get[3] = " ";
			user_get[4] = driver.findElement(By.xpath("//*[@id='lblFirstName']")).getText();
			user_get[5] = driver.findElement(By.xpath("//*[@id='txtFirstName']")).getAttribute("value");
			user_get[6] = driver.findElement(By.xpath("//*[@id='lblLastName']")).getText();
			user_get[7] = driver.findElement(By.xpath("//*[@id='txtLastName']")).getAttribute("value");
			user_get[8] = driver.findElement(By.xpath("//*[@id='lblEmailAddress']")).getText();
			user_get[9] = driver.findElement(By.xpath("//*[@id='txtEmailAddress']")).getAttribute("value");
			user_get[10] = driver.findElement(By.xpath("//*[@id='lblVerifyEmailAddress']")).getText();
			user_get[11] = driver.findElement(By.xpath("//*[@id='lblVerifyEmailAddress']")).getAttribute("value");
			user_get[12] = driver.findElement(By.xpath("//*[@id='lblPersonalSection']")).getText();
			user_get[13] = " ";
			user_get[14] = driver.findElement(By.xpath("//*[@id='lblCellPhoneNumber']")).getText();
			user_get[15] = driver.findElement(By.xpath("//*[@id='txtPhoneNumber']")).getAttribute("value");
			user_get[16] = driver.findElement(By.xpath("//*[@id='lblCellPhoneProvider']")).getText();
			user_get[17] = driver.findElement(By.xpath("//*[@id='ddlPhoneProvider_Input']")).getAttribute("value");
			
			
			
	    	
	    	driver.findElement(By.xpath("//*[@id='bCancel']")).click();
	    	
	    	driver.findElement(By.xpath("//*[@id='hlUserListing']")).click();
	    	//driver.navigate().forward();
		     
		     
		     }catch(Exception e)
		     {
		    	 System.out.println("User is not having data");
		    	 driver.findElement(By.xpath("//*[@id='hlUserListing']")).click();
		     }
		    	
		     }
		}
		
		driver.quit();

	}
}
