package test.web;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.ObjectCreation;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import listners.DriverListener;
import pojo.web.LoginData;

@Listeners({ DriverListener.class })
public class Login {
	ObjectCreation oc = new ObjectCreation();
	LoginData ld = new LoginData();

	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void adminlogin() {
		oc.wObj.loginPage().login(ld.getAdmin_username(), ld.getAdmin_password());
		oc.wObj.loginPage().verifyLogin();
	}

	@Test
	public void adminlogout() {
		oc.wObj.loginPage().logout();
		oc.wObj.loginPage().verifyLogout();

	}
}
