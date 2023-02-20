package test.web;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ObjectCreation;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import listners.DriverListener;
import pojo.web.LoginData;

@Listeners({ DriverListener.class })
public class AmazonLogin {

	ObjectCreation oc = new ObjectCreation();
	LoginData ld = new LoginData();

	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void amazonSearch() {
		oc.wObj.amazonLoginPage().searchMobile(ld.getAdmin_usersearch());
	}
	
	
	@Test
	public void amazonContinue() {
		oc.wObj.amazonLoginPage().loginContinue(ld.getAdmin_useremail());
	}

	@Test
	public void amazonSignIn() {
		oc.wObj.amazonLoginPage().loginSignIn(ld.getAdmin_userpassword());
	}
}