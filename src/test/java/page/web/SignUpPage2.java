package page.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import driver.DriverBase;
import driver.WebDriverOperations;

public class SignUpPage2 extends DriverBase {
	
	@FindBy(id = "Username")
	WebElement txtUserName;

	@FindBy(id = "Password")
	WebElement txtPassword;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	@FindBy(xpath  = "//*[contains(text),'Logout']")
	WebElement btnLogout;

	WebDriverOperations operations;

	By login = By.id("btnLogin");
	By logout = By.xpath("//*[@id=\"content\"]/div[1]/div[2]/ul/li/a/i");
	

	public SignUpPage2() {
		operations = new WebDriverOperations();
	}

	public void checExistingElement(WebElement element) {
		boolean status = operations.isElementDisplayed(element);
		if (status)
			log(element + " is exist");
		else
			log(element + " is not exist", Status.FAIL);
		verifyTrue(status);
	}


	private void enterUserName(String username) {
		operations.sendTextWithClear(txtUserName, username);
		log("Enter " + username + " in \"User Name\" textbox");
	}

	private void enterPassword(String password) {
		operations.sendTextWithClear(txtPassword, password);
		log("Enter " + password + " in \"Password\" textbox");
	}

	private void clickOnLoginButton() {
		operations.clickOnElement(login);
		log("Click on \"Login\" button");
	}

	private void clickOnLogoutButton() {
		operations.clickOnElement(logout);
		log("Click on \"Logout\" button");
	}
		
	public void login(String username, String password) {
		if (operations.isElementDisplayed(login)) {
			enterUserName(username);
			enterPassword(password);
			clickOnLoginButton();
		}
	}

	public void verifyLogin() {
		operations.waits.pauseInSeconds(10);
		verifyTrue(operations.isElementDisplayed(logout));
		log("Login Successful");
	}
	
	public void logout() {
		if (operations.isElementDisplayed(logout)) {
			clickOnLogoutButton();
		}
	}
	
	public void verifyLogout() {
		operations.waits.pauseInSeconds(5);
		verifyTrue(operations.isElementDisplayed(login));
		log("Logout Successful");
	}
}
