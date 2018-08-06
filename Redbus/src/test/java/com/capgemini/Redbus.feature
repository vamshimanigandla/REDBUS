Feature: Booking Tickets 



Scenario: I want to book a Ticket 
	Given I have navigated to the Redbus Home page 
	When I enter the source,destination and date 
	When I select bus , select seat and enter the details 
	Then I should navigate to payment page 
	
	
