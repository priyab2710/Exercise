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

	@FindBy(xpath="//*[@data-automationid='uploadForm-uploadLaterButton']")
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
		}catch(Exception e){
			log.error("Bank selection failed");
			Assert.fail("Bank selection failed");
			screenshot("selectBank");
		}
	}

	public void addBankAccountDetails(String accountname1,String accounttype1,String accountnumber1)
			throws InterruptedException,IOException {

		try{

			log.info("Adding "+accounttype1+" account "+accountname1);
			accountname.sendKeys(accountname1);
			accounttype.click();
			driver.findElement(By.xpath("//li[contains(text(),'"+accounttype1+"')]")).click();

			if(accounttype1.equalsIgnoreCase("Credit Card")){
				creditcardnumber.sendKeys(accountnumber1);
			}

			else{
				accountnumber.sendKeys(accountnumber1);
			}

			continueButton.click();

			if(!(accounttype1.equalsIgnoreCase("Other"))){
				((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ihaveform);
				ihaveform.click();
				uploadlater.click();

				WebDriverWait wait=new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(uploadformgotodash));
				uploadformgotodash.click();
			}
		}catch(Exception e){
			log.error("Add Bank account details failed");
			Assert.fail("Add Bank account details failed");
			screenshot("addBankAccountDetails");
		}
	}


	public void verifyBankAccountDetailsOnBankAccountsPage(String accountname1,String accounttype1,
			String accountnumber1) throws IOException {

		System.out.println("Verify if account is added with correct details on bank accounts page");
		driver.get("https://go.xero.com/Bank/BankAccounts.aspx");
		try{
			if(driver.findElement(By.xpath("//a[contains(text(),'"+accountname1+"')]")).isDisplayed()){
				System.out.println("Account "+accountname1+" is added successfully");
				if(driver.findElement(By
						.xpath("//a[contains(text(),'"+accountname1+"')]//span[contains(text(),'"+accountnumber1+"')]"))
						.isDisplayed()){
					System.out.println("account number "+accountnumber1+" is added successfully");


				}else{
					// System.out.println("account number "+accountnumber1+" is not added successfully");
					Assert.fail("account number "+accountnumber1+" is not added");
				}

			}else{
				Assert.fail("Account is not found");

			}
		}catch(Exception e){
			log.error("Bank account is not created");
			Assert.fail("Bank account is not created");
			screenshot("verifyBankAccountDetailsOnBankAccountsPage");
		}
	}
}
