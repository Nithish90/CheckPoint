package PageActions;

import org.openqa.selenium.By;

public class WeldersTab extends BasePage {
	
	public static String getCategoryName() {
		
		String catregory= driver.findElement(By.xpath("//*[@class='box-title']/span")).getText();
		
		String categoryname[] = catregory.split("\\s+");
		
		return categoryname[0];
	}
	
	public static String getName() {
		return driver.findElement(By.xpath("//*[@id='txtAssetName' or @id='txtContainerName']")).getAttribute("value");
	}
	
	public static String getDescription(String category) {
		
		String desc = driver.findElement(By.xpath("//*[@id='txtContainerDescription' or @id='txtDescription']")).getAttribute("value");
		if(category.trim() == "Site") {
			
			return desc;
		}
			
		
		return desc;
	}
	
	public static String getIdleTimeThreshold() {
		
		return driver.findElement(By.xpath("//*[@id='txtIdleTimeThreshold']")).getAttribute("value");
	}
	
	public static String getPlannedArcTimePerHour() {
		return driver.findElement(By.xpath("//*[@id='txtPlannedArcTime']")).getAttribute("value");
	}
	
	public static String[] getHeaderInformation() {
		
		String[] headers=new String[6];
		
		headers[0] = "CompanyName";
		headers[1] = "Category";
		headers[2] = "Name";
		headers[3] = "Description";
		headers[4] = "IdleTimeThreshold";
		headers[5] = "PlannedArcTimePerHour";
		
		
		
		return headers;
		
	}
	
	
	

}
