package com.xero.pageobject;


import static org.testng.Assert.fail;

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

public class XeroChartOfAccountsPage{
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

	public void deleteBankAccount(String accountname1) throws InterruptedException {

		log.info(
				"------------------------------Cleanup Test Data------Deleting bank accounts added-------------------------------------------------------------------");

		try{
			driver.get(ChartOfAccoutURL);


			driver.findElement(By.xpath("//tr[td[a[contains(text(),'"+accountname1+"')]]]//input[@id='WillDelete']"))
					.click();
			deleteButton.click();
			confirmdelete.click();
		}catch(Exception e){
			Assert.assertTrue("Account deletion failed",deleteSuccessMessage.isDisplayed());
			log.error("Account deletion failed");
		}


		log.info(
				"------------------------------Cleanup finished-------------------------------------------------------------------------------------------------------");

	}

}

