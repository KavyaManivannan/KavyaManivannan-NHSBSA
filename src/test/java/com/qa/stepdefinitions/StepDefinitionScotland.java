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
public class StepDefinitionScotland extends Base {

	BasicDetails basicDetails;
	PartnerAndTaxBenefits partnerAndTax;
	UniversalCredit universalCredit;
	HealthCondition healthCondition;
	LiveCare liveCare;


	@Given("^I am a person from Scotland practicing GP \"([^\"]*)\" and registered dental in \"([^\"]*)\"$")
	public void i_am_a_person_from_scotland_practicing_gp_something_and_registered_dental_in_something(String gpPractice, String dentalPracticeCountry) throws Throwable {
		basicDetails = new BasicDetails();

		basicDetails.getAcceptCookies().click();
		basicDetails.getStartNow().click();


		basicDetails.getLiveinCountryScotland().click();
		basicDetails.getliveinCountryNextButton().click();

		//Highlands and Islands
		basicDetails.getLivingInHighlandsAndIslandsNo().click();
		basicDetails.getLivingInHighlandsAndIslandsNextButton().click();

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

	@When("^I am born in \"([^\"]*)\" at Scotland$")
	public void i_am_born_in_something_at_scotland(String year) throws Throwable {
		// Date of birth
		basicDetails.getDobDay().sendKeys("31");
		basicDetails.getDobMonth().sendKeys("12");

		basicDetails.getDobYear().sendKeys(year);
		basicDetails.getDobNextButton().click();

	}

	@And("^I put my circumstances into the checker tool with \"([^\"]*)\" Partner \"([^\"]*)\" TaxBenefits and \"([^\"]*)\" PaidUniversalCredit from Scotland$")
	public void i_put_my_circumstances_into_the_checker_tool_with_something_partner_something_taxbenefits_and_something_paiduniversalcredit_from_scotland(
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
					// TaxBenefits page
					for (int i = 0; i < universalCredit.getBenefitsCheckboxes().size(); i++) {
						universalCredit.getBenefitsCheckboxes().get(i).click();

						if(universalCredit.getBenefitsCheckboxes().get(i).getText().equalsIgnoreCase("Employment and Support Allowance (ESA)"))
							universalCredit.getBenefitsCheckboxes().get(i).click();						
					}
					universalCredit.getBenefitsNextButton().click();
				}
				if(paidUniversalCredit.equalsIgnoreCase("no,different benefit"))
				{// PaidUniversalCredit page
					universalCredit.getUniversalDifferentBenefit().click();
					universalCredit.getUniversalNextButton().click();

					for (int i = 0; i < universalCredit.getBenefitsCheckboxes().size(); i++) {
						if(universalCredit.getBenefitsCheckboxes().get(i).getText().equalsIgnoreCase("Employment and Support Allowance (ESA)"))
							universalCredit.getBenefitsCheckboxes().get(i).click();
	
					}
					universalCredit.getBenefitsNextButton().click();
					
					//Type of ESA
					universalCredit.getContributionESA().click();
					universalCredit.getEsaNextButton().click();

					// pregnant page
					healthCondition.getPregnantYes().click();
					healthCondition.getPregnantNextButton().click();

					// injury from armed page
					healthCondition.getInjuryYes().click();
					healthCondition.getInjuryNextButton().click();

					//Care home page
					liveCare.getLiveCareYes().click();
					liveCare.getLiveCareNextButton().click();

					//localCouncilAssessed		
					liveCare.getLocalCouncilAssessedNo().click();
					liveCare.getLocalCouncilAssessedNextButton().click();

					// savings page
					liveCare.getHaveSavingsYes().click();
					liveCare.getHaveSavingsNextButton().click();

				}


			}

		}
	}
	@Then("^I should get a result of whether I will get help or not if i am from Scotland$")
	public void i_should_get_a_result_of_whether_i_will_get_help_or_not_if_i_am_from_scotland() throws Throwable {
		// printing result in output
		System.out.println("---------------------------------------------------------------");
		System.out.println(universalCredit.getResult().getText());
		System.out.println("---------------------------------------------------------------");
	}

}
