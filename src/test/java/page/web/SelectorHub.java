package page.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;

import driver.DriverBase;
import driver.WebDriverOperations;

public class SelectorHub extends DriverBase {

	@FindBy(id = "userId")
	WebElement email;
	
	@FindBy(id = "pass")
	WebElement password;
	
	
	
}
