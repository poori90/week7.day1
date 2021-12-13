package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class ViewLeadPage extends BaseClass {

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public ViewLeadPage verifyFirstName() throws InterruptedException {
		Thread.sleep(3000);
		boolean displayed = driver.findElement(By.id("viewLead_firstName_sp")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
	public EditLeadPage clickOnEditbutton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);

	}
	public DuplicateLeadPage clickOnDuplicateButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
	
		return new DuplicateLeadPage(driver);
	}
	public DeleteLeadPage clickOnDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		System.out.println("Lead Deleted successfully");
		return new DeleteLeadPage(driver);

	}
	public FindLeadPage clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
	}

}
