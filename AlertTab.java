package PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertTab extends BasePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		company.selectByIndex(3);
		
		driver.findElement(By.id("NavMenu_lbManage")).click();
		
		
		//------------------------------------------
		
		//Disconnected
		//yes or No
		String disconnect_sub = driver.findElement(By.xpath(".//*[@id='ctl04_ddlSubscribe_Input']")).getAttribute("value");

		if(disconnect_sub.equalsIgnoreCase("no"))
		{
		String disconnect = "Alert is not subscribed";
		}else
		{
			boolean recemail = driver.findElement(By.xpath(".//*[@id='ctl04_chkReceiveEmails']")).isSelected();
			boolean rechtml = driver.findElement(By.xpath(".//*[@id='ctl04_chkRecieveEmailsAsHTML']")).isSelected();
			boolean rectxtmsg = driver.findElement(By.xpath(".//*[@id='ctl04_chkReceiveTexts']")).isSelected();
			boolean splitmsg = driver.findElement(By.xpath(".//*[@id='ctl04_chkSplitSmsOnOverflow']")).isSelected();
			String msgtrottlesetting = driver.findElement(By.xpath(".//*[@id='ctl04_ddlUseThrottling_Input']")).getAttribute("value");
			String alertinterval = driver.findElement(By.xpath(".//*[@id='ctl04_txtThrottlePeriodInterval']")).getAttribute("value");
			String alertinttime = driver.findElement(By.xpath(".//*[@id='ctl04_ddlThrottleTimePart_Input']")).getAttribute("value");
			
		}
		
		String PartAssemblyOverWeldLimit = driver.findElement(By.xpath(".//*[@id='ctl05_ddlSubscribe_Input']")).getAttribute("value");
		
		if(PartAssemblyOverWeldLimit.equalsIgnoreCase("no"))
		{
			
			String partassembsub = "Not subscribed";
			
		}else
		{
			
			boolean recemail = driver.findElement(By.xpath(".//*[@id='ctl05_chkReceiveEmails']")).isSelected();
			boolean rechtml = driver.findElement(By.xpath(".//*[@id='ctl05_chkRecieveEmailsAsHTML']")).isSelected();
			boolean rectxtmsg = driver.findElement(By.xpath(".//*[@id='ctl05_chkReceiveTexts']")).isSelected();
			boolean splitmsg = driver.findElement(By.xpath(".//*[@id='ctl05_chkSplitSmsOnOverflow']")).isSelected();
			String msgtrottlesetting = driver.findElement(By.xpath(".//*[@id='ctl05_ddlUseThrottling_Input']")).getAttribute("value");
			String alertinterval = driver.findElement(By.xpath(".//*[@id='ctl05_txtThrottlePeriodInterval']")).getAttribute("value");
			String alertinttime = driver.findElement(By.xpath(".//*[@id='ctl05_ddlThrottleTimePart_Input']")).getAttribute("value");
		}
		
		
		/////////////////Daily Digest
		
		String dailydigest = driver.findElement(By.xpath(".//*[@id='ddlReceiveDailyDigest_Input']")).getAttribute("valur");
		
		if(dailydigest.startsWith("No"))
		{
			System.out.println("Daily digest is not subscribed");
		}else
		{
			String deliverytime = driver.findElement(By.xpath(".//*[@id='timePickerDailyDigestDeliveryTime_dateInput']")).getAttribute("value");
			String reportfrom =  driver.findElement(By.xpath(".//*[@id='timePickerDailyDigestReportWindow_dateInput']")).getAttribute("value");
			String reporttoprec = driver.findElement(By.xpath(".//*[@id='txtDailyDigestPreviousHours']")).getAttribute("value");
			String pageorientation = driver.findElement(By.xpath(".//*[@id='ddlDailyDigestPageOrientation_Input']")).getAttribute("value");
			String avlviews = driver.findElement(By.xpath(".//*[@id='ddlViews_Input']")).getAttribute("value");
		}
			
			
			
	}

}
