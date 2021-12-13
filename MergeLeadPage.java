package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class MergeLeadPage extends BaseClass {
	
	public MergeLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public LookUpTable clickFindFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new LookUpTable(driver);
	}
	public LookUpTable clickFindToLead() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new LookUpTable(driver);

	}
	public  ViewLeadPage clickOnMerge() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new ViewLeadPage(driver);
	}
	
}
