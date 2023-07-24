#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

	 
	@1CreateDataN
	 Scenario: User is trying to create an assignment with missing data
	 Given User creates POST Request for the LMS API endpoint
	 When User sends request Body from excel with missing data
   Then User gets cannot create in response
	
   @2GetDataByAssignmentIdN
 	 Scenario: User is trying to extract data by non-existing assignment id
 	  Given User creates GET Request for the LMS API endpoint 
    When User calls the payload API with get request by assignmentId
    Then User gets not found in response

 	@3GetDataByBatchIdN
  Scenario: User is trying to extract data by non-existing batch id
   	Given User creates GET Request for the LMS API endpoint 
    When User calls the payload API with get request by wrong batchId
    Then User gets not found in response
    
   @4UpdateDataByAssignmentIdN
	Scenario: User is trying to update an assignment with missing data
		Given User creates PUT Request for the LMS API endpoint
    When User calls the payload API with put request by assignmentId with missing data
    Then Assignment does not get updated   
    
   @5DeleteDataByAssignmentIdN
	 Scenario: User is trying to delete an assignment with non-existent id
	 	Given User creates DELETE Request for the LMS API endpoint 
    When User calls the payload API with delete request by non-existent assignmentId
    Then Assignment does not get deleted  