package com.xero.pageobject;


import static org.testng.Assert.fail;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xero.utilities.BaseUtility;

public class XeroChartOfAccountsPage extends BaseUtility{
	public static Logger log=LogManager.getLogger(XeroChartOfAccountsPage.class.getName());


	public WebDriver driver;

	public XeroChartOfAccountsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String ChartOfAccoutURL="https://go.xero.com/GeneralLedger/ChartOfAccounts.aspx";


	@FindBy(xpath="//*[@class='message']//p[contains(text(),'1 account has been deleted')]")
	private WebElement deleteSuccessMessage;


	@FindBy(id="popupOK")
	private WebElement confirmdelete;

	@FindBy(xpath="//a[contains(@onclick,'BulkAction.deleteSelectedItems')]")
	private WebElement deleteButton;

	public void deleteBankAccount(String accountname1) throws InterruptedException,IOException {
		System.out.println("---------- Removing bank account for regression ----------");
		try{
			log.info("Go of Chart of Account page");
			driver.get(ChartOfAccoutURL);
			log.info("Selecting bank account name "+accountname1);
			driver.findElement(By.xpath("//tr[td[a[contains(text(),'"+accountname1+"')]]]//input[@id='WillDelete']"))
					.click();
			log.info("Clicking on delete button");
			deleteButton.click();
			log.info("Clicking on confirm delete button");
			confirmdelete.click();
			System.out.println("---------- Cleanup finished ----------");
		}catch(Exception e){
			log.error("Account deletion failed");
			screenshot(driver,"AddBankAccount");
			Assert.assertTrue("Account deletion failed",deleteSuccessMessage.isDisplayed());
		}
	}
}

