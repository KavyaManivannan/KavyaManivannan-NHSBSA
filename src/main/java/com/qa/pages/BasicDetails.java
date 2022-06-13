package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.Base;


public class BasicDetails extends Base{


	@FindBy(id = "nhsuk-cookie-banner__link_accept_analytics")
	private WebElement acceptCookies;

	@FindBy(id = "next-button" )
	private WebElement startNow;

	@FindBy(id = "label-england")
	private WebElement liveinCountryEngland;

	@FindBy(id = "label-scotland")
	private WebElement liveinCountryScotland;

	@FindBy(id = "label-wales")
	private WebElement liveinCountryWales;

	@FindBy(id = "label-nire")
	private WebElement liveinCountryNire;

	@FindBy(id = "next-button")
	private WebElement liveinCountryNextButton;

	@FindBy(css = "span.error-message")
	private WebElement countryErrorMessage;

	@FindBy(id = "label-yes)")
	private WebElement livingInHighlandsAndIslandsYes;

	@FindBy(id = "label-no")
	private WebElement livingInHighlandsAndIslandsNo;

	@FindBy(id = "next-button")
	private WebElement livingInHighlandsAndIslandsNextButton;

	@FindBy(id = "label-yes")
	private WebElement gpPracticeInScotlandOrWalesYes;

	@FindBy(id = "label-no")
	private WebElement gpPracticeInScotlandOrWalesNo;

	@FindBy(css = "#next-button")
	private WebElement gpPracticeInScotlandOrWalesNextButton;

	@FindBy(css = "span.error-message")
	private WebElement gpPracticeInScotlandOrWalesErrorMessage;

	@FindBy(xpath = "//label[@id='label-england']")
	private WebElement dentalPracticeCountryEngland;

	@FindBy(xpath = "//label[@id='label-scotland']")
	private WebElement dentalPracticeCountryScotland;

	@FindBy(xpath = "//label[@id='label-wales']")
	private WebElement dentalPracticeCountryWales;

	@FindBy(xpath = "//label[@id='label-ni']")
	private WebElement dentalPracticeCountryNire;

	@FindBy(xpath = "//label[@id='label-not-registered']")
	private WebElement dentalPracticeCountryNotRegistered;

	@FindBy(xpath = "//input[@class='button']")
	private WebElement dentalPracticeCountryNextButton;

	@FindBy(xpath = "//span[@class='error-message']")
	private WebElement dentalPracticeCountryErrorMessage;

	@FindBy(id = "dob-day")
	private WebElement dobDay;

	@FindBy(id = "dob-month")
	private WebElement dobMonth;

	@FindBy(id = "dob-year")
	private WebElement dobYear;

	@FindBy(id = "next-button")
	private WebElement dobNextButton;

	@FindBy(xpath = "//span[@class='error-message']")
	private WebElement dobErrorMessage;

	@FindBy(id = "label-yes")
	private WebElement fullTimeEducationYes;

	@FindBy(id = "label-no")
	private WebElement fullTimeEducationNo;

	@FindBy(id = "next-button")
	private WebElement fullTimeEducationNextButton;

	@FindBy(xpath = "//span[@class='error-message']")
	private WebElement fullTimeEducationbErrorMessage;
	
	@FindBy(xpath = "//div[@class='column-two-thirds']")
	private WebElement Result;

	public BasicDetails() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAcceptCookies() {
		return acceptCookies;
	}

	public WebElement getStartNow() {
		return startNow;
	}

	public WebElement getLiveinCountryEngland() {
		return liveinCountryEngland;
	}

	public WebElement getLiveinCountryScotland() {
		return liveinCountryScotland;
	}

	public WebElement getLiveinCountryWales() {
		return liveinCountryWales;
	}

	public WebElement getLiveinCountryNire() {
		return liveinCountryNire;
	}

	public WebElement getliveinCountryNextButton() {
		return liveinCountryNextButton;
	}

	public WebElement getCountryErrorMessage() {
		return countryErrorMessage;
	}

	public WebElement getGpPracticeInScotlandOrWalesYes() {
		return gpPracticeInScotlandOrWalesYes;
	}

	public WebElement getGpPracticeInScotlandOrWalesNo() {
		return gpPracticeInScotlandOrWalesNo;
	}

	public WebElement getGpPracticeInScotlandOrWalesNextButton() {
		return gpPracticeInScotlandOrWalesNextButton;
	}

	public WebElement getGpPracticeInScotlandOrWalesErrorMessage() {
		return gpPracticeInScotlandOrWalesErrorMessage;
	}

	public WebElement getDentalPracticeCountryEngland() {
		return dentalPracticeCountryEngland;
	}

	public WebElement getDentalPracticeCountryScotland() {
		return dentalPracticeCountryScotland;
	}

	public WebElement getDentalPracticeCountryWales() {
		return dentalPracticeCountryWales;
	}

	public WebElement getDentalPracticeCountryNire() {
		return dentalPracticeCountryNire;
	}

	public WebElement getDentalPracticeCountryNotRegistered() {
		return dentalPracticeCountryNotRegistered;
	}

	public WebElement getDentalPracticeCountryNextButton() {
		return dentalPracticeCountryNextButton;
	}

	public WebElement getDentalPracticeCountryErrorMessage() {
		return dentalPracticeCountryErrorMessage;
	}

	public WebElement getDobDay() {
		return dobDay;
	}

	public WebElement getDobMonth() {
		return dobMonth;
	}

	public WebElement getDobYear() {
		return dobYear;
	}

	public WebElement getDobNextButton() {
		return dobNextButton;
	}

	public WebElement getDobErrorMessage() {
		return dobErrorMessage;
	}

	public WebElement getFullTimeEducationYes() {
		return fullTimeEducationYes;
	}

	public WebElement getFullTimeEducationNo() {
		return fullTimeEducationNo;
	}

	public WebElement getLiveinCountryNextButton() {
		return liveinCountryNextButton;
	}

	public WebElement getLivingInHighlandsAndIslandsYes() {
		return livingInHighlandsAndIslandsYes;
	}

	public WebElement getLivingInHighlandsAndIslandsNo() {
		return livingInHighlandsAndIslandsNo;
	}

	public WebElement getLivingInHighlandsAndIslandsNextButton() {
		return livingInHighlandsAndIslandsNextButton;
	}

	public WebElement getFullTimeEducationNextButton() {
		return fullTimeEducationNextButton;
	}

	public WebElement getFullTimeEducationbErrorMessage() {
		return fullTimeEducationbErrorMessage;
	}
	
	public WebElement getResult() {
		return Result;
	}

}
