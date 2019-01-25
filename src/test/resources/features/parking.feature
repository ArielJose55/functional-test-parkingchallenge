Feature: Parking
  As a web user 
  I want to register on the page a vehicle
  and make a check-out for get the invoice

Scenario: verify the register a vehicle
    Given that I opened the browser on the vehicle registration page
	When I am going to the registration of vehicles section
	Then I check if the plate the vehicle exists
	
Scenario: register check-in of the a vehicle
	Given that I opened the browser on the vehicle list page
	When I get the list of active vehicles
	