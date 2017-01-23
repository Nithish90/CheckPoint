package PageActions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NavigationLibraries extends BasePage {
	
	
	
	public static void login(String username, String password) {
		
		driver.findElement(By.id("email")).sendKeys(username);
		
		driver.findElement(By.id("password")).sendKeys(password);
		
		driver.findElement(By.id("signIn")).click();;
	}
	
	
	public static WebElement dropDownMenu() {
		
		return driver.findElement(By.xpath("//*[@id='NavMenu_lblLocation']"));
	}
	
	public static int getDropdownCount() {
		
		Select company=new Select(driver.findElement(By.id("NavMenu_cboLocation")));
		List<WebElement> allOptions = company.getOptions();
		return allOptions.size();
	}
	
	public static void selectDropdown() {
		
		return;
	}
	
	public static String getCompanyName() {
		
		return driver.findElement(By.xpath("//*[@id='NavMenu_lblLocation']")).getText();
	}
	
	public static WebElement userManagementTab(){
		
		return driver.findElement(By.xpath("//*[@id='header_linkUser']"));
	}
	

}
