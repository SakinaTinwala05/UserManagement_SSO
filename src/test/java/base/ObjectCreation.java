package base;

import config.TestConfig;
import page.web.AmazonLoginPage;
import page.web.LoginPage;

public class ObjectCreation {
	LoginPage login = null;
	AmazonLoginPage submit = null;
	AmazonLoginPage signIn = null;
	public WebObjectManager wObj;

	public ObjectCreation() {
		TestConfig config = TestConfig.getTestConfig();
		if (config.getModule().equalsIgnoreCase("web")) {
			wObj = new WebObjectManager();

		}
	}
}
