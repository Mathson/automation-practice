package com.testingpractice.pageobject.pages;

import static org.junit.Assert.assertThat;

import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.testingpractice.test.utils.*;

public class SignUp {

	WebDriver driver;
	
	int timeOut = 60;

	public SignUp(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath="//a[@title='Log in to your customer account']")	
	WebElement lnkSignIn;
	
	@FindBy(xpath = "//div[@class='center_column col-xs-12 col-sm-12']/h1")
	WebElement hdCreateAccount;
	
	public String getHeading() {
		return hdCreateAccount.getText();
	}
	
	@FindBy(name = "email_create")
	WebElement txtEmailCreate;
	
	public void inputEmailCreate(String email) {
		UtilHelper.waitforElementVisible(driver, txtEmailCreate);
		txtEmailCreate.sendKeys(email);

	}

	@FindBy(xpath = "//button[@name='SubmitCreate']")
	WebElement btCreateAcc;
	
	public void clickbtCreateAcc() {
		btCreateAcc.click();
	}
	
	@FindBy(xpath = "//form/div[1][@class='account_creation']/h3")
	WebElement hdPersonalInfo;
	
	public String getPersonalInfoHeading() {
		return hdPersonalInfo.getText();
	}
	
	@FindBy(xpath = "//form/div[2][@class='account_creation']/h3")
	WebElement hdAddressInfo;
	
	public String getAddressHeading() {
		return hdAddressInfo.getText();
	}
	
	@FindBy(name = "email")
	WebElement txtEmail;
	
	public String getEnteredEmail() {
		return txtEmail.getAttribute("value");
	}
	

	
	@FindBy(name = "customer_firstname")
	WebElement txtUserFirstName;

	public WebElement getElementFirstName() {
		return txtUserFirstName;
	}

	public void inputFirstName(String firstName) {
		UtilHelper.waitforElementVisible(driver, txtUserFirstName);
		txtUserFirstName.sendKeys(firstName);

	}

	@FindBy(name = "customer_lastname")
	WebElement txtUserLastName;

	public WebElement getElementLastName() {
		return txtUserLastName;
	}

	public void inputLastName(String lastName) {
		UtilHelper.waitforElementVisible(driver, txtUserLastName);
		txtUserLastName.sendKeys(lastName);

	}

	@FindBy(name = "phone_mobile")
	WebElement txtMob;

	public String getElementMob() {
		return txtMob.getText();
	}
	public void inputAddrMobile(String mob) {
		UtilHelper.waitforElementVisible(driver, txtMob);
		txtMob.sendKeys(mob);

	}

	@FindBy(name = "firstname")
	WebElement txtAddrFirstName;

	public WebElement getAddrFirstName() {
		return txtAddrFirstName;
	}
	public void inputAddrFirstName(String firstName) {
		UtilHelper.waitforElementVisible(driver, txtUserFirstName);
		txtUserFirstName.sendKeys(firstName);

	}
	
	@FindBy(name = "lastname")
	WebElement txtAddrLastName;

	public WebElement getAddrLastName() {
		return txtAddrLastName;
	}
	
	public void inputAddrLastName(String lastName) {
		UtilHelper.waitforElementVisible(driver, txtUserLastName);
		txtAddrLastName.sendKeys(lastName);

	}
	
	@FindBy(name = "company")
	WebElement txtAddrCompany;

	public WebElement getAddrComapny() {
		return txtAddrCompany;
	}
	public void inputAddrCompany(String company) {
		UtilHelper.waitforElementVisible(driver, txtAddrCompany);
		txtAddrCompany.sendKeys(company);

	}
	
	@FindBy(xpath = "//input[@name='address1']")
WebElement txtAddr;

public WebElement getElementAddr() {
	return txtAddr;
}

public void inputAddress(String addr) {
	UtilHelper.waitforElementVisible(driver, txtAddr);
	txtAddr.sendKeys(addr);

}	
	
	@FindBy(name = "city")
	WebElement txtAddrCity;

	public WebElement getAddrCity() {
		return txtAddrCity;
	}
	public void inputAddrCity(String city) {
		UtilHelper.waitforElementVisible(driver, txtAddrCity);
		txtAddrCity.sendKeys(city);

	}
	
	
	@FindBy(xpath = "//select[@name='id_state']")
	WebElement selState;


	public void setState(String sState) {
		//Common.waitforElementVisible(driver, selState);
		Select state = new Select(selState);
		state.selectByValue(sState);

	}

	@FindBy(xpath = "//select[@name='id_country']")
	WebElement selCountry;
	public String  returnCountry() {
		//Common.waitforElementVisible(driver, selCountry);
		Select country = new Select(selCountry);
		WebElement option =country.getFirstSelectedOption();
		return (option.getText());

	}

	@FindBy(name = "postcode")
	WebElement txtPostCode;

	public WebElement getAddrPostCode() {
		return txtPostCode;
	}
	public void inputAddrPostCode(String code) {
		UtilHelper.waitforElementVisible(driver, txtPostCode);
		txtPostCode.sendKeys(code);

	}
	

	@FindBy(xpath = "//input[@name='passwd']")
	WebElement txtPwd;

	public WebElement getElementPassw() {
		return txtPwd;
	}

	public void inputPassword(String newPwd) {
		UtilHelper.waitforElementVisible(driver, txtPwd);
		txtPwd.sendKeys(newPwd);

	}

	@FindBy(xpath = "//select[@name='days']")
	WebElement selDate;

	
	public void setDate(String sDate) {
		//Common.waitforElementVisible(driver, selDate);
		Select date = new Select(selDate);
		date.selectByIndex(Integer.parseInt(sDate));

	}
	@FindBy(xpath = "//select[@name='months']")
	WebElement selMon;
	
	public void setMonth(Integer sMonth) {
		//Common.waitforElementVisible(driver, selMon);
		Select date = new Select(selMon);
		date.selectByValue(sMonth.toString());

	}

	@FindBy(xpath = "//select[@name='years']")
	WebElement selYear;

	public void setYear(String sYear) {
		//Common.waitforElementVisible(driver, selYear);
		Select date = new Select(selYear);
		date.selectByValue(sYear);

	}
	

	@FindBy(xpath = "//button[@name='submitAccount']")
	WebElement btSignUp;
	
	public void clickbtSignIn() {
		lnkSignIn.click();
	}
	

	public void clickbtSignUp() {
		btSignUp.click();
	}

	@FindBy(xpath = "//div[text()='Create a new account']")
	WebElement txtNewAcc;
	
	
	//Invalid email address.
	
	public boolean verifyEmailCreate() {
	
		WebElement errorTag= driver.findElement(By.xpath("//div[@id='create_account_error']/ol"));
		List<WebElement> errorList=errorTag.findElements(By.tagName("li"));
		Assert.assertEquals(errorList.size(), 1);
		for (WebElement li : errorList) {
				Assert.assertEquals(li.getText(),"Invalid email address.");
				return true;
			   }
		return false;
	}
	


}
