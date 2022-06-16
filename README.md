# Kavya_Manivannan-NHSBSA
Selenium-Cucumber-Java-Maven: NHS Costs Checker tool

  •	The tool is automated based on behavior driven development (BDD) approach to write automation test script.
	
  •	Screenshots for each scenario are embedded to the report.
  
Pre-Requisite:

  •	Java (preferably java 8) & Maven installed, and its respective path is configured in the system.
	
  •	Eclipse IDE to import the project
  
Running the Test in Command Line:

  •	Open the Command Prompt
	
  •	Go to the project directory from terminal and hit the following commands:
      o mvn clean (to clean the project)
			
      o	mvn compile (to compile the source code of the project)
			
      o	mvn test -Dbrowser=chrome (to run the tests in Chrome browser)
			
      o	mvn test -Dbrowser=chromeheadless (to run the tests in Chrome headless mode)
			
			o	mvn test -Dbrowser=firefox (to run the tests in Firefox browser)
      
Note:

  •	The Automation test suite is designed in a way to cover the below scenarios,
      
      o	For better understanding, feature and stepdefinition files are created separately for each countries.
      o	Below are the different combination of user inputs to check the eligibility.
          
          England: 
           o	scenario - with Partner, TaxBenifits and PaidUniversalCredit (Age above 19)
           o	scenario - without Partner, TaxBenifits, with some benefits and live in care home (Age above 50)
           o	scenario - without Partner, TaxBenifits, with some benfits and not live in care home (Age below 50)
           o	scenario - with age under 19 (no fulltime education), Partner, TaxBenifits and waiting for UniversalCredit with some benefits (Age below 19)
           o	scenario – with age under 19 (with fulltime education), Partner, TaxBenifits and waiting for UniversalCredit (Age below 19)
           o	scenario – user less than age 16 (Age below 16)
          Northern Ireland:
           o	scenario – user from Northern Ireland
          Sctoland:
           o	scenario - with Partner, TaxBenifits and PaidUniversalCredit (Age above 19)
           o	scenario - with Partner, TaxBenifits and waiting for PaidUniversalCredit with some benefits (Age above 19)
           o	scenario - with Partner, TaxBenifits and getting ESA benefits (Age above 19)
          Wales:
           o	scenario - with Partner, TaxBenifits and PaidUniversalCredit (Age below 50)
           o	scenario - without Partner, TaxBenifits, with some benfits and live in care home (Age above 50)
           
      o	Mandatory fields validation verifies that user should fill all the mandatory inputs to check the eligibility.
      o	Negative validation by providing invalid year in date of birth field.         
