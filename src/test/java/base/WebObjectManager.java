package base;

import driver.DriverManager;
import page.web.AmazonLoginPage;
import page.web.CommonPage;
import page.web.LoginPage;

public class WebObjectManager {
	private CommonPage common;
	private LoginPage login;
	private AmazonLoginPage amazonlogin;

	public CommonPage commonPage() {
		if (DriverManager.parallel.equalsIgnoreCase("none")) {
			if (common == null) {
				common = new CommonPage();
			}
		} else {
			common = new CommonPage();
		}
		return common;
	}

	public LoginPage loginPage() {
		if (DriverManager.parallel.equalsIgnoreCase("none")) {
			if (login == null) {
				login = new LoginPage();
			}
		} else {
			login = new LoginPage();
		}
		return login;
	}

	public AmazonLoginPage amazonLoginPage() {
		if (DriverManager.parallel.equalsIgnoreCase("none")) {
			if (amazonlogin == null) {
				amazonlogin = new AmazonLoginPage();
			}
		} else {
			amazonlogin = new AmazonLoginPage();
		}
		return amazonlogin;
	}

	

}
