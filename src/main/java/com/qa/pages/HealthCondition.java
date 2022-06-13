package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.Base;

public class HealthCondition extends Base {

	@FindBy(id = "label-yes")
	private WebElement pregnantYes;
		
	@FindBy(id = "label-yes")
	private WebElement pregnantNo;
	
	@FindBy(css = "#next-button")
	private WebElement pregnantNextButton;
	
	@FindBy(css = "span.error-message")
	private WebElement pregnantErrorMessage;
	
	@FindBy(id = "label-yes")
	private WebElement injuryYes;
	
	@FindBy(id = "label-no")
	private WebElement injuryNo;
	
	@FindBy(css = "#next-button")
	private WebElement injuryNextButton;
	
	@FindBy(css = "span.error-message")
	private WebElement injuryErrorMessage;
	
	@FindBy(css = "#label-yes")
	private WebElement diabetesYes;
	
	@FindBy(css = "#label-no")
	private WebElement diabetesNo;
	
	@FindBy(css = "#next-button")
	private WebElement diabetesNextButton;
	
	@FindBy(css = "#label-yes")
	private WebElement sugarLevelYes;
	
	@FindBy(css = "#label-no")
	private WebElement sugarLevelNo;
	
	@FindBy(css = "#next-button")
	private WebElement sugarLevelNextButton;
	
	@FindBy(css = "#label-yes")
	private WebElement medicalConditionConfirmedYes;
	
	@FindBy(css = "#label-yes")
	private WebElement medicalConditionConfirmedNo;
	
	@FindBy(css = "#next-button")
	private WebElement medicalConditionConfirmedNextButton;

	@FindBy(css = "#label-yes")
	private WebElement glucomaYes;
	
	@FindBy(css = "#label-no")
	private WebElement glucomaNo;
	
	@FindBy(css = "#next-button")
	private WebElement glucomaNextButton;
	
	public HealthCondition() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getPregnantYes() {
		return pregnantYes;
	}

	public WebElement getPregnantNo() {
		return pregnantNo;
	}

	public WebElement getPregnantNextButton() {
		return pregnantNextButton;
	}

	public WebElement getPregnantErrorMessage() {
		return pregnantErrorMessage;
	}

	public WebElement getInjuryYes() {
		return injuryYes;
	}

	public WebElement getInjuryNo() {
		return injuryNo;
	}

	public WebElement getInjuryNextButton() {
		return injuryNextButton;
	}

	public WebElement getInjuryErrorMessage() {
		return injuryErrorMessage;
	}

	public WebElement getDiabetesYes() {
		return diabetesYes;
	}

	public WebElement getDiabetesNo() {
		return diabetesNo;
	}

	public WebElement getDiabetesNextButton() {
		return diabetesNextButton;
	}

	public WebElement getSugarLevelYes() {
		return sugarLevelYes;
	}

	public WebElement getSugarLevelNo() {
		return sugarLevelNo;
	}

	public WebElement getSugarLevelNextButton() {
		return sugarLevelNextButton;
	}

	public WebElement getMedicalConditionConfirmedYes() {
		return medicalConditionConfirmedYes;
	}

	public WebElement getMedicalConditionConfirmedNo() {
		return medicalConditionConfirmedNo;
	}
	
	public WebElement getMedicalConditionConfirmedNextButton() {
		return medicalConditionConfirmedNextButton;
	}
	
	public WebElement getGlucomaYes() {
		return glucomaYes;
	}

	public WebElement getGlucomaNo() {
		return glucomaNo;
	}

	public WebElement getGlucomaNextButton() {
		return glucomaNextButton;
	}


}
