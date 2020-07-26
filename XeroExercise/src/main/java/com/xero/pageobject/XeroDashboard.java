package com.xero.pageobject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XeroDashboard{
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

	public void selectExistingOrg(String my_org) {
		WebElement myorganization=driver
				.findElement(By.xpath("//*[@data-automationid='dashboardOrgName'][contains(text(),'"+my_org+"')]"));
		myorganization.click();
	}

	public void selectAddBankAccount() {
		addbankaccount.click();

	}
}
