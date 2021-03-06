package com.xero.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseUtility{
	public static Logger log=LogManager.getLogger(BaseUtility.class.getName());

	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException,InterruptedException {
		try{
			System.out.println("----------Starting browser----------");
			if(System.getProperty("browser").contains("chrome")){
				log.info("Browser: Chrome");
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir")+"\\resources\\chromedriver.exe");

				driver=new ChromeDriver();
				driver.manage().window().maximize();
			}
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}catch(Exception e){
			log.error("Incorrect command. Please run command: mvn test -Dbrowser=chrome");
			Assert.fail("Incorrect command. Please run command: mvn test -Dbrowser=chrome");
		}

		return driver;
	}

	public void screenshot(WebDriver driver,String name) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+"_screenshot.png"));
	}
	public void TearDown(WebDriver driver) throws IOException {
		System.out.println("----------Closing browser----------");
		driver.quit();
	}

}
