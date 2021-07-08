Feature: User signin the facebook application
	
	Scenario: user enters the valid username and password
		Given user launches the url of the application
		When user enters  "m.msd7" as username
		And user enters "Mani1001" as password
		And user clicks the signin button
		Then user validate the login page
				