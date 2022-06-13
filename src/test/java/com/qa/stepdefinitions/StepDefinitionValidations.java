package com.qa.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import com.qa.pages.HealthCondition;
import com.qa.pages.LiveCare;
import com.qa.pages.PartnerAndTaxBenefits;
import com.qa.pages.BasicDetails;
import com.qa.pages.UniversalCredit;
import com.qa.utils.Base;

@RunWith(Cucumber.class)
public class StepDefinitionValidations extends Base {

	BasicDetails basicDetails;
	PartnerAndTaxBenefits partnerAndTax;
	UniversalCredit universalCredit;
	HealthCondition healthCondition;
	LiveCare liveCare;

	@Given("^I am a person from England validation$")
	public void i_am_a_person_from_england_validation() throws Throwable {
		basicDetails = new BasicDetails();

		//cookies
		basicDetails.getAcceptCookies().click();
		basicDetails.getStartNow().click();

		//Country page error message
		basicDetails.getliveinCountryNextButton().click();
		Assert.assertEquals(basicDetails.getCountryErrorMessage().getText(), "Select the country you live in");
		basicDetails.getLiveinCountryEngland().click();	
		basicDetails.getliveinCountryNextButton().click();

		//GP Practice page error message
		basicDetails.getGpPracticeInScotlandOrWalesNextButton().click();
		Assert.assertEquals(basicDetails.getGpPracticeInScotlandOrWalesErrorMessage().getText(), "Select 'yes' if your GP practice is in Scotland or Wales");
		basicDetails.getGpPracticeInScotlandOrWalesYes().click();
		basicDetails.getGpPracticeInScotlandOrWalesNextButton().click();

		//
		basicDetails.getDentalPracticeCountryNextButton().click();
		Assert.assertEquals(basicDetails.getDentalPracticeCountryErrorMessage().getText(), "Select which country your dental practice is in");
		basicDetails.getDentalPracticeCountryEngland().click();
		basicDetails.getDentalPracticeCountryNextButton().click();

	}

	@When("^I am born in validation$")
	public void i_am_born_in_validation(DataTable data) throws Throwable {
		List<List<String>> obj = data.asLists();
		basicDetails.getDobDay().sendKeys(obj.get(0).get(0));
		basicDetails.getDobMonth().sendKeys(obj.get(0).get(1));
		basicDetails.getDobYear().sendKeys(obj.get(0).get(2));
		basicDetails.getDobNextButton().click();
	}

	@When("^I put my circumstances into the checker tool with Partner TaxBenifits and UniversalCredit validation$")
	public void i_put_my_circumstances_into_the_checker_tool_with_partner_taxbenifits_and_universalcredit_validation() throws Throwable {

		partnerAndTax = new PartnerAndTaxBenefits();
		universalCredit = new UniversalCredit();


		//Date of birth error message
		basicDetails.getDobNextButton().click();
		Assert.assertEquals(basicDetails.getDobErrorMessage().getText(), "Enter your date of birth");
		basicDetails.getDobDay().sendKeys("02");
		basicDetails.getDobMonth().sendKeys("09");
		basicDetails.getDobYear().sendKeys("1994");
		basicDetails.getDobNextButton().click();

		//partner error message
		partnerAndTax.getPartnerNextButton().click();
		Assert.assertEquals(partnerAndTax.getPartnerErrorMessage().getText(), "Select 'yes' if you live with a partner");
		partnerAndTax.getPartnerYes().click();
		partnerAndTax.getPartnerNextButton().click();

		//BenefitsOrTaxCredits error message
		partnerAndTax.getBenefitsOrTaxCreditsNextButton().click();
		Assert.assertEquals(partnerAndTax.getBenefitsOrTaxCreditsErrorMessage().getText(), "Select 'yes' if you or your partner are claiming any benefits or tax credits");
		partnerAndTax.getBenefitsOrTaxCreditsYes().click();
		partnerAndTax.getBenefitsOrTaxCreditsNextButton().click();

		//PaidUniversalCredit error message
		universalCredit.getUniversalNextButton().click();
		Assert.assertEquals(universalCredit.getUniversalErrorMessage().getText(), "Select 'yes' if you or your partner get paid Universal Credit");
		universalCredit.getUniversalYes().click();
		universalCredit.getUniversalNextButton().click();

		//UniversalCreditIncludePayments error message
		universalCredit.getUniversalCreditIncludePaymentsNextButton().click();
		Assert.assertEquals(universalCredit.getUniversalCreditIncludePaymentsErrorMessage().getText(), "Select 'yes' if your Universal Credit includes payments for a child or disability");
		universalCredit.getUniversalCreditIncludePaymentsYes().click();
		universalCredit.getUniversalCreditIncludePaymentsNextButton().click();

		//UniversalCreditTakeHomePay error message
		universalCredit.getUniversalCreditTakeHomePayNextButton().click();
		Assert.assertEquals(universalCredit.getUniversalCreditTakeHomePayErrorMessage().getText(), "Select 'yes' if you or your partner's take-home pay was this amount or less");
		universalCredit.getUniversalCreditTakeHomePayYes().click();
		universalCredit.getUniversalCreditTakeHomePayNextButton().click();
	}

	@Then("^I should get a result of whether I will get help or not validation$")
	public void i_should_get_a_result_of_whether_i_will_get_help_or_not_validation() throws Throwable {

		//printing result in output
		System.out.println("---------------------------------------------------------------");
		System.out.println(universalCredit.getResult().getText());
		System.out.println("---------------------------------------------------------------");
	}

	@Then("^I should not proceed further$")
	public void i_should_not_proceed_further() throws Throwable {
		//date or year invalid
		Assert.assertEquals(basicDetails.getDobErrorMessage().getText(), "Your date of birth must be in the past");
	}
}
