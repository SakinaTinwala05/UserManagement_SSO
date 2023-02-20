package pojo.web;

import java.io.File;

import config.TestConfig;
import constants.GlobalConstants;
import utils.ConfigReader;

public class LoginData {
	private String useremail;
	private String userpassword;
	private String usersearch;
	private String username;
	private String password;
	private String url;
	private String admin_username;
	private String admin_password;
	private String admin_url;
	private String Email_URL;
	private String changedpassword;
	
	private String email;
	private String pass;
	private String search;

	public String getChangedpassword() {
		return changedpassword;
	}

//	public void setChangedpassword(String changedpassword) {
//		this.changedpassword = changedpassword;
//	}

	public String getAdmin_url() {
		return admin_url;
	}

	public void setAdmin_url(String admin_url) {
		this.admin_url = admin_url;
	}

	public String getAdmin_username() {
		return admin_username;
	}

	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public String getUrl() {
		return url;
	}

//	public void setUrl(String url) {
//		this.url = url;
//	}

	public String getEmail_URL() {
		return Email_URL;
	}

	public void setEmail_URL(String Email_URL) {
		this.Email_URL = Email_URL;
	}
	
	public LoginData() {
		String path;
		switch (TestConfig.getTestConfig().getEnvironment()) {
		case "qa":
			path = GlobalConstants.configFolder + File.separator + "QA.properties";
			break;
		case "dev":
			path = GlobalConstants.configFolder + File.separator + "DEV.properties";
			break;
		default:
			path = GlobalConstants.configFolder + File.separator + "QA.properties";
			break;
			
		}
		
		setAdmin_username(ConfigReader.getPropertyValue(path, "UserSearch"));
		setAdmin_username(ConfigReader.getPropertyValue(path, "AdminUseremail"));
		setAdmin_password(ConfigReader.getPropertyValue(path, "AdminPassword"));
	}

	public String getuserPassword() {
		return userpassword;
	}

//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	public String getUsersearch() {
		return usersearch;
	}
	
	public String getUseremail() {
		return useremail;
	}

	
	public String getPassword() {
		return password;
	}

//	public void setPassword(String password) {
//		this.password = password;
//	}

	public String getUsername() {
		return username;
	}

//	public void setUsername(String username) {
//		this.username = username;
//	}
	
	
	public String getAdmin_useremail() {
		return email;
	}

	public void setAdmin_useremail(String email) {
		this.email = email;
	}
	
	public String getAdmin_userpassword() {
		return pass;
	}

	public void setAdmin_userpassword(String pass) {
		this.pass = pass;
	}

	public String getAdmin_usersearch() {
		return search;
	}
	
	public void setAdmin_userSearch(String search) {
		this.search = search;
	}
	
}
