package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class DeleteLeadPage extends BaseClass {

	public DeleteLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadPage findLeadAfterDelete() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadPage(driver);
		
	}	

}
