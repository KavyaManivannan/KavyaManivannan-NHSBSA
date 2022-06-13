Feature: NHS Costs Checker Error Messages Validation


Scenario: Invalid Entry in fields in the cost checker tool
Given I am a person from England validation
When I am born in validation
| 12 | 12 | 2022 |
Then I should not proceed further

Scenario: Validate the mandatory fields in the cost checker tool
Given I am a person from England validation
When I put my circumstances into the checker tool with Partner TaxBenifits and UniversalCredit validation
Then I should get a result of whether I will get help or not validation


