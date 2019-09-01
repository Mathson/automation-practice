package com.testingpractice.steps;

import java.lang.management.ManagementFactory;
import java.lang.reflect.InvocationTargetException;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.TakesScreenshot;
//import org.testng.annotations.Test;

import com.testingpractice.browser.BrowserFactory;
import com.testingpractice.pageobject.pages.*;
import com.testingpractice.test.utils.*;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormatSymbols;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.junit.Test;
import com.testingpractice.test.utils.*;;




public class AccountSignUpSteps {
	
	
	WebDriver driver;
	private static Logger logger = Logger.getLogger(AccountSignUpSteps.class);
	BrowserFactory browserFactory;
	private SignUp signUp;
	String placeHolder = null;

	Date now = new Date();
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MMMM_yyyy - hh-mm-ss aa");
	String FolderName = dateFormat.format(now);

	File dir = new File(".\\Screenshots\\" + FolderName);
	File configSrc = new File(".\\Configuration\\Config.property");

	@Given("^Automation practice account  signup page with url \"(.*)\",\"(.*)\"$")
	public void SignUp(String signUpurl, String browser) throws Throwable {
		try {
			System.out.println("In File");
			DOMConfigurator.configure("log4j.xml");
			BasicConfigurator.configure();
			logger.info("Started Browser");
			if (configSrc.exists()) {
				FileInputStream configIS = new FileInputStream(configSrc);
				if (configIS.available() != 0) {
					Properties pro = new Properties();
					pro.load(configIS);
					if (signUpurl.isEmpty())
						signUpurl = pro.getProperty("practiceurl");
					logger.info("Successfully fetched the url from Configs");
				}
			}
			driver = BrowserFactory.startBrowser(browser, signUpurl);
			signUp = PageFactory.initElements(driver, SignUp.class);

		} catch (Throwable e) {

			// Answer:
			e.getCause().printStackTrace();
		}

	}

	@When("^Page successfuly opens$")
	public void verifyPageLoad() throws Throwable {

		try {
			Assert.assertEquals(driver.getTitle(), "My Store");
			signUp.clickbtSignIn();
			logger.info("BeforeHeading");
			placeHolder = signUp.getHeading();
			logger.info("AftereHeading"+placeHolder);
			//placeHolder = Common.getPlaceholderName(driver, signUp.getElementFirstName());
			Assert.assertEquals(placeHolder,"AUTHENTICATION");
			
			
		} catch (Throwable e) {
			e.getCause().printStackTrace();
		}

	}

	@Then("^user inputs signUp information$")
	public void inputSignUpDetails() throws Throwable {
		try {
			logger.info("Input SignUp Details");
			String emailCreate=null;
			Fairy fairy =  Fairy.create();
			Person person = fairy.person();
			emailCreate = person.getEmail();
			signUp.inputEmailCreate(emailCreate);
			signUp.clickbtCreateAcc();
			logger.info("Email Id" +emailCreate+ " is Valid for Register");
			placeHolder = UtilHelper.getText(driver, signUp.getElementFirstName());
			dir.mkdir();
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(dir + "\\" + "LoginOrSignUp" + ".png"));
			logger.info("Opened  SignUp or Login Page with title: " + driver.getTitle());
			
			placeHolder = signUp.getPersonalInfoHeading();
			Assert.assertEquals(placeHolder,"YOUR PERSONAL INFORMATION");
			placeHolder= signUp.getAddressHeading();
			Assert.assertEquals(placeHolder,"YOUR ADDRESS");
			

			signUp.inputFirstName(person.getFirstName());
			signUp.inputLastName(person.getLastName());
			//String email = person.getEmail();
			//signUp.inputMobEmail(person.getEmail());
			placeHolder = signUp.getEnteredEmail();
			Assert.assertEquals(placeHolder,emailCreate);
			signUp.inputPassword(person.getPassword());
			
			DateTime DOB = person.getDateOfBirth();
			String[] dobParts = (DOB.toString()).split("-");
			String dates=String.valueOf(Integer.parseInt(dobParts[2].substring(0, 2)));

			signUp.setDate(String.valueOf(Integer.parseInt(dobParts[2].substring(0, 2))));
			String monthString = new DateFormatSymbols().getMonths()[Integer.parseInt(dobParts[1]) - 1];
			logger.info("Month selected is"+Integer.parseInt(dobParts[1]));
			signUp.setMonth(Integer.parseInt(dobParts[1]));
			signUp.setYear(dobParts[0]);
			signUp.inputAddrFirstName(person.getFirstName());
			signUp.inputAddrLastName(person.getLastName());
			signUp.inputAddrCompany(person.getCompany().getName());
			signUp.inputAddress(person.getAddress().getAddressLine1());
			signUp.inputAddrCity(person.getAddress().getCity());
			signUp.setState("2");
			signUp.inputAddrPostCode(person.getAddress().getPostalCode());
		    placeHolder =signUp.returnCountry();
		    Assert.assertEquals(placeHolder,"United States");
			signUp.inputAddrMobile(person.getTelephoneNumber());
			scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File(dir + "\\" + "TestingPractice_SignUpDetails" + ".png"));
			signUp.clickbtSignUp();
			logger.info("User "+person.getFirstName() + " " + person.getLastName()+" successfully Registered");
			
			driver.close();
			Runtime.getRuntime().exec("taskkill /im chromedriver.exe /f");
			Thread.sleep(3000);
		} catch (Throwable e) {

			e.getCause().printStackTrace();
		}
	}
	

	@Then("^user inputs invalid email information$")
	public void inputInvalidEmailDetails() throws Throwable {
		try {
			signUp.inputEmailCreate("dsdd");
			signUp.clickbtCreateAcc();
			if(signUp.verifyEmailCreate())
					logger.info("Invalid Email Id Verification successful");
			driver.close();
				   
		} catch (Throwable e) {

			e.getCause().printStackTrace();
		}
	}
		}

