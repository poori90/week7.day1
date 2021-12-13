package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyHomePage extends BaseClass {

	@Test
	public void runVerifyHomePage(String uName, String pWord) {
		//LoginPage lp = new LoginPage();
		new LoginPage(driver).
		//enterUsername("DemoCSR").
		//enterPassword("crmsfa").
		clickLoginButton().
		VerifyHomePage();

	}
}
