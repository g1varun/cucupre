Feature: Person Repository_2
@Regression
  Scenario: Person Creation_2
    Given an empty repository
    When I create a new Person named 
    Then I should have Person named 
@smoke
  Scenario: Person Creation Examples_2
    Given a repository
    When I create a new Person named 
    Then I should have Person named 
