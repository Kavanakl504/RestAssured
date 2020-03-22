Feature: Verify all GET and POST requests
 Background: 
    Given the user sets the endpoint to "base"

Scenario: Get employee record
When user makes a get call to "endpoint" 
		| AttributType | AttributeValue             |  
		|		page			 | 1                          |  
		|  page        | 2                          | 
Then I receive valid HTTP Response 200


Scenario: Create record 
When user makes a POST call to "endpoint" 
		|  name        | job           |  
		|	Kavana			 | leader        |
Then I receive valid HTTP Response 201

	Scenario: update the created user
	When user makes a PUT request to "endpoint2" with following data
	|  name        | job           |  
	|	Kavana			 | Engineer      |
	Then I receive valid HTTP Response 200
	
	Scenario: Delete all the data 
	When 	user makes a DELETE request to "endpoint2" 
	And user validates for the content-length
	| Content-Length   | 0       |
	Then I receive valid HTTP Response 204 
	