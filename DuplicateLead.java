package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DuplicateLead extends BaseClass {
	@Test
	public void runDuplicateLeadPage() throws InterruptedException {
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickFindLeadsLink()
		.clickPhoneTab()
		.enterPhoneNo()
		.clickFindLeadsButton()
		.clickOnFirstRecord()
		.clickOnDuplicateButton()
		.clickOnSubmitDuplicate()
		.verifyFirstName();
		
	}

}
