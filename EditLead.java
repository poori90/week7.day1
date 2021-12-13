package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass {
	
	@Test
	public void runEditLead() throws InterruptedException {
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
		.clickOnFirstRecord()
		.clickOnEditbutton()
		.clearCompanyName()
		.updateCompanyName()
		.clickOnUpdateButton();
	}
	
}
