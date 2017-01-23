package PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserManagementTab extends BasePage {
	
	public static int table_edit_count() {
		
		return driver.findElements(By.xpath("//a[text() = 'Edit']")).size();
	}
	
	public static List<WebElement> getEdits() {
		
		return driver.findElements(By.xpath("//a[text() = 'Edit']"));
	}
	
	public static WebElement perinfo_edit() {
		
		return driver.findElement(By.xpath("//*[@id='hlEditPersonalInformation']"));
	}
	
    public static WebElement security_edit() {
		
		return driver.findElement(By.xpath("//*[@id='hlEditPersonalInformation']"));
	}
    
    public static String getFirstName() {
    	
		return "";
	}
    
    public static String getLastName() {
    	
		return "";
	}
    
    public static String getEmailAddress() {
    	
		return "";
	}
    
    public static String getCellPhoneNum() {
    	
		return "";
	}
    
    public static String getCellPhoneProvider() {
    	
		return "";
	}
    
    public static WebElement clickOnCancel() {
    
    	return driver.findElement(By.xpath("//*[@id='bCancel']"));
	
    }
    
    public static WebElement clickOnUserListing() {
		
    	return driver.findElement(By.xpath(".//*[@id='hlUserListing']"));
	}

}
