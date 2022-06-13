Feature: NHS Costs Checker for UK Citizen from Wales


Scenario: Submit the form with Partner, TaxBenifits and PaidUniversalCredit and verify the results (Age below 50)
Given I am a person from Wales practicing GP "yes" and registered dental in "England"
When I am born in "2001" at Wales
And I put my circumstances into the checker tool with "yes" Partner "yes" TaxBenefits and "yes" PaidUniversalCredit from Wales
Then I should get a result of whether I will get help or not if i am from Wales

Scenario: Submit the form without Partner, TaxBenifits, with some benfits and live in care home and verify the results (Age above 50)
Given I am a person from Wales practicing GP "no" and registered dental in "Wales"
When I am born in "1971" at Wales
And I put my circumstances into the checker tool with "no" Partner "no" TaxBenefits and "no" PaidUniversalCredit from Wales
And I live in Care home "yes" in Wales
Then  I should get a result of whether I will get help or not if i am from Wales