package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class FindLeadPage extends BaseClass{
	public static String leadID ;
	public FindLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public FindLeadPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	public FindLeadPage enterPhoneNo() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("45");
		return this;
	}
	public FindLeadPage clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		return this;

	}
	public ViewLeadPage clickOnFirstRecord() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);

	}
	public FindLeadPage captureLeadID() throws InterruptedException {
		
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
		Thread.sleep(3000);
		return this;

	}
    public  FindLeadPage findLead() {
		
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	
	public FindLeadPage enterLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;

	}
	public FindLeadPage verifyDeleteRecord() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Assert.assertEquals(text, "No records to display");
		return this;
	}
	public FindLeadPage verifyLeadMerged()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
		Assert.assertEquals(text, "No records to display");
		return this;
	
	}
	public FindLeadPage enterLeadIDfromLookup()
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LookUpTable.leadID);
		return this;
	}
}
