package com.xero.pageobject;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xero.utilities.BaseUtility;

public class XeroLoginPage{
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


	public void loginWithValidCredentials(String useremail,String password) {

		driver.get(LoginURL);
		email.sendKeys(useremail);
		password_x.sendKeys(password);
		Log_in.click();

		select_auth.click();
		Security_que.click();
		String firstquestiontext=firstquestion.getText();
		String secondquestiontext=secondquestion.getText();


		if(firstquestiontext.equalsIgnoreCase("What was the name of your first pet?")){
			firstanswerbox.sendKeys("niku");
			if(secondquestiontext.equalsIgnoreCase("What is the first name of your closest childhood friend?"))
				secondanswerbox.sendKeys("gargi");
			else
				secondanswerbox.sendKeys("mustangGT");
		}
		if(firstquestiontext.equalsIgnoreCase("What is the first name of your closest childhood friend?")){
			firstanswerbox.sendKeys("gargi");
			if(secondquestiontext.equalsIgnoreCase("What was the name of your first pet?"))
				secondanswerbox.sendKeys("niku");
			else
				secondanswerbox.sendKeys("mustangGT");
		}
		if(firstquestiontext.equalsIgnoreCase("What is your dream car?")){
			firstanswerbox.sendKeys("mustangGT");
			if(secondquestiontext.equalsIgnoreCase("What was the name of your first pet?"))
				secondanswerbox.sendKeys("niku");
			else
				secondanswerbox.sendKeys("gargi");

		}
		security_login.click();

	}

}

