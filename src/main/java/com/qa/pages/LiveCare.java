package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.Base;

public class LiveCare extends Base{
	
	@FindBy(id = "label-yes")
	private WebElement liveCareYes;
	
	@FindBy(id = "label-no")
	private WebElement liveCareNo;
	
	@FindBy(css = "#next-button")
	private WebElement liveCareNextButton;
	
	@FindBy(css = "label#label-yes")
	private WebElement localCouncilAssessedYes;
	
	@FindBy(css = "label#label-no")
	private WebElement localCouncilAssessedNo;
	
	@FindBy(css = "#next-button")
	private WebElement localCouncilAssessedNextButton;
	
	@FindBy(xpath = "//label[@id='label-yes']")
	private WebElement haveSavingsYes;
	
	@FindBy(xpath = "//label[@id='label-no']")
	private WebElement haveSavingsNo;
	
	@FindBy(xpath = "//input[@value='Next']")
	private WebElement haveSavingsNextButton;
	
	@FindBy(xpath = "//div[@class='column-two-thirds']")
	private WebElement Result;

	public LiveCare() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLiveCareYes() {
		return liveCareYes;
	}

	public WebElement getLiveCareNo() {
		return liveCareNo;
	}

	public WebElement getLiveCareNextButton() {
		return liveCareNextButton;
	}

	public WebElement getLocalCouncilAssessedYes() {
		return localCouncilAssessedYes;
	}

	public WebElement getLocalCouncilAssessedNo() {
		return localCouncilAssessedNo;
	}

	public WebElement getLocalCouncilAssessedNextButton() {
		return localCouncilAssessedNextButton;
	}

	public WebElement getHaveSavingsYes() {
		return haveSavingsYes;
	}

	public WebElement getHaveSavingsNo() {
		return haveSavingsNo;
	}

	public WebElement getHaveSavingsNextButton() {
		return haveSavingsNextButton;
	}

	public WebElement getResult() {
		return Result;
	}
}
