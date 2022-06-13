package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.Base;

public class UniversalCredit extends Base{
		
	@FindBy(css = "label[for='yes-universal']")
	private WebElement universalYes;	
	
	@FindBy(css = "label[for='not-yet']")
	private WebElement universalNotYet;
	
	@FindBy(css = "label[for='different-benefit']")
	private WebElement universalDifferentBenefit;
	
	@FindBy(id = "next-button")
	private WebElement universalNextButton;
	
	@FindBy(xpath = "//span[@class='error-message']")
	private WebElement universalErrorMessage;
	
	@FindBy(css = "label[class*='benefitOptions']")
	private List<WebElement> benefitsCheckboxes;
	
	@FindBy(css = "label[class='noneOption']")
	private WebElement benefitsNone;

	@FindBy(id = "next-button")
	private WebElement benefitsNextButton;
	
	@FindBy(css = "span.error-message")
	private WebElement benefitsErrorMessage;

	@FindBy(xpath = "//label[@for='radio-yes']")
	private WebElement universalCreditIncludePaymentsYes;
	
	@FindBy(xpath = "//label[@for='radio-no']")
	private WebElement universalCreditIncludePaymentsNo;
	
	@FindBy(xpath = "//input[@id='next-button']")
	private WebElement universalCreditIncludePaymentsNextButton;
	
	@FindBy(xpath = "//span[@class='error-message']")
	private WebElement universalCreditIncludePaymentsErrorMessage;
	
	@FindBy(xpath = "//label[@for='radio-yes']")
	private WebElement universalCreditTakeHomePayYes;
	
	@FindBy(xpath = "//label[@for='radio-no']")
	private WebElement universalCreditTakeHomePayNo;
	
	@FindBy(css = "input[value='Next']")
	private WebElement universalCreditTakeHomePayNextButton;
	
	@FindBy(xpath = "//span[@class='error-message']")
	private WebElement universalCreditTakeHomePayErrorMessage;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement waitingUniversalCreditNextButton;
	
	@FindBy(css = "label[for='workingChildTaxCredit']")
	private WebElement workingChildTaxCredit;
	
	@FindBy(css = "label[for='workingDisabilityTaxCredit']")
	private WebElement workingDisabilityTaxCredit;
	
	@FindBy(css = "label[for='childTaxCredit']")
	private WebElement childTaxCredit;
	
	@FindBy(css = "label[for='workingTaxCredit']")
	private WebElement workingTaxCredit;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement taxCreditNextButton;
	
	@FindBy(xpath = "//label[@for='income-esa']")
	private WebElement incomeESA;
	
	@FindBy(xpath = "//label[@for='contribution-esa']")
	private WebElement contributionESA;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement esaNextButton;
	
	@FindBy(xpath = "//label[@for='income-jsa']")
	private WebElement incomeJSA;
	
	@FindBy(xpath = "//label[@for='contbasejsa']")
	private WebElement contbaseJSA;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement jsaNextButton;
	
	@FindBy(xpath = "//label[@for='guaranteecreditonly']")
	private WebElement pensionGuaranteeCreditOnly;
	
	@FindBy(xpath = "//label[@for='guaranteecreditwithsavingcredit']")
	private WebElement pensionGuaranteeCreditwithSavingCredit;
	
	@FindBy(xpath = "//label[@for='savingcredit']")
	private WebElement pensionSavingCredit;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement pensionCreditNextButton;
	
	@FindBy(xpath = "//div[@class='column-two-thirds']")
	private WebElement Result;
	
	public UniversalCredit() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUniversalYes() {
		return universalYes;
	}

	public WebElement getUniversalNotYet() {
		return universalNotYet;
	}

	public WebElement getUniversalDifferentBenefit() {
		return universalDifferentBenefit;
	}

	public WebElement getUniversalNextButton() {
		return universalNextButton;
	}

	public WebElement getUniversalErrorMessage() {
		return universalErrorMessage;
	}

	public List<WebElement> getBenefitsCheckboxes() {
		return benefitsCheckboxes;
	}

	public WebElement getBenefitsNone() {
		return benefitsNone;
	}

	public WebElement getBenefitsNextButton() {
		return benefitsNextButton;
	}

	public WebElement getBenefitsErrorMessage() {
		return benefitsErrorMessage;
	}

	public WebElement getUniversalCreditIncludePaymentsYes() {
		return universalCreditIncludePaymentsYes;
	}

	public WebElement getUniversalCreditIncludePaymentsNo() {
		return universalCreditIncludePaymentsNo;
	}

	public WebElement getUniversalCreditIncludePaymentsNextButton() {
		return universalCreditIncludePaymentsNextButton;
	}

	public WebElement getUniversalCreditIncludePaymentsErrorMessage() {
		return universalCreditIncludePaymentsErrorMessage;
	}

	public WebElement getUniversalCreditTakeHomePayYes() {
		return universalCreditTakeHomePayYes;
	}

	public WebElement getUniversalCreditTakeHomePayNo() {
		return universalCreditTakeHomePayNo;
	}

	public WebElement getUniversalCreditTakeHomePayNextButton() {
		return universalCreditTakeHomePayNextButton;
	}

	public WebElement getUniversalCreditTakeHomePayErrorMessage() {
		return universalCreditTakeHomePayErrorMessage;
	}

	public WebElement getWaitingUniversalCreditNextButton() {
		return waitingUniversalCreditNextButton;
	}

	public WebElement getWorkingChildTaxCredit() {
		return workingChildTaxCredit;
	}

	public WebElement getWorkingDisabilityTaxCredit() {
		return workingDisabilityTaxCredit;
	}

	public WebElement getChildTaxCredit() {
		return childTaxCredit;
	}

	public WebElement getWorkingTaxCredit() {
		return workingTaxCredit;
	}

	public WebElement getTaxCreditNextButton() {
		return taxCreditNextButton;
	}

	public WebElement getIncomeESA() {
		return incomeESA;
	}

	public WebElement getContributionESA() {
		return contributionESA;
	}

	public WebElement getEsaNextButton() {
		return esaNextButton;
	}

	public WebElement getIncomeJSA() {
		return incomeJSA;
	}

	public WebElement getContbaseJSA() {
		return contbaseJSA;
	}

	public WebElement getJSANextButton() {
		return jsaNextButton;
	}

	public WebElement getGuaranteecreditonly() {
		return pensionGuaranteeCreditOnly;
	}

	public WebElement getGuaranteecreditwithsavingcredit() {
		return pensionGuaranteeCreditwithSavingCredit;
	}

	public WebElement getSavingcredit() {
		return pensionSavingCredit;
	}

	public WebElement getPensionCreditNextButton() {
		return pensionCreditNextButton;
	}

	public WebElement getResult() {
		return Result;
	}
}
