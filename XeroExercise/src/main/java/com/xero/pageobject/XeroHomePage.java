package com.xero.pageobject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XeroHomePage{
	public static Logger log=LogManager.getLogger(XeroHomePage.class.getName());


	public WebDriver driver;

	public XeroHomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String HomePageURL="https://login.xero.com/";

	@FindBy(xpath="//*[@data-automationid='dashboardOrgName']")
	private WebElement organization;

	@FindBy(id="submitButton")
	private WebElement Log_in;

	public void selectExistingOrg(String my_org) {
		WebElement myorganization=driver
				.findElement(By.xpath("//*[@data-automationid='dashboardOrgName'][contains(text(),'"+my_org+"')]"));
		myorganization.click();
	}


}
