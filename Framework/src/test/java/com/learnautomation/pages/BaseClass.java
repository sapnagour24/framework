package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.learnautomation.utility.BrowserFactory;

public class BaseClass {
	 public WebDriver driver;
	 @BeforeClass
	 public void setup() {
		 driver=BrowserFactory.startApplication( driver, "Chrome", "https://www.freecrm.com/index.html"); 
	 }
	 @AfterClass
	 public void teardown() {
		 BrowserFactory.quitBrowser(driver); 

}
}