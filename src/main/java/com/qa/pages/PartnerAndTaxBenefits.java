package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.Base;

public class PartnerAndTaxBenefits extends Base {

	@FindBy(css = "#label-yes")
	private WebElement partnerYes;
	
	@FindBy(css = "#label-no")
	private WebElement partnerNo;
	
	@FindBy(xpath = "//input[@value='Next']")
	private WebElement partnerNextButton;
	
	@FindBy(xpath = "//span[@class='error-message']")
	private WebElement partnerErrorMessage;
	
	@FindBy(xpath = "//input[@id='radio-yes']")
	private WebElement benefitsOrTaxCreditsYes;
	
	@FindBy(xpath = "//input[@id='radio-no']")
	private WebElement benefitsOrTaxCreditsNo;
	
	@FindBy(id = "next-button")
	private WebElement benefitsOrTaxCreditsNextButton;

	@FindBy(xpath = "//span[@class='error-message']")
	private WebElement benefitsOrTaxCreditsErrorMessage;
	
	public PartnerAndTaxBenefits() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPartnerYes() {
		return partnerYes;
	}

	public WebElement getPartnerNo() {
		return partnerNo;
	}

	public WebElement getPartnerNextButton() {
		return partnerNextButton;
	}

	public WebElement getBenefitsOrTaxCreditsYes() {
		return benefitsOrTaxCreditsYes;
	}

	public WebElement getBenefitsOrTaxCreditsNo() {
		return benefitsOrTaxCreditsNo;
	}

	public WebElement getBenefitsOrTaxCreditsNextButton() {
		return benefitsOrTaxCreditsNextButton;
	}
	

	public WebElement getPartnerErrorMessage() {
		return partnerErrorMessage;
	}

	public WebElement getBenefitsOrTaxCreditsErrorMessage() {
		return benefitsOrTaxCreditsErrorMessage;
	}
}
