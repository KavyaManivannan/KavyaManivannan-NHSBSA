package com.qa.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;
import com.qa.pages.HealthCondition;
import com.qa.pages.LiveCare;
import com.qa.pages.PartnerAndTaxBenefits;
import com.qa.pages.BasicDetails;
import com.qa.pages.UniversalCredit;
import com.qa.utils.Base;

@RunWith(Cucumber.class)
public class StepDefinitionNire extends Base {

	BasicDetails basicDetails;
	PartnerAndTaxBenefits partnerAndTax;
	UniversalCredit universalCredit;
	HealthCondition healthCondition;
	LiveCare liveCare;

	@Given("^I am a person from Nire$")
    public void i_am_a_person_from_nire() throws Throwable {
		basicDetails = new BasicDetails();

		basicDetails.getAcceptCookies().click();
		basicDetails.getStartNow().click();

		basicDetails.getLiveinCountryNire().click();	
		basicDetails.getliveinCountryNextButton().click();
	}

	@Then("^I am not able to use the service if i am from Nire$")
	public void i_am_not_able_to_use_the_service_if_i_am_from_nire() throws Throwable {

		//printing result in output
		System.out.println("---------------------------------------------------------------");
		System.out.println(basicDetails.getResult().getText());
		System.out.println("---------------------------------------------------------------");
	}

}
