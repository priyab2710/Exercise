package com.xero.stepDefinition;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.xero.pageobject.*;
import com.xero.utilities.BaseUtility;

@RunWith(Cucumber.class)
public class StepDefinition{
	public WebDriver driver;
	BaseUtility BU=new BaseUtility();

	@Before
	public void beforeScenario() throws IOException,InterruptedException {
		driver=BU.initializeDriver();
		System.out.println("---------- Test started ----------");
	}

	@After
	public void afterScenario() throws IOException {
		BU.TearDown(driver);
	}

	@Given("^Xero user is logged in with correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void xero_user_is_logged_in_with_correct_something_and_something(String useremail,String password)
			throws Throwable {
		// driver=BU.initializeDriver();
		XeroLoginPage xlp=new XeroLoginPage(driver);
		xlp.loginWithValidCredentials(useremail,password);
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"My Xero | Home","Pass");
	}

	@When("^Xero user has organisation added and selects the existing organization \"([^\"]*)\"$")
	public void xero_user_has_organisation_added_and_selects_the_existing_organization_something(String org)
			throws Throwable {
		XeroHomePage hlp=new XeroHomePage(driver);
		hlp.selectExistingOrg(org);
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Xero | Dashboard | "+org,"Pass");

	}

	@Then("^add bank account options is available to user and is able to click on link for \"([^\"]*)\" organization$")
	public void add_bank_account_options_is_available_to_user_and_is_able_to_click_on_link_for_something_organization(
			String org) throws Throwable {
		XeroDashboard xdb=new XeroDashboard(driver);
		xdb.selectAddBankAccount();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"Xero | Find your bank | "+org,"Pass");
	}

	@And("^user is able to add \"([^\"]*)\" bank account with (.+) and (.+) and (.+)$")
	public void user_is_able_to_add_something_bank_account_with_and_and(String bank,String accountname,
			String accounttype,String accountnumber) throws Throwable {
		XeroAccountingPage xap=new XeroAccountingPage(driver);
		xap.selectBank(bank);
		xap.addBankAccountDetails(accountname,accounttype,accountnumber);
		xap.verifyBankAccountDetailsOnBankAccountsPage(accountname,accounttype,accountnumber);
		XeroChartOfAccountsPage xcap=new XeroChartOfAccountsPage(driver);
		xcap.deleteBankAccount(accountname);
	}
}
