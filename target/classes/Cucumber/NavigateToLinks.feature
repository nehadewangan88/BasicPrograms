
@tag
Feature: Navigate to all Links in left panel
  I want to use this template for my feature file

	Background:
	Given  I landed on OrangeHRM Login Page
	
  @tag1
  Scenario Outline: Click on all the links.
    Given I Logged into the application with <username> and <password>
    When I click on <links>
    Then page is loaded successfully
    And application is closed
    

    Examples: 
      | username  | password | links |
      | Admin     | admin123 | Admin |
      | Admin     | admin123 | PIM |
      | Admin     | admin123 | Leave |
      | Admin     | admin123 | Time |
      | Admin     | admin123 | Recruitment |