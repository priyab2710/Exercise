package com.xero.pageobject;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xero.utilities.BaseUtility;

public class XeroDashboard extends BaseUtility{
	public static Logger log=LogManager.getLogger(XeroDashboard.class.getName());


	public WebDriver driver;

	public XeroDashboard(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String HomePageURL="https://login.xero.com/";

	@FindBy(xpath="//*[@data-automationid='welcome-ListItem-BANK']")
	private WebElement addbankaccount;

	// *[@data-automationid='welcome-ListItem-BANK']/a[contains(text(),'Connect your bank accounts')]"

	@FindBy(id="submitButton")
	private WebElement Log_in;

	public void selectAddBankAccount() throws IOException {
		try{
			log.info("Clicking on add bank account link: Connect your bank accounts");
			addbankaccount.click();
		}catch(Exception e){
			log.error("Failed to click on Connect your bank accounts link");
			screenshot(driver,"AddBankAccount");
			Assert.fail("Failed to click on Connect your bank accounts link");
		}
	}
}
