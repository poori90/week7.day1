package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {

	@BeforeTest
	public void setValues()
	{
		excelFileName="CreateLeadData";
	}
	@Test(dataProvider = "sendData")
	public void runCreateLead(String company,String fName,String lName) throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername().
		enterPassword().
		clickLoginButton().
		clickCRMSFALink().
		clickLeadsLink().
		clickCreateLeadLink().
		enterCompanyName(company).
		enterFirstName(fName).
		enterLastName(lName).
		clickCreateLeadButton().
		verifyFirstName();

	}
}
