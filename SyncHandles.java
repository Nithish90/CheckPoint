package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageActions.BasePage;

public class SyncHandles extends BasePage{
	
	public static void waitForElement(WebElement element) {
		try{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//Wait for Error
	public static void waitForError(WebElement element) {
		try{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

}
