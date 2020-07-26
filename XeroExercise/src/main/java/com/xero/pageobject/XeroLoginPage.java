package com.xero.pageobject;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xero.utilities.BaseUtility;

public class XeroLoginPage extends BaseUtility{
	public static Logger log=LogManager.getLogger(XeroLoginPage.class.getName());


	public WebDriver driver;

	public XeroLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public String LoginURL="https://login.xero.com/";

	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="password")
	private WebElement password_x;

	@FindBy(id="submitButton")
	private WebElement Log_in;

	@FindBy(xpath="//*[contains(text(),'Use another authentication method')]")
	private WebElement select_auth;

	@FindBy(xpath="//*[@type='button'][contains(text(),'Security questions')]")
	private WebElement Security_que;

	@FindBy(css=".auth-firstquestion.xui-text-label.xui-fieldlabel-layout")
	private WebElement firstquestion;

	@FindBy(xpath="//input[@data-automationid='auth-firstanswer--input']")
	private WebElement firstanswerbox;

	@FindBy(css=".auth-secondquestion.xui-text-label.xui-fieldlabel-layout")
	private WebElement secondquestion;

	@FindBy(xpath="//input[@data-automationid='auth-secondanswer--input']")
	private WebElement secondanswerbox;

	@FindBy(xpath="//*[@data-automationid='auth-submitanswersbutton']")
	private WebElement security_login;


	public void loginWithValidCredentials(String useremail,String password) throws IOException {

		driver.get(LoginURL);
		String question1="What was the name of your first pet?";
		String answer1="niku";
		String question2="What is the first name of your closest childhood friend?";
		String answer2="gargi";
		String question3="What is your dream car?";
		String answer3="mustangGT";

		try{
			log.info("Entering useremail "+useremail);
			email.sendKeys(useremail);
			log.info("Entering password XXXXXXX");
			password_x.sendKeys(password);
			log.info("Clicking on login button");
			Log_in.click();
		}catch(Exception e){
			log.error("Failed to enter crentials");
			screenshot(driver,"EnterCredentials");
			Assert.fail("Failed to enter crentials");
		}

		try{
			log.info("Clicking on use other authentication method");
			select_auth.click();
			log.info("Selecting security questions");
			Security_que.click();
			String firstquestiontext=firstquestion.getText();
			String secondquestiontext=secondquestion.getText();
			if(firstquestiontext.equalsIgnoreCase(question1)){
				log.info("Answering first question");
				firstanswerbox.sendKeys(answer1);
				log.info("Answering second question");
				if(secondquestiontext.equalsIgnoreCase(question2))
					secondanswerbox.sendKeys(answer2);
				else
					secondanswerbox.sendKeys(answer3);
			}
			if(firstquestiontext.equalsIgnoreCase(question2)){
				log.info("Answering first question");
				firstanswerbox.sendKeys(answer2);
				log.info("Answering second question");
				if(secondquestiontext.equalsIgnoreCase(question3))
					secondanswerbox.sendKeys(answer3);
				else
					secondanswerbox.sendKeys(answer1);
			}

			if(firstquestiontext.equalsIgnoreCase(question3)){
				log.info("Answering first question");
				firstanswerbox.sendKeys(answer3);
				log.info("Answering second question");
				if(secondquestiontext.equalsIgnoreCase(question1))
					secondanswerbox.sendKeys(answer1);
				else
					secondanswerbox.sendKeys(answer2);

			}
			log.info("Clicking on Login button");
			security_login.click();
		}catch(Exception e){
			log.error("Failed to answer security questions");
			screenshot(driver,"SecurityQuestion");
			Assert.fail("Failed to answer security questions");
		}
	}

}

