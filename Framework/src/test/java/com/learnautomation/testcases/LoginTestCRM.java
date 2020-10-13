package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;

public class LoginTestCRM extends BaseClass{
 
 
@Test
public void loginApp() {

	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);
	try {
		loginpage.loginToCRM("Selenium_50","Abcd@123456");
	} catch (InterruptedException e) {
		System.out.println("password is wrong");
	}
	
}


}
