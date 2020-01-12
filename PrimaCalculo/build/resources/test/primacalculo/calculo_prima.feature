Feature: Prima calculate
	Calculate the prima value from customer
	
	Scenario: Calcule prima correct
		Given the age of customer is 20
			And the licence points is 30
		When the Seller calculate prima
		Then the prima value is 1350
		
	Scenario: Calcule prima incorrect
		Given the age of customer is 95
			And the licence points is 10
		When the Seller calculate prima
		Then the prima value is -1