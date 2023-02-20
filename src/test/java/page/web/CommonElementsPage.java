package page.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import driver.DriverBase;

public class CommonElementsPage extends DriverBase {

	@FindBy(xpath = "//*[@id = 'btnSearch']//*[text() = 'Search']")
	WebElement Searchbtn;

	@FindBy(xpath = "//*[@id = 'btnFilterReset']")
	WebElement Resetbtn;

	@FindBy(xpath = " //*[@class = 'btn btn-danger btn-left  has- btn-def-3d btn-xs searchFields']")
	WebElement Cancelbtn;
	
	@FindBy(xpath = "//*[@id='m2p']")
	WebElement User_Management;

	@FindBy(xpath = "//*[@title = 'Search']")
	WebElement SearchIcon;
	
	
}