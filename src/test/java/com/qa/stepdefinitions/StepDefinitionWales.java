package com.qa.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
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
public class StepDefinitionWales extends Base {

	BasicDetails basicDetails;
	PartnerAndTaxBenefits partnerAndTax;
	UniversalCredit universalCredit;
	HealthCondition healthCondition;
	LiveCare liveCare;

	@Given("^I am a person from Wales practicing GP \"([^\"]*)\" and registered dental in \"([^\"]*)\"$")
	public void i_am_a_person_from_wales_practicing_gp_something_and_registered_dental_in_something(String gpPractice, String dentalPracticeCountry) throws Throwable {

		basicDetails = new BasicDetails();

		basicDetails.getAcceptCookies().click();
		basicDetails.getStartNow().click();

		basicDetails.getLiveinCountryWales().click();	
		basicDetails.getliveinCountryNextButton().click();

		if(gpPractice.equalsIgnoreCase("yes"))
			basicDetails.getGpPracticeInScotlandOrWalesYes().click();
		if(gpPractice.equalsIgnoreCase("no"))
			basicDetails.getGpPracticeInScotlandOrWalesNo().click();
		basicDetails.getGpPracticeInScotlandOrWalesNextButton().click();

		//DentalPractice		
		if(dentalPracticeCountry.equalsIgnoreCase("England"))
			basicDetails.getDentalPracticeCountryEngland().click();

		else if(dentalPracticeCountry.equalsIgnoreCase("Wales"))
			basicDetails.getDentalPracticeCountryWales().click();

		else if(dentalPracticeCountry.equalsIgnoreCase("Scotland"))
			basicDetails.getDentalPracticeCountryScotland().click();

		else if(dentalPracticeCountry.equalsIgnoreCase("Nire"))
			basicDetails.getDentalPracticeCountryNire().click();	
		basicDetails.getDentalPracticeCountryNextButton().click();

	}

	 @When("^I am born in \"([^\"]*)\" at Wales$")
	    public void i_am_born_in_something_at_wales(String year) throws Throwable {
		// Date of birth
		basicDetails.getDobDay().sendKeys("31");
		basicDetails.getDobMonth().sendKeys("12");

		int birthYear = Integer.parseInt(year);

		if(birthYear<=2003)
		{
			basicDetails.getDobYear().sendKeys(year);
			basicDetails.getDobNextButton().click();

			//checks the full time education condition

		}
		else
		{	
			basicDetails.getDobYear().sendKeys(year);
			basicDetails.getDobNextButton().click();
		}
	}


	 @And("^I put my circumstances into the checker tool with \"([^\"]*)\" Partner \"([^\"]*)\" TaxBenefits and \"([^\"]*)\" PaidUniversalCredit from Wales$")
	    public void i_put_my_circumstances_into_the_checker_tool_with_something_partner_something_taxbenefits_and_something_paiduniversalcredit_from_wales(
			String partner, String taxBenefits, String paidUniversalCredit) throws Throwable {

		partnerAndTax = new PartnerAndTaxBenefits();
		universalCredit = new UniversalCredit();
		healthCondition = new HealthCondition();
		liveCare = new LiveCare();

		// scenario - with partner, tax benefits and with & without universal credit
		if (partner.equalsIgnoreCase("yes") && (taxBenefits.equalsIgnoreCase("yes"))) {

			partnerAndTax.getPartnerYes().click();
			partnerAndTax.getPartnerNextButton().click();

			partnerAndTax.getBenefitsOrTaxCreditsYes().click();
			partnerAndTax.getBenefitsOrTaxCreditsNextButton().click();

			if (paidUniversalCredit.equalsIgnoreCase("yes")) {

				// PaidUniversalCredit page
				universalCredit.getUniversalYes().click();
				universalCredit.getUniversalNextButton().click();

				// UniversalCreditIncludePayments page
				universalCredit.getUniversalCreditIncludePaymentsYes().click();
				universalCredit.getUniversalCreditIncludePaymentsNextButton().click();

				// UniversalCreditTakeHomePay page
				universalCredit.getUniversalCreditTakeHomePayYes().click();
				universalCredit.getUniversalCreditTakeHomePayNextButton().click();
			} else {

				if(paidUniversalCredit.equalsIgnoreCase("not-yet"))
				{// PaidUniversalCredit page
					universalCredit.getUniversalNotYet().click();
					universalCredit.getWaitingUniversalCreditNextButton().click();

					//WaitingUniversalCredit
					universalCredit.getWaitingUniversalCreditNextButton().click();
				}
				if(paidUniversalCredit.equalsIgnoreCase("no,different benefit"))
				{// PaidUniversalCredit page
					universalCredit.getUniversalDifferentBenefit().click();
					universalCredit.getUniversalNextButton().click();
				}
				// TaxBenefits page
				for (int i = 0; i < universalCredit.getBenefitsCheckboxes().size(); i++) {
					universalCredit.getBenefitsCheckboxes().get(i).click();

					if(universalCredit.getBenefitsCheckboxes().get(i).getText().equalsIgnoreCase("Jobseeker's Allowance (JSA)"))
						universalCredit.getBenefitsCheckboxes().get(i).click();
				}
				universalCredit.getBenefitsNextButton().click();
			}
		}
		// scenario - without partner, tax benefits
		else if (partner.equalsIgnoreCase("no") && (taxBenefits.equalsIgnoreCase("no")))

		{
			// partner page
			partnerAndTax.getPartnerNo().click();
			partnerAndTax.getPartnerNextButton().click();

			// BenefitsOrTaxCredits page
			partnerAndTax.getBenefitsOrTaxCreditsNo().click();
			partnerAndTax.getBenefitsOrTaxCreditsNextButton().click();

			// pregnant page
			healthCondition.getPregnantYes().click();
			healthCondition.getPregnantNextButton().click();

			// injury from armed page
			healthCondition.getInjuryYes().click();
			healthCondition.getInjuryNextButton().click();

			// diabetes page
			healthCondition.getDiabetesYes().click();
			healthCondition.getDiabetesNextButton().click();

			// glucoma page
			healthCondition.getGlucomaYes().click();
			healthCondition.getGlucomaNextButton().click();
		}
	}

	@And("^I live in Care home \"([^\"]*)\" in Wales$")
    public void i_live_in_care_home_something_in_wales(String strArg1) throws Throwable {

		// scenario - if you live in Care home
		if (strArg1.equalsIgnoreCase("yes"))
		{
			liveCare.getLiveCareYes().click();
			liveCare.getLiveCareNextButton().click();
			
			//localCouncilAssessed		
			liveCare.getLocalCouncilAssessedYes().click();
			liveCare.getLocalCouncilAssessedNextButton().click();
		}

		// scenario - if you are not living in Care home
		else{
			liveCare.getLiveCareNo().click();	
			liveCare.getLiveCareNextButton().click();
			
			// savings page
			liveCare.getHaveSavingsYes().click();
			liveCare.getHaveSavingsNextButton().click();
		}


		
	}

	@Then("^I should get a result of whether I will get help or not if i am from Wales$")
    public void i_should_get_a_result_of_whether_i_will_get_help_or_not_if_i_am_from_wales() throws Throwable {
		// printing result in output
		System.out.println("---------------------------------------------------------------");
		System.out.println(universalCredit.getResult().getText());
		System.out.println("---------------------------------------------------------------");
	}


}
