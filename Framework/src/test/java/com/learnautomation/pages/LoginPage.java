package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")WebElement loginclick;
@FindBy(name="email")WebElement uname;
@FindBy(name="password")WebElement pass;
@FindBy(xpath="//div[text()='Login']")WebElement loginbutton;
public void loginToCRM(String usenameApplication,String passwordApplication ) throws InterruptedException {
	Thread.sleep(2000);
	

loginclick.click();
uname.sendKeys(usenameApplication);
pass.sendKeys(passwordApplication);
loginbutton.click();
}
}
