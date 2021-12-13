package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.DeleteLeadPage;
import pages.FindLeadPage;
import pages.LoginPage;
import pages.ViewLeadPage;

public class DeleteLead extends BaseClass {
	@Test
	public void runDeleteLead() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneTab()
		.enterPhoneNo()
		.clickFindLeadsButton()
		.captureLeadID()
		.clickOnFirstRecord()
		.clickOnDeleteButton()
		.findLeadAfterDelete()
		.enterLeadID()
		.clickFindLeadsButton()
		.verifyDeleteRecord();

	}
	
}
