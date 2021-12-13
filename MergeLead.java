package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeadPage;
import pages.LoginPage;
import pages.MyLeadsPage;

public class MergeLead extends BaseClass {
	@Test
	public void runMergeLead() throws InterruptedException  {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsLink()
		.clickMergeLeads()
		.clickFindFromLead()
		.enterFirstNameFrom()
		.clickFindLead()
		.getLeadId()
		.clickReturnRecord()
		.clickFindToLead()
		.enterFirstNameTo()
		.clickFindLead()
		.clickReturnRecord()
		.clickOnMerge()
		.clickFindLeadsLink()
		.enterLeadIDfromLookup()
		.clickFindLeadsButton()
		.verifyLeadMerged();

	}
	
}
