package page.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import driver.DriverBase;
import driver.WebDriverOperations;

public class AmazonLoginPage extends DriverBase {

	@FindBy(id = "twotabsearchtextbox")
	WebElement search;
	
	@FindBy(id = "ap_email")
	WebElement email;

	@FindBy(id = "continue")
	WebElement submit;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signIn;
	
	WebDriverOperations operations;
	
	By searchBtn = By.id("twotabsearchtextbox");
	By submitBtn = By.id("continue");
	By signInBtn = By.id("signInSubmit");
	
	public AmazonLoginPage() {
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
	
	private void search (String mobile) {
		operations.sendTextWithClear(search, mobile);
		log("Enter " + mobile + " in \"User Search\" textbox");
	}
	
	private void enterUserEmail(String useremail) {
		operations.clickOnElement(email);
		operations.sendTextWithClear(email, useremail);
		log("Enter " + useremail + " in \"User Email\" textbox");
	}

	private void clickOnContinueButton() {
		operations.clickOnElement(submit);
		log("Click on \"Submit\" button");
	}
	
	private void enterPassword(String userpassword) {
		operations.sendTextWithClear(password, userpassword);
		log("Enter " + userpassword + " in \"Password\" textbox");
	}

	private void clickOnSignInButton() {
		operations.clickOnElement(signIn);
		log("Click on \"SignIn\" button");
	}
	
	public void searchMobile(String mobile) {
		if (operations.isElementDisplayed(searchBtn)) {
			search(mobile);
		}
	}
	
	public void loginContinue (String useremail) {
		if (operations.isElementDisplayed(submitBtn)) {
			enterUserEmail(useremail);
			clickOnContinueButton();
		}
	}
	
	public void loginSignIn (String userpassword) {
		if (operations.isElementDisplayed(signInBtn)) {
			enterPassword(userpassword);
			clickOnSignInButton();
		}
	}

	
}
