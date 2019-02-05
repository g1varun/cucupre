Feature: Person Repository
@Regression
  Scenario: Person Creation
    Given an empty repository
    When I create a new Person named 
    Then I should have Person named 
@smoke
  Scenario: Person Creation Examples
    Given a repository
    When I create a new Person named 
    Then I should have Person named 
