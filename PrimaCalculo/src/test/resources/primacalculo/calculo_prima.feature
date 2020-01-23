Feature: Prima calculate
	Calculate the prima value from customer
	
	Scenario: Calcule prima correct
		Given the age of customer is 66
			And the licence points is 30
		When the Seller calculate prima
		Then the prima value is 550
		
	Scenario: Calcule prima correct without reduction
		Given the age of customer is 68
			And the licence points is 25
		When the Seller calculate prima
		Then the prima value is 750
		
	Scenario: Calcule prima incorrect
		Given the age of customer is 95
			And the licence points is 10
		When the Seller calculate prima
		Then the prima value is -1
