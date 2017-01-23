package TestCase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import PageActions.NavigationLibraries;
import PageActions.WeldersTab;


public class WeldersTabRun {
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
		
		driver.findElement(By.xpath("//*[@id='header_lblAssetTab']")).click();
		
		
		
		String welder_info[]=new String[6];
		
		List<WebElement> first_col = driver.findElements(By.xpath("//a[text() = 'Edit']"));
		int col_size=first_col.size();
		
		
		
		for (int i=0;i<col_size;i++) 
		{
			
			List<WebElement> first_col1 = driver.findElements(By.xpath("//a[text() = 'Edit']"));
			
			first_col1.get(i).click();
	
		    	 welder_info[0] = NavigationLibraries.getCompanyName();
		    	 welder_info[1] = WeldersTab.getCategoryName();
		    	 welder_info[2] = WeldersTab.getName();
		    	 welder_info[3] = WeldersTab.getDescription(WeldersTab.getCategoryName());
		    	 welder_info[4] = WeldersTab.getIdleTimeThreshold(); 
		    	 welder_info[5] = WeldersTab.getPlannedArcTimePerHour();
		     
		     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		     
		     driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		     
		     String eventname = driver.findElement(By.xpath(".//*[@id='txtEvent']")).getAttribute("value");
			    
	    	 String eventdesc =driver.findElement(By.xpath(".//*[@id='txtGeneralDescription']")).getAttribute("value");
	    	 
	    	 String userfrm = driver.findElement(By.xpath(".//*[@id='tpStartTime_dateInput']")).getAttribute("value");
	    	 
	    	 String userto = driver.findElement(By.xpath("..//*[@id='tpEndTime_dateInput']")).getAttribute("value");
	    	 
	    	 driver.findElement(By.xpath(".//*[@id='lblCompanyStartTime']")).getText();
	    	 
	    	 driver.findElement(By.xpath(".//*[@id='lblCompanyEndTime']")).getText();
	    	 
	    	 
	    	 //Start Date
	    	 driver.findElement(By.xpath(".//*[@id='optNoStartingDate']")).isSelected();
	    	 
	    	 if(driver.findElement(By.xpath(".//*[@id='optUseStartingDate']")).isSelected())
	    	 {
	    		 driver.findElement(By.xpath(".//*[@id='dpStartingDate_dateInput']")).getText();
	    	 }
	    	 
	    	 //End Date
	    	 
	    	 driver.findElement(By.xpath(".//*[@id='optNoEndingDate']")).isSelected();
	    	 
	    	 if(driver.findElement(By.xpath(".//*[@id='optEndDateOccurrences']")).isSelected())
	    	 {
	    		 driver.findElement(By.xpath(".//*[@id='txtEndDateOccurrences']")).getText();
	    	 }
	    	 
	    	 if(driver.findElement(By.xpath(".//*[@id='optUseEndingDate']")).isSelected())
	    	 {
	    		 driver.findElement(By.xpath(".//*[@id='dpEndingDate_dateInput']")).getText();
	    	 }
	    	 
	    	 //
	    	 
	    	 if(driver.findElement(By.xpath(".//*[@id='cboRecurrenceType_Input']")).getAttribute("value")=="None") {
	    		 
	    		 
	    	 }else if(driver.findElement(By.xpath(".//*[@id='cboRecurrenceType_Input']")).getAttribute("value")=="None") {
	    		 
	    		 driver.findElement(By.xpath(".//*[@id='txtRecurrenceHourly']")).getAttribute("value");
	    		 
	    	 }else if(driver.findElement(By.xpath(".//*[@id='cboRecurrenceType_Input']")).getAttribute("value")=="None") {
	    		 
	    	 }else if(driver.findElement(By.xpath(".//*[@id='cboRecurrenceType_Input']")).getAttribute("value")=="None") {
	    		 
	    	 }else if(driver.findElement(By.xpath(".//*[@id='cboRecurrenceType_Input']")).getAttribute("value")=="None") {
	    		 
	    	 }else if(driver.findElement(By.xpath(".//*[@id='cboRecurrenceType_Input']")).getAttribute("value")=="None") {
	    		 
	    	 }
	    	 
	    	 
	    	 
	    	driver.findElement(By.xpath("//*[@id='bCancel']")).click();
	    	
	    			     
		     
		     
		    	
		     }
		}
		
		driver.quit();

	}
}
