Feature: FB SignUp feature 

Scenario: signUp a FB 

	Given open a browser 
	Then enter name and pwd 
		|phone|pwd|
		|venkat|venkat123|
	Then enter credinatial 
		|firstname|lastname|email|password|
		|venkat|raman|venK@gmail.com|123|
		|dhaya|Karan|daya@gmail.com|123|
		|RAj|kumar|raj@gmail.com|123|
		|Thilaga|Vathi|thilaga@gmail.com|123|
	Then refresh browser 
	
Scenario: Second Class 
	Given just reEnter a name password 
		|Elumalai|Valli|
	Then adjust in a class 
	
Scenario: Third class dataDriven 

	Given navigating to sathya url 
	Then giving valied "Shalini" and "12345" 
	
Scenario Outline: outLine Testing 

	Given again navigating to sathyain 
	Then enter again "<username>" and "<password>"
	
	Examples:
	|username|password|
	|venkat|Raman|
	|Tom|Jery|
	|SecondTom|Jery|
	
	
	