Feature: NHS Costs Checker for UK Citizen from England

Scenario: Submit the form with Partner, TaxBenifits and PaidUniversalCredit and verify the results (Age above 19)
Given I am a person from England practicing GP "yes" and registered dental in "England"
When I am born in "2001" at England
And I put my circumstances into the checker tool with "yes" Partner "yes" TaxBenefits and "yes" PaidUniversalCredit from England
Then I should get a result of whether I will get help or not if i am from England

Scenario: Submit the form without Partner, TaxBenifits, with some benefits and live in care home and verify the results (Age above 50)
Given I am a person from England practicing GP "no" and registered dental in "Wales"
When I am born in "1971" at England
And I put my circumstances into the checker tool with "no" Partner "no" TaxBenefits and "no,different benefit" PaidUniversalCredit from England
And I live in Care home "yes" at England
Then I should get a result of whether I will get help or not if i am from England

Scenario: Submit the form without Partner, TaxBenifits, with some benfits and not live in care home and verify the (Age below 50)
Given I am a person from England practicing GP "yes" and registered dental in "Scotland"
When I am born in "1973" at England
And I put my circumstances into the checker tool with "no" Partner "no" TaxBenefits and "no,different benefit" PaidUniversalCredit from England
And I live in Care home "no" at England
Then I should get a result of whether I will get help or not if i am from England

Scenario: Submit the form with age under 19 (no fulltime education), Partner, TaxBenifits and waiting for UniversalCredit with some benefits and verify the results (Age below 19)
Given I am a person from England practicing GP "yes" and registered dental in "England"
When I am born in "2003" at England
And I am getting fulltime education "no" at England
And I put my circumstances into the checker tool with "yes" Partner "yes" TaxBenefits and "not-yet" PaidUniversalCredit from England
Then I should get a result of whether I will get help or not if i am from England

Scenario: Submit the form with age under 19 (with fulltime education), Partner, TaxBenifits and waiting for UniversalCredit and verify the results (Age below 19)
Given I am a person from England practicing GP "yes" and registered dental in "England"
When I am born in "2003" at England
And I am getting fulltime education "yes" at England
Then I should get a result based on age of whether I will get help or not if i am from England

Scenario: Submit the form for user less than age 16 (Age below 16)
Given I am a person from England practicing GP "yes" and registered dental in "Nire"
When I am born in "2014" at England
Then I should get a result based on age of whether I will get help or not if i am from England
