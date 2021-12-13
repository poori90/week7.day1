package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class DuplicateLeadPage extends BaseClass {
	
	public DuplicateLeadPage(ChromeDriver driver) {
		this .driver=driver;
	}
	
	public ViewLeadPage clickOnSubmitDuplicate() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Duplicate Record Creted successfully");
		return new ViewLeadPage(driver);

	}
}
