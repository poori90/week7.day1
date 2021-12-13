package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class EditLeadPage extends BaseClass{
	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage verifyTheEditPage() {
		String title=driver.getTitle();
		System.out.println("We Landed in Edit LEads Page : " +title);
		return this;
	}
	public EditLeadPage clearCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		return this;
	}
	
	public EditLeadPage updateCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		return this;
	}
	
	public ViewLeadPage clickOnUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Lead Edited succesfully");
		return new ViewLeadPage(driver);
	}

}
