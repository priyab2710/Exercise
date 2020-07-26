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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.xero.utilities.BaseUtility;

public class XeroAccountingPage extends BaseUtility{
	public static Logger log=LogManager.getLogger(XeroAccountingPage.class.getName());


	public WebDriver driver;

	public XeroAccountingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


	@FindBy(xpath="//input[contains(@id,'accountname')]")
	private WebElement accountname;

	@FindBy(xpath="//input[contains(@id,'accounttype')]")
	private WebElement accounttype;

	@FindBy(xpath="//*[@data-automationid='creditCardNumber']//input[contains(@id,'accountnumber')]")
	private WebElement creditcardnumber;

	@FindBy(xpath="(//*[@data-automationid='accountNumber']//input[contains(@id,'accountnumber')])[3]")
	private WebElement accountnumber;

	@FindBy(xpath="//*[contains(@id,'common-button-submit')][contains(@class,'submit')]")
	private WebElement continueButton;

	@FindBy(xpath="//*[@data-automationid='connectbank-buttonIHaveAForm']")
	private WebElement ihaveform;

	@FindBy(xpath="//*[@data-automationid='connectbank-buttonDownloadForm']")
	private WebElement downloadform;

	@FindBy(xpath="//a[@data-automationid='uploadForm-uploadLaterButton']")
	private WebElement uploadlater;

	@FindBy(xpath="//*[@data-automationid='uploadForm-uploadFormButton']")
	private WebElement uploadform;

	@FindBy(xpath="//*[@data-automationid='uploadFormLater-goToDashboardButton']//span[contains(text(),'Go to dashboard')]")
	private WebElement uploadformgotodash;


	public void selectBank(String bank) throws IOException {

		try{
			log.info("Selecting bank "+bank);
			driver.findElement(By.xpath("//*[@data-automationid='popularBanksList']//li[contains(text(),'"+bank+"')]"))
					.click();
			log.info("Bank selected "+bank);
		}catch(Exception e){
			log.error("Bank selection failed");
			Assert.fail("Bank selection failed");
			screenshot(driver,"BankSelection");
		}
	}

	public void addBankAccountDetails(String accountname1,String accounttype1,String accountnumber1)
			throws InterruptedException,IOException {
		WebDriverWait wait=new WebDriverWait(driver,5);
		try{
			log.info("Adding "+accounttype1+" account "+accountname1);
			accountname.sendKeys(accountname1);
			accounttype.click();
			driver.findElement(By.xpath("//li[contains(text(),'"+accounttype1+"')]")).click();

			log.info("Entering account number "+accountnumber1);
			if(accounttype1.equalsIgnoreCase("Credit Card")){
				creditcardnumber.sendKeys(accountnumber1);
			}else{
				accountnumber.sendKeys(accountnumber1);
			}

			log.info("Clicking on continue button");
			continueButton.click();

			if(!(accounttype1.equalsIgnoreCase("Other"))){
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ihaveform);

				log.info("Clicking on I have form button");
				wait.until(ExpectedConditions.elementToBeClickable(ihaveform));
				Thread.sleep(2000);
				ihaveform.click();

				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",uploadlater);
				log.info("Clicking on upload later button");
				wait.until(ExpectedConditions.elementToBeClickable(uploadlater));
				Thread.sleep(2000);
				uploadlater.click();

				log.info("Clicking on go to dashboard button");
				wait.until(ExpectedConditions.elementToBeClickable(uploadformgotodash));
				Thread.sleep(2000);
				uploadformgotodash.click();
			}
		}catch(Exception e){
			log.error("Add Bank account details failed");
			screenshot(driver,"AddBankAccountDetails");
			Assert.fail("Add Bank account details failed");
		}
	}


	public void verifyBankAccountDetailsOnBankAccountsPage(String accountname1,String accounttype1,
			String accountnumber1) throws IOException {

		log.info("Go to Bank Account page");
		driver.get("https://go.xero.com/Bank/BankAccounts.aspx");

		try{
			log.info("Verify bank account name is added");
			if(driver.findElement(By.xpath("//a[contains(text(),'"+accountname1+"')]")).isDisplayed()){
				log.info("Account "+accountname1+" is added successfully");

				log.info("Verify bank account number is added");
				if(driver.findElement(By
						.xpath("//a[contains(text(),'"+accountname1+"')]//span[contains(text(),'"+accountnumber1+"')]"))
						.isDisplayed()){
					log.info("Account number "+accountnumber1+" is added successfully");
					screenshot(driver,"BankAccountAdded "+accountname1);
				}else{
					screenshot(driver,"VerifyBankAccountDetails"+accountname1);
					Assert.fail("Account number "+accountnumber1+" is not added");
				}
			}else{
				screenshot(driver,"VerifyBankAccountDetails"+accountname1);
				Assert.fail("Account is not found");
			}
		}catch(Exception e){
			log.error("Bank account is not added.");
			screenshot(driver,"VerifyBankAccountDetails"+accountname1);
			Assert.fail("Bank account is not created.");

		}
	}
}
