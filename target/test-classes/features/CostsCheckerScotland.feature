Feature: NHS Costs Checker for UK Citizen from Scotland


Scenario: Submit the form with Partner, TaxBenifits and PaidUniversalCredit and verify the results
Given I am a person from Scotland practicing GP "yes" and registered dental in "England"
When I am born in "2001" at Scotland
And I put my circumstances into the checker tool with "yes" Partner "yes" TaxBenefits and "yes" PaidUniversalCredit from Scotland
Then I should get a result of whether I will get help or not if i am from Scotland

Scenario: Submit the form with Partner, TaxBenifits and waiting for PaidUniversalCredit with sonme benefits and verify the results
Given I am a person from Scotland practicing GP "yes" and registered dental in "Wales"
When I am born in "2001" at Scotland
And I put my circumstances into the checker tool with "yes" Partner "yes" TaxBenefits and "not-yet" PaidUniversalCredit from Scotland
Then I should get a result of whether I will get help or not if i am from Scotland

Scenario: Submit the form with Partner, TaxBenifits and getting ESA benefits and verify the results
Given I am a person from Scotland practicing GP "yes" and registered dental in "Scotland"
When I am born in "2001" at Scotland
And I put my circumstances into the checker tool with "yes" Partner "yes" TaxBenefits and "no,different benefit" PaidUniversalCredit from Scotland
Then I should get a result of whether I will get help or not if i am from Scotland
